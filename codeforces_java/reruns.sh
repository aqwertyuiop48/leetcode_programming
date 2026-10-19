# 1 - 50
for contest in 7 10 13 15 16 23 24 25 26 29 30 35 36 37 38 39 40 43 44 45 46 47 48 50; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); case "$contest:$problem" in 7:D|13:D|13:E|15:D|29:E) ./cf_java.sh "$contest" "$problem" all 87 ;; esac; done; done

# 51 - 100
for contest in 100; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); case "$contest:$problem" in 100:A|100:B|100:C|100:D|100:E|100:F|100:G|100:H|100:I|100:J) ./cf_java.sh "$contest" "$problem" all 87 ;; esac; done; done
for spec in 51:E 52:C 53:D 57:E 58:D 58:E 65:C 67:C 67:D 68:D 68:E 69:C 73:D 73:E 74:B 74:D 76:A 76:B 76:C 76:D 76:F 77:D 79:D 79:E 81:C 82:C 83:C 84:E 85:E 86:B 86:D 87:C 89:E 90:E 91:A 91:E 92:C 95:C 95:E 97:A 97:D 98:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done


