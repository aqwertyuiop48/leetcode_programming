# 2026-10-25 reruns (still failing: TLE/WA) - re-written Main.java, resubmit
# 1 - 210
for spec in 209:B 193:A 193:B 193:D 194:C 194:D 192:C 180:D 185:C 186:E 190:C 190:E 191:A 191:E 165:E 168:B 169:D 154:A 154:B 154:C 154:D 154:E 16:E 101:E 138:E 147:B 150:D 175:D 177:F2 207:C3 178:E1 178:E2 178:E3 178:C3; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
