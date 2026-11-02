import argparse
import datetime
import json
import urllib.request

handle = "srcode19"
url = f"https://codeforces.com/api/user.status?handle={handle}&from=1&count=1000"

ist_tz = datetime.timezone(datetime.timedelta(hours=5, minutes=30))


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
        print(
            f"{'Row': <5} | {'ID': <12} | {'Problem': <35} | {'Verdict': <20} |"
            f" {'Language': <15} | {'Time (IST)'}"
        )
        print("-" * 112)

        match_count = 0
        for s in data.get("result", []):
          sub_dt = datetime.datetime.fromtimestamp(
              s["creationTimeSeconds"], tz=ist_tz
          )
          prob_info = s["problem"]
          contest_id = prob_info.get("contestId")

          if sub_dt.date() != args.target_date:
            continue
          if args.start_contest is not None and args.end_contest is not None:
            if contest_id is None or not (
                args.start_contest <= contest_id <= args.end_contest
            ):
              continue

          match_count += 1
          sub_id = s["id"]
          prob_name = (
              f"{contest_id}{prob_info['index']} - {prob_info['name']}"
          )[:33]
          verdict = s.get("verdict", "IN_QUEUE")
          lang = s["programmingLanguage"]
          sub_date = sub_dt.strftime("%Y-%m-%d %H:%M:%S")

          print(
              f"{match_count: <5} | {sub_id: <12} | {prob_name: <35} | {verdict: <20} |"
              f" {lang: <15} | {sub_date}"
          )

        if match_count == 0:
          print(f"No submissions found for {args.target_date} in IST.")
      else:
        print("API Error:", data.get("comment"))

  except Exception as e:
    print("Failed to fetch data:", e)


if __name__ == "__main__":
  main()
