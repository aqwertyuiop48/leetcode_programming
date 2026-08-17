from pathlib import Path
import time
from google import genai

# Initialize the client with your direct API key
client = genai.Client(
    api_key="GOOGLE_AI_STUDIO_GEMINI_API_KEY"
)

# Target directories matching your local repository structure
input_dir = Path(r"C:\Users\Admin\Desktop\sreedhar\git4_\leetcode_programming\java_solutions")
input_dir_alt = Path(r"C:\Users\Admin\Desktop\sreedhar\git4_\leetcode_programming\java_solutions_1")
output_dir = Path(r"C:\Users\Admin\Desktop\sreedhar\git4_\leetcode_programming\kotlin_soluitions_1")

# Ensure output directory exists
output_dir.mkdir(parents=True, exist_ok=True)

# Specific LeetCode IDs to fix
target_ids = [
    "1115", "1116", "1124", "1145", "1178", 
    "1192", "1203", "1210", "1219", "1226", "1254"
]

def find_java_file(tid: str) -> Path | None:
    """Helper to locate the source Java file in primary or secondary directories."""
    for d in [input_dir, input_dir_alt]:
        if d.exists():
            for file_path in d.glob("*.java"):
                if file_path.name.startswith(f"{tid}."):
                    return file_path
    return None

# Gather target Java files
target_files = []
for tid in target_ids:
    fp = find_java_file(tid)
    if fp:
        target_files.append((tid, fp))
    else:
        print(f"Warning: Java source file for problem {tid} not found.")

print(f"Found {len(target_files)} source files to process.")

# Payload with strict advanced Kotlin functional instructions
contents_payload = [
    "You are an expert competitive programmer and Kotlin wizard.\n"
    "Your goal is to rewrite each Java solution into an ULTRA-COMPACT, ADVANCED KOTLIN ONE-LINER.\n\n"
    "Mandatory Rules:\n"
    "1. **EXPRESSION BODY ONLY**: Every solution function must be an expression-bodied function using `fun functionName(...): ReturnType = ...`.\n"
    "2. **ZERO SEMICOLONS**: Strictly forbidden. Do not output a single semicolon (`;`) anywhere in the code.\n"
    "3. **SINGLE CONTINUOUS LINE**: The entire function body MUST be condensed into a single continuous line.\n"
    "4. **ADVANCED KOTLIN IDIOMS**: Utilize deep functional constructs to eliminate blocks and multi-line statements:\n"
    "   - For recursion: Use `DeepRecursiveFunction { ... }` or inline tailrec/anonymous object recursion via `object { fun dfs(...) = ... }.dfs(...)`.\n"
    "   - For state/scoping: Leverage `run`, `let`, `also`, `apply`, `with`, `takeIf`, `takeUnless`.\n"
    "   - For loops/iterations: Use Kotlin Streams, `fold`, `reduce`, `flatMap`, `associate`, or sequence builders.\n"
    "5. **CONCURRENCY PROBLEMS (1115, 1116, 1226)**: Model synchronization using monadic streams or atomic/semaphore chains inside expression blocks without semicolons or explicit curly block bodies.\n"
    "6. **METADATA HEADER**: Retain the exact metadata header comment at the top.\n"
    "7. **STRICT OUTPUT FORMAT**: Start each file response strictly with `===FILE: <filename>.kt===` on its own line followed by the output."
]

for tid, fp in target_files:
    contents_payload.append(f"--- FILE: {fp.name} ---\n{fp.read_text(encoding='utf-8')}")

try:
    print("\n--- Requesting advanced Kotlin conversions from Gemini ---")
    response = client.models.generate_content(
        model="gemini-3.5-flash",  # Recommended model for complex functional/syntactic reasoning
        contents=contents_payload,
    )

    response_text = response.text

    # Parse individual Kotlin files from response payload
    parts = response_text.split("===FILE: ")
    for part in parts:
        if not part.strip():
            continue
        lines = part.split("\n", 1)
        filename = lines[0].replace("===", "").strip()
        code_content = lines[1] if len(lines) > 1 else ""

        # Clean markdown code blocks
        code_content = code_content.strip()
        if code_content.startswith("```kotlin"):
            code_content = code_content[9:]
        elif code_content.startswith("```"):
            code_content = code_content[3:]
        if code_content.endswith("```"):
            code_content = code_content[:-3]
        code_content = code_content.strip()

        if filename and code_content:
            out_path = output_dir / filename
            out_path.write_text(code_content, encoding="utf-8")
            print(f"Successfully generated and saved: {out_path.name}")

except Exception as e:
    print(f"Error during execution: {e}")

print("\nBatch execution completed!")