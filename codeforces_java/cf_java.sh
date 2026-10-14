
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

java_major() {
    "$1" -version 2>&1 | head -1 | sed -E 's/[^0-9]*([0-9]+)\.?([0-9]*).*/\1 \2/' | awk '{print ($1==1)?$2:$1}'
}

if [[ "$(java_major javac)" -lt 21 ]]; then
    for jdk in /usr/local/sdkman/candidates/java/21* /usr/local/sdkman/candidates/java/2[2-9]* \
               "$HOME"/.sdkman/candidates/java/21* /usr/lib/jvm/*21* /usr/lib/jvm/*-2[2-9]*; do
        if [[ -x "$jdk/bin/javac" && "$(java_major "$jdk/bin/javac")" -ge 21 ]]; then
            export JAVA_HOME="$jdk"
            export PATH="$JAVA_HOME/bin:$PATH"
            break
        fi
    done
fi

if [[ "$(java_major javac)" -lt 21 ]]; then
    echo "ERROR: JDK 21+ required (found $(javac -version 2>&1)). Install: sdk install java 21-tem && sdk default java 21-tem"
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
    echo "Waiting 2 seconds before submission..."
    sleep 2
    pyforces submit --file Main.java --program-type-id "$JAVA_ID" --no-track
}

test_and_submit_solution() {
    echo "===== COMPILE ====="
    javac Main.java

    echo "===== TEST SAMPLES (failure will not block submit) ====="
    pyforces test --shell "java Main" || echo "WARNING: sample test failed, submitting anyway"
    submit_solution
}

case "$ACTION" in
    test)
        test_solution
        ;;
    submit)
        submit_solution
        ;;
    all)
        test_and_submit_solution
        ;;
    force)
        test_and_submit_solution
        ;;
    *)
        echo "ERROR: Unknown action '$ACTION'. Use test, submit, force, or all."
        exit 1
        ;;
esac

echo "===== DONE ====="
sleep 15
