import argparse
import datetime
import json
import urllib.request

handle = "srcode19"
url = f"https://codeforces.com/api/user.status?handle={handle}&from=1&count=1000"

ist_tz = datetime.timezone(datetime.timedelta(hours=5, minutes=30))


def format_table(headers, rows):
  widths = [
      max([len(header)] + [len(str(row[index])) for row in rows])
      for index, header in enumerate(headers)
  ]
  print(
      " | ".join(
          f"{header:<{widths[index]}}" for index, header in enumerate(headers)
      )
  )
  print("-+-".join("-" * width for width in widths))
  for row in rows:
    print(
        " | ".join(
            f"{str(value):<{widths[index]}}"
            for index, value in enumerate(row)
        )
    )


def format_ist_timestamp(timestamp):
  if timestamp is None:
    return "N/A"
  return datetime.datetime.fromtimestamp(
      timestamp, tz=ist_tz
  ).strftime("%Y-%m-%d %H:%M:%S")


def parse_args(argv=None):
  parser = argparse.ArgumentParser(
      description="List Codeforces submissions for a date and contest range."
  )
  parser.add_argument(
      "target_date",
      nargs="?",
      type=datetime.date.fromisoformat,
      default=datetime.datetime.now(ist_tz).date(),
      help="date to match in IST (YYYY-MM-DD; defaults to today)",
  )
  parser.add_argument(
      "start_contest",
      nargs="?",
      type=int,
      help="first contest ID to include (must be used with end_contest)",
  )
  parser.add_argument(
      "end_contest",
      nargs="?",
      type=int,
      help="last contest ID to include (must be used with start_contest)",
  )
  args = parser.parse_args(argv)

  if (args.start_contest is None) != (args.end_contest is None):
    parser.error("start_contest and end_contest must be provided together")
  if args.start_contest is not None and args.end_contest is not None and (
      args.start_contest < 1 or args.end_contest < args.start_contest
  ):
    parser.error(
        "contest IDs must be positive and the end must not precede the start"
    )

  return args


def main(argv=None):
  args = parse_args(argv)

  try:
    with urllib.request.urlopen(url) as response:
      data = json.loads(response.read().decode("utf-8"))

      if data["status"] == "OK":
        headers = [
            "Row",
            "ID",
            "Submission Contest ID",
            "Time (IST, UTC+05:30)",
            "Relative Time (s)",
            "Problem Contest ID",
            "Index",
            "Problem",
            "Type",
            "Points",
            "Rating",
            "Tags",
            "Author Contest ID",
            "Participant ID",
            "Members",
            "Participant Type",
            "Ghost",
            "Contest Start (IST, UTC+05:30)",
            "Language",
            "Verdict",
            "Testset",
            "Passed Tests",
            "Time (ms)",
            "Memory (bytes)",
        ]
        rows = []
        for s in data.get("result", []):
          sub_dt = datetime.datetime.fromtimestamp(
              s["creationTimeSeconds"], tz=ist_tz
          )
          problem = s.get("problem", {})
          author = s.get("author", {})
          contest_id = problem.get("contestId")

          if sub_dt.date() != args.target_date:
            continue
          if args.start_contest is not None and args.end_contest is not None:
            if contest_id is None or not (
                args.start_contest <= contest_id <= args.end_contest
            ):
              continue

          members = ", ".join(
            member.get("handle", "N/A")
            for member in author.get("members", [])
          )
          rows.append(
            [
                len(rows) + 1,
                s.get("id", "N/A"),
                s.get("contestId", "N/A"),
                sub_dt.strftime("%Y-%m-%d %H:%M:%S"),
                s.get("relativeTimeSeconds", "N/A"),
                contest_id if contest_id is not None else "N/A",
                problem.get("index", "N/A"),
                problem.get("name", "N/A"),
                problem.get("type", "N/A"),
                problem.get("points", "N/A"),
                problem.get("rating", "N/A"),
                ", ".join(problem.get("tags", [])) or "N/A",
                author.get("contestId", "N/A"),
                author.get("participantId", "N/A"),
                members or "N/A",
                author.get("participantType", "N/A"),
                author.get("ghost", "N/A"),
                format_ist_timestamp(author.get("startTimeSeconds")),
                s.get("programmingLanguage", "N/A"),
                s.get("verdict", "IN_QUEUE"),
                s.get("testset", "N/A"),
                s.get("passedTestCount", "N/A"),
                s.get("timeConsumedMillis", "N/A"),
                s.get("memoryConsumedBytes", "N/A"),
            ]
          )

        format_table(headers, rows)
        if not rows:
          print(f"No submissions found for {args.target_date} in IST.")
      else:
        print("API Error:", data.get("comment"))

  except Exception as e:
    print("Failed to fetch data:", e)


if __name__ == "__main__":
  main()
