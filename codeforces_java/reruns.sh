# 1 - 515
#for spec in 491:C 498:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 516 - 560
for spec in 516:B 522:C 522:D 525:D 525:E 526:E 526:F 528:D 529:B 538:F 543:B 544:D 547:C 548:E 549:F 551:E 555:D 558:C 559:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 516 - 560 (previously missing Main.java, newly written)
for spec in 516:E 521:E 526:G 528:E 533:A 533:D 536:E 538:G 542:B 542:D 542:F 543:E 549:E 553:E; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
