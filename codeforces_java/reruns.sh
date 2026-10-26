# 2026-10-26 reruns (still failing) - re-written Main.java, resubmit
for spec in 101:E 138:E 145:E 150:D 177:F2 207:A2 207:A3 207:B1 207:B2 207:B3 154:D 154:E 160:E 161:B 163:A 163:D 163:E 164:C 164:E 175:D 178:C3 185:C 186:E 196:B 196:C 197:D 197:E 198:E 200:A 201:D 201:E 203:E 204:A 207:C3; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

for spec in 207:D1 207:D2 207:D3 207:D4 207:D5 207:D6 207:D7 207:D8 207:D9 207:D10; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

for spec in 171:D 171:E 195:D 195:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
for spec in 212:A 212:B 213:C 213:E 214:E 215:C 215:E 217:B 217:C 217:D 217:E 218:D 218:E 220:D 221:B 222:C 223:E 225:B 228:C 228:D 229:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
