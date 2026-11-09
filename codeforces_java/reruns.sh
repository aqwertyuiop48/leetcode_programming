# 1 - 565
#for spec in 497:D 538:F 504:E 506:E 513:G3; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
