for f in $(ls -v kotlin_solutions/*.kt); do 
    echo "Submitting: $f"
    leetcode submit "$f"
    sleep 7
done