# trigger_account_a.py (Run by Account B)
import os
import time
from github import Github

# 1. Account B uses a token provided by Account A.
# This token MUST have 'Actions: Read & Write' permission for AccountA/TargetRepo
TRIGGER_TOKEN = os.getenv("GITFORCODE_DEBUG_PAT_TRIGGER_TOKEN")

if not TRIGGER_TOKEN:
    raise ValueError("Missing trigger token!")

# 2. Authenticate and target Account A's repository
g = Github(TRIGGER_TOKEN)
target_repo_name = "Gitforcode-debug/didactic-barnacle" # Change this to the actual repo name!
repo = g.get_repo(target_repo_name)

print(f"✅ Successfully connected to: {repo.full_name}")

# 3. Target the specific workflow file
workflow_filename = "python.yml"
workflow = repo.get_workflow(workflow_filename)

# 4. Trigger the workflow on the main branch
print(f"🚀 Triggering {workflow_filename} in {target_repo_name}...")
workflow.create_dispatch(ref="main")

print("✅ Trigger sent successfully! Check Account A's repository Actions tab.")