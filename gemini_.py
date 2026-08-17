from pathlib import Path
import time
from google import genai

# Initialize the client with your direct API key
client = genai.Client(
    api_key="GOOGLE_AI_STUDIO_GEMINI_API_KEY"
)

# Define your target directories
input_dir = Path(
    r"java_solutions"
)
output_dir = Path(
    r"kotlin_solutions_1"
)

# Ensure the output directory exists
output_dir.mkdir(parents=True, exist_ok=True)

# List of target LeetCode IDs
target_ids = [
    # "3185", "3186", "3187", "3190", "3191", "3192", "3193", "3194", "3195", "3196",
    "3239", "3240", "3241", "3242", "3243", "3244", "3245", "3248", "3249", "3250",
    "3251", "3254", "3255", "3256", "3257", "3258", "3259", "3260", "3261", "3264",
    "3443", "3444", "3445", "3446", "3447", "3448", "3449", "3452", "3453", "3454",
    "3455", "3456", "3457", "3458", "3459", "3461", "3462", "3463", "3464", "3467",
    "3468", "3469", "3470", "3471", "3472", "3473", "3474", "3477", "3478", "3479",
    # "3480", "3483", "3484", "3485", "3486", "3487", "3488", "3489", "3490", "3492",
]

# Helper function to chunk lists into batches of N (e.g., 10)
def chunk_list(lst, n):
  for i in range(0, len(lst), n):
    yield lst[i : i + n]


# Process in batches of 10 IDs per query
for batch_idx, batch_ids in enumerate(chunk_list(target_ids, 20)):
  print(f"\n--- Processing Batch {batch_idx + 1} with IDs: {batch_ids} ---")

  # Gather files matching this batch
  batch_files = []
  for file_path in input_dir.glob("*.java"):
    if any(file_path.name.startswith(f"{tid}.") for tid in batch_ids):
      batch_files.append(file_path)

  if not batch_files:
    continue

  # Build payload combining all files in the batch
  contents_payload = [
    "You are an expert competitive programmer and Kotlin wizard. "
    "Translate each provided Java solution into a strict Kotlin **expression-bodied function**.\n\n"
    "Mandatory Rules:\n"
    "1. **EXPRESSION SYNTAX ONLY**: Every solution must be written as a single expression using `fun functionName(...): ReturnType = ...`. Never use curly-brace block bodies (`{ ... }`) for the main function, as blocks encourage semicolons.\n"
    "2. **ZERO SEMICOLONS**: Do not output a single semicolon (`;`) anywhere in the code. Semicolons are strictly forbidden.\n"
    "3. **SINGLE LINE CODE**: The entire code body after the header must be condensed into a single continuous line using advanced Kotlin functional chaining (`run`, `let`, `apply`, `takeIf`, `with`).\n"
    "4. **METADATA HEADER**: Keep the exact LeetCode metadata header comment at the top.\n"
    "5. **FORMAT**: Start each file output with `===FILE: <filename>.kt===`."
]


  for fp in batch_files:
    contents_payload.append(f"--- FILE: {fp.name} ---\n{fp.read_text(encoding='utf-8')}")

  try:
    # Call Gemini once for the whole batch of 10 files
    response = client.models.generate_content(
        model=
        #"gemini-3.6-flash",
        #"gemini-3.5-flash",
        "gemini-3-flash-preview",
        contents=contents_payload,
    )

    response_text = response.text

    # Parse individual files out of the response text using the marker format
    parts = response_text.split("===FILE: ")
    for part in parts:
      if not part.strip():
        continue
      lines = part.split("\n", 1)
      filename = lines[0].replace("===", "").strip()
      code_content = lines[1] if len(lines) > 1 else ""

      # Clean up markdown code blocks if present
      code_content = code_content.strip()
      if code_content.startswith("```kotlin"):
        code_content = code_content[9:]
      if code_content.startswith("```"):
        code_content = code_content[3:]
      if code_content.endswith("```"):
        code_content = code_content[:-3]
      code_content = code_content.strip()

      if filename and code_content:
        out_path = output_dir / filename
        out_path.write_text(code_content, encoding="utf-8")
        print(f"Successfully saved batch output to: {out_path}")

    # Respect rate limits between batches
    time.sleep(10)

  except Exception as e:
    print(f"Error processing batch {batch_idx + 1}: {e}")
    time.sleep(15)

print("All batched solutions processed successfully!")