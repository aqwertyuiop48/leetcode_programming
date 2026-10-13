
#!/usr/bin/env bash

set -euo pipefail

# Usage:
#   ./cf_java.sh 2092 A test
#   ./cf_java.sh 2092 A submit JAVA_LANGUAGE_ID
#   ./cf_java.sh 2092 A all JAVA_LANGUAGE_ID

CONTEST="${1:?Usage: ./cf_java.sh CONTEST PROBLEM test|submit|all [JAVA_LANGUAGE_ID]}"
PROBLEM="${2:?Missing problem letter}"
ACTION="${3:?Missing action: test, submit, or all}"
JAVA_ID="${4:-}"

ROOT="/workspaces/leetcode_programming/codeforces_java"
PROBLEM_DIR="$ROOT/cf/contest/$CONTEST/$(echo "$PROBLEM" | tr '[:upper:]' '[:lower:]')"
SOURCE="$PROBLEM_DIR/Main.java"

echo "========================================"
echo "Contest : $CONTEST"
echo "Problem : $PROBLEM"
echo "Action  : $ACTION"
echo "Source  : $SOURCE"
echo "========================================"

command -v pyforces >/dev/null || {
    echo "ERROR: pyforces is not installed."
    exit 1
}

command -v java >/dev/null || {
    echo "ERROR: Java is not installed."
    exit 1
}

command -v javac >/dev/null || {
    echo "ERROR: javac is not installed."
    exit 1
}

if [[ ! -d "$PROBLEM_DIR" ]]; then
    echo "ERROR: Problem directory not found: $PROBLEM_DIR"
    exit 1
fi

if [[ ! -f "$SOURCE" ]]; then
    echo "ERROR: Main.java not found: $SOURCE"
    exit 1
fi

cd "$PROBLEM_DIR"

test_solution() {
    echo "===== COMPILE ====="
    javac Main.java

    echo "===== TEST SAMPLES ====="
    pyforces test --shell "java Main"
}

submit_solution() {
    if [[ -z "$JAVA_ID" ]]; then
        echo "ERROR: Supply the Java language ID."
        exit 1
    fi

    echo "===== SUBMIT ====="
    pyforces submit --file Main.java --program-type-id "$JAVA_ID" --no-track
}

case "$ACTION" in
    test)
        test_solution
        ;;
    submit)
        submit_solution
        ;;
    all)
        test_solution
        submit_solution
        ;;
    *)
        echo "ERROR: Unknown action '$ACTION'. Use test, submit, or all."
        exit 1
        ;;
esac

echo "===== DONE ====="
