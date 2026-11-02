# 101 - 199
for spec in 138:E 150:D 163:E 164:E 171:D 171:E 178:C3 178:E2 185:C 186:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 200 - 249
for spec in 201:D 207:A1 207:C1 207:C2 207:C3 207:D1 207:D2 207:D4 207:D5 207:D6 207:D7 207:D8 207:D9 207:D10 241:F 241:G 243:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 250 - 299
for spec in 250:C 251:E 253:C 253:D 254:A 254:D 254:E 261:D 261:E 265:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 300 - 335
for spec in 293:B 314:E 316:F1 316:F2 316:F3 319:E 321:C 325:C 325:D 327:C 327:E 329:B 329:C 332:A 332:B 332:C 332:D 332:E 333:D 333:E 334:A 335:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 336 - 376
for spec in 341:D 361:B 364:D 364:E 375:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
