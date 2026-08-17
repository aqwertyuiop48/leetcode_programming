from pathlib import Path
from google import genai

# Initialize the client with your direct API key
client = genai.Client(
    api_key="GOOGLE_AI_STUDIO_GEMINI_API_KEY"
)

# Define your target repository absolute path
repo_dir = Path(r"C:\Users\Admin\Desktop\sreedhar\git4_\programming_languages")

print("Scanning local repository for testing frameworks and GitHub workflows...")

# 1. Collect all workflow YAML files
workflows_dir = repo_dir / ".github" / "workflows"
workflow_contents = ""
if workflows_dir.exists():
    for wf_file in workflows_dir.glob("*.yaml"):
        try:
            workflow_contents += f"\n--- WORKFLOW FILE: {wf_file.name} ---\n{wf_file.read_text(encoding='utf-8')}\n"
        except Exception:
            pass
        
    for wf_file in workflows_dir.glob("*.yml"):
        try:
            workflow_contents += f"\n--- WORKFLOW FILE: {wf_file.name} ---\n{wf_file.read_text(encoding='utf-8')}\n"
        except Exception:
            pass

# 2. Gather a file structure summary to give the model full visibility of covered test frameworks
file_paths_list = []
for p in repo_dir.rglob("*"):
    if p.is_file() and ".git" not in p.parts:
        file_paths_list.append(str(p.relative_to(repo_dir)))

file_tree_snippet = "\n".join(file_paths_list[:500]) # Cap for token safety if repo is massive

# 3. Construct the prompt matching your exact specifications + explicit no-repo-changes note rule
prompt = (
    "You are an expert technical writer and software developer. "
    "Analyze the provided file paths and GitHub Actions workflow contents from the user's repository (`programming_languages`).\n\n"
    "Task Requirements:\n"
    "1. **Identify Testing Frameworks**: Make a comprehensive list of all testing frameworks covered in this repo (e.g., Cypress, Selenium, Pytest, Robot, Spring-Test, etc.).\n"
    "2. **Direct Workflow Links**: Provide direct GitHub links to their respective workflows matching this format:\n"
    "   `https://github.com/aqwertyuiop48/programming_languages/tree/main/.github/workflows/<filename>.yaml#L<line_number>` (estimate appropriate line numbers based on where the framework or job is referenced in the workflow).\n"
    "3. **LinkedIn Post**: Create an engaging, professional LinkedIn post summarizing this testing infrastructure automation. **Explicitly include a prominent note stating that no changes are being made to the existing repository code.**\n"
    "4. **Typst Code**: Write clean Typst markup code to format this exact content nicely into a downloadable PDF layout, ensuring the note about keeping existing repo code untouched is clearly highlighted.\n\n"
    r"5. NOTE: DO NOT MAKE ANY CODE CHANGES TO EXISTING REPO: C:\Users\Admin\Desktop\sreedhar\git4_\programming_languages.\n"
    f"--- REPOSITORY FILE STRUCTURE SAMPLE ---\n{file_tree_snippet}\n\n"
    f"--- GITHUB WORKFLOWS CONTENT ---\n{workflow_contents}"
)

try:
    print("Sending analysis request to Gemini...")
    response = client.models.generate_content(
        model="gemini-3.5-flash",
        contents=prompt,
    )

    print("\n================== GENERATED OUTPUT ==================\n")
    print(response.text)
    print("\n======================================================\n")

except Exception as e:
    print(f"Error communicating with Gemini API: {e}")