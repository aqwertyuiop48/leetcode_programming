# 1 - 299
for spec in 253:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 300 - 335
for spec in 314:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 336 - 376
for spec in 341:D 375:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 377 - 400
for spec in 379:F 383:E 385:C 386:C 386:D 391:C1 391:C2 391:E1 391:E2 391:F3 392:E 397:E 398:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 401 - 450
for spec in 401:D 402:D 403:B 403:D 403:E 405:B 405:E 409:H 413:D 414:B 415:D 416:E 417:D 418:B 420:D 421:E 424:D 424:E 425:E 427:D 427:E 431:E 434:E 436:C 436:F 437:D 438:B 441:D 442:D 444:B 445:D 446:C 446:E 447:E 448:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr '[:upper:]' '[:lower:]')/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
