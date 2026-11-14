# 1 - 565
#for spec in 497:D 538:F 504:E 506:E 513:G3; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 566 - 650 (failed in pyforces notebooks + previously missing Main.java)
for spec in 566:E 566:G 568:C 568:E 569:E 575:C 575:E 575:I 581:B 581:D 582:C 582:E 583:E 585:E 587:E 587:F 593:D 594:D 594:E 596:D 597:C 600:F 603:E 605:D 609:D 613:E 616:C 618:G 620:F 624:B 631:C 634:F 635:C 639:B 639:F; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 651 - 700 (failed in pyforces_651_to_700 notebook)
for spec in 653:D 655:G 656:A 656:G 663:D 679:D 679:E 685:E 687:D 689:E 690:A2 690:F2 690:F3 696:F 700:C 700:D; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done

# 690 E1/E2 (Photographs, previously missing Main.java; image-input problems, data from assets.codeforces.com/files/690/*_contestant_package.zip)
for spec in 690:E1 690:E2; do contest=${spec%:*}; problem=${spec#*:}; source="cf/contest/$contest/$(echo "$problem" | tr "[:upper:]" "[:lower:]")/Main.java"; [ -f "$source" ] || continue; ./cf_java.sh "$contest" "$problem" all 87; done
