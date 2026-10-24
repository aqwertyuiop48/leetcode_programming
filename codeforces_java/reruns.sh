# 1 - 50
# # 100 - can be submitted only in Pike language
# for contest in 13 29; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); case "$contest:$problem" in 13:E|29:E) ./cf_java.sh "$contest" "$problem" all 87 ;; esac; done; done

# # 51 - 100
# for spec in 67:C 68:E 69:C 77:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# # 101 - 110
# for spec in 101:B 101:D 101:E 102:D 103:D 104:A 104:E 105:D 105:E 107:C 108:E 109:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# # 111 - 140
# for spec in 112:B 113:D 117:C 119:C 119:D 123:E 126:E 128:B 128:D 128:E 129:D 132:E 135:D 137:D 138:C 138:D 138:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# # 126-140
# for spec in 139:D 139:E 140:A 140:B 140:C 140:D 140:E 140:F; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done


# 2026-10-24 reruns (failures reported: TLE/WA on 13, 101-104, 138-151, 163-186) - re-written Main.java, resubmit
for spec in 13:E 101:E 103:D 104:E 138:E 139:E 140:B 145:E 147:B 148:E 150:D 150:E 151:C; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

for spec in 163:B 164:B 165:E 166:D 167:A 167:C 168:B 168:C 168:E 169:D 172:D 172:E 173:C 173:D 173:E 174:E 175:D 176:C 176:D 176:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 177-178 use sub-problem letters (F1/F2, G1/G2, B1..B3, C1..C3, D1..D3, F1..F3 share the same file)
for spec in 177:F1 177:F2 177:G1 177:G2 178:B1 178:B2 178:B3 178:C1 178:C2 178:C3 178:D1 178:D2 178:D3 178:F1 178:F2 178:F3 180:C 180:D 180:E 180:F 181:E 183:B 183:E 185:C 186:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
