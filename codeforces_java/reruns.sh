# 1 - 515
for spec in 491:C 498:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
