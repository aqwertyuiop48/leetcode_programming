# Java submissions with Submitter

[Submitter](https://github.com/EgorKulikov/submitter) can submit Java solutions from this folder to all the platforms below:

- CodeChef
- Kattis
- Toph
- Yandex Contest
- Eolymp
- Universal Cup (UCup) and UOJ
- CodeRun
- KEP.uz
- Repovive

## Set up in GitHub Codespaces

1. Open this repository on GitHub, select **Code** → **Codespaces**, then create or open a Codespace.
2. In the Codespace terminal, go to this folder (adjust the workspace directory if your Codespace uses a different repository path):

```bash
cd /workspaces/leetcode_programming/codechef_java
```

3. Check whether Rust and Cargo are already available:

```bash
rustc --version
cargo --version
```

If either command is not found, install Rust in the Codespace and load Cargo into the current shell:

```bash
curl --proto '=https' --tlsv1.2 -sSf https://sh.rustup.rs | sh -s -- -y
. "$HOME/.cargo/env"
```

4. Install the XCB development libraries required to build Submitter's clipboard dependency:

```bash
sudo apt-get update
sudo apt-get install -y libxcb-render0-dev libxcb-shape0-dev libxcb-xfixes0-dev
```

5. Install Submitter and confirm it is on your `PATH`:

```bash
cargo install --git https://github.com/EgorKulikov/submitter
command -v submitter
```

If the Cargo install previously failed with `unable to find library -lxcb-render`, `-lxcb-shape`, or `-lxcb-xfixes`, run the install command again after installing these packages.

The alternative is to download the Linux binary for your Codespace from the [Submitter releases](https://github.com/EgorKulikov/submitter/releases/latest) and put it on your `PATH`.

## Log in

Log in to each site you plan to use before submitting. Submitter prompts for the site's required credentials or authorization:

```bash
submitter login codechef
submitter login yandex
submitter login eolymp
submitter login uoj
submitter login ucup
submitter login coderun
```

You only need to run the login command for the site you are submitting to. Kattis also requires a `.kattisrc` file; download it from [Kattis](https://open.kattis.com/download/kattisrc) and put it in this folder or your home directory. Submitter's saved credentials and the Kattis config are excluded from Git by this folder's `.gitignore`.

## Submit a Java solution

From `codechef_java`, use this command format:

```bash
submitter "https://www.codechef.com/problems/TEST" "Java" "./TEST.java"
```

Replace the example URL with the problem page and `./Main.java` with your solution file. If a judge offers multiple Java versions or Submitter does not recognize `Java`, use the exact Java language name supported by that judge.

Examples:

```bash
# CodeChef
submitter "https://www.codechef.com/problems/TEST" "Java" "./TEST.java"

# Yandex Contest
submitter "https://contest.yandex.com/contest/3/problems/B/" "Java" "./Main.java"
eg: submitter "https://contest.yandex.com/contest/90118/problems/A/" "Java" "./Yandex.java"

# Eolymp (archive problem) (login using API key from https://eolymp.com/developer)
submitter "https://eolymp.com/en/problems/2" "Java" "./Eolymp.java"

# UOJ
submitter "https://uoj.ac/problem/1" "Java" "./UOJ.java"

# Universal Cup (register from QOJ : https://qoj.ac/user/profile/srcode19 )
submitter "https://contest.ucup.ac/contest/4576/problem/22881" "Java" "./UCUP.java"

# CodeRun (login with Yandex)
'''
- Export your Yandex cookies using the EditThisCookie browser extension on a logged-in yandex.ru tab (https://chromewebstore.google.com/detail/editthiscookie-v3/ojfebgpkimhlhcblbalbfjblapadhbol/reviews)
- Paste the JSON cookies array when prompted in terminal
'''
submitter "https://coderun.yandex.ru/problem/median-out-of-three" "Java" "./CodeRun.java"

```

For contest problems, use that contest's problem URL (for example, Eolymp or KEP.uz contest URLs). Submitter's README has current platform-specific authentication details and more URL examples: [EgorKulikov/submitter](https://github.com/EgorKulikov/submitter).
