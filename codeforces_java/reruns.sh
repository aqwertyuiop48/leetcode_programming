# # 101 - 199
# for spec in 138:E 150:D 163:E 164:E 171:D 171:E 178:C3 178:E2 185:C 186:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# # 200 - 249
# for spec in 201:D 207:A1 207:C1 207:C2 207:C3 207:D1 207:D2 207:D4 207:D5 207:D6 207:D7 207:D8 207:D9 207:D10 241:F 241:G 243:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# # 250 - 299
# for spec in 250:C 251:E 253:C 253:D 254:A 254:D 254:E 261:D 261:E 265:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 300 - 335
for spec in 293:B 311:C 312:E 314:E 316:F1 316:F2 316:F3 319:E 321:C 322:B 323:A 323:B 323:C 325:A 325:B 325:C 325:D 325:E 327:A 327:B 327:C 327:D 327:E 328:A 328:B 329:A 329:B 329:C 329:D 329:E 330:A 330:B 331:A1 331:A2 331:B1 331:B2 331:C1 331:C2 331:C3 331:D1 331:D2 331:D3 331:E1 331:E2 332:A 332:B 332:C 332:D 332:E 333:D 333:E 334:A 335:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 336 - 376
for spec in 338:C 341:D 345:A 345:B 345:C 345:D 345:E 345:F 345:G 347:E 348:E 361:B 361:E 364:D 364:E 373:E 375:E 376:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
