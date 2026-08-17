from pathlib import Path

target_dir = Path(r"kotlin_solutions_1")

for file_path in target_dir.glob("*.kt"):
    # Read text, split by newlines, strip excess spaces, and join into 1 line
    content = file_path.read_text(encoding="utf-8")
    single_line = " ".join(line.strip() for line in content.splitlines() if line.strip())
    file_path.write_text(single_line, encoding="utf-8")

print("Successfully condensed all files to single lines!")