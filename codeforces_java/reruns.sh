# 1 - 50
for contest in 7 10 13 15 16 23 24 25 26 29 30 35 36 37 38 39 40 43 44 45 46 47 48 50; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); case "$contest:$problem" in 7:D|13:D|13:E|15:D|29:E) ./cf_java.sh "$contest" "$problem" all 87 ;; esac; done; done




