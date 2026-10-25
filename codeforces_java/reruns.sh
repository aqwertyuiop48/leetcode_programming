# 2026-10-24 reruns (failures reported: TLE/WA on 13, 101-104, 138-151, 163-186) - re-written Main.java, resubmit
for spec in 13:E 101:E 103:D 104:E 138:E 139:E 140:B 145:E 147:B 148:E 150:D 150:E 151:C; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

for spec in 163:B 164:B 165:E 166:D 167:A 167:C 168:B 168:C 168:E 169:D 172:D 172:E 173:C 173:D 173:E 174:E 175:D 176:C 176:D 176:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 177-178 use sub-problem letters (F1/F2, G1/G2, B1..B3, C1..C3, D1..D3, F1..F3 share the same file)
for spec in 177:F1 177:F2 177:G1 177:G2 178:B1 178:B2 178:B3 178:C1 178:C2 178:C3 178:D1 178:D2 178:D3 178:F1 178:F2 178:F3 180:C 180:D 180:E 180:F 181:E 183:B 183:E 185:C; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
