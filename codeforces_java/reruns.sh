# 1 - 515
for spec in 484:D 484:E 489:A 491:C 498:D 506:D 507:B 509:C 510:E 512:C 513:E2 513:F2 515:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
