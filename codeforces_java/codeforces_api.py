import datetime
import json
import urllib.request

handle = "srcode19"
url = f"https://codeforces.com/api/user.status?handle={handle}&from=1&count=1000"

target_date = "2026-10-27"  # Target date in IST

# Define IST timezone (UTC + 5:30)
ist_tz = datetime.timezone(datetime.timedelta(hours=5, minutes=30))

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
        # Convert UTC epoch to IST
        sub_dt = datetime.datetime.fromtimestamp(
            s["creationTimeSeconds"], tz=ist_tz
        )
        sub_date = sub_dt.strftime("%Y-%m-%d %H:%M:%S")

        if sub_date.startswith(target_date):
          match_count += 1
          sub_id = s["id"]
          prob_info = s["problem"]
          prob_name = (
              f"{prob_info['contestId']}{prob_info['index']} -"
              f" {prob_info['name']}"
          )[:33]
          verdict = s.get("verdict", "IN_QUEUE")
          lang = s["programmingLanguage"]

          print(
              f"{match_count: <5} | {sub_id: <12} | {prob_name: <35} | {verdict: <20} |"
              f" {lang: <15} | {sub_date}"
          )

      if match_count == 0:
        print(f"No submissions found for {target_date} in IST.")
    else:
      print("API Error:", data.get("comment"))

except Exception as e:
  print("Failed to fetch data:", e)