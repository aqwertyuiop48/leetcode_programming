# 1 - 50
# 100 - can be submitted only in Pike language
for contest in 13 29; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); case "$contest:$problem" in 13:E|29:E) ./cf_java.sh "$contest" "$problem" all 87 ;; esac; done; done

# 51 - 100
for spec in 67:C 68:E 69:C 77:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 101 - 110
for spec in 101:B 101:D 101:E 102:D 103:D 104:A 104:E 105:D 105:E 107:C 108:E 109:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 111 - 125
for spec in 112:B 113:D 117:C 119:C 119:D 123:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

