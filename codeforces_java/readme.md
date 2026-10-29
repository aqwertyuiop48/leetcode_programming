Steps: (To do in Github codespace)

- Reference: https://github.com/LZDQ/pyforces
- pip install pyforces-cli
- pyforces config
    - 0 (login with http header)
    - go to Firefox -> Right-click -> Inspect -> HTML -> Request headers -> Accept: (Copy all)
    - paste entire content in terminal

- cd codeforces_java
- pyforces race 1 (or) for i in {501..550}; do pyforces race "$i"; done
- mv /home/codespace/cf/contest/* /workspaces/leetcode_programming/codeforces_java/cf/contest
- chmod +x cf_java.sh
- ./cf_java.sh 1 A all 87   (or)  ./cf_java.sh 1 A test && ./cf_java.sh 1 A submit 87
    - for contest in {251..264}; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); ./cf_java.sh "$contest" "$problem" all 87; done; done && for contest in {51..60}; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); ./cf_java.sh "$contest" "$problem" all 87; done; done && for contest in {61..70}; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); ./cf_java.sh "$contest" "$problem" all 87; done; done && for contest in {71..80}; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); ./cf_java.sh "$contest" "$problem" all 87; done; done && for contest in {81..90}; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); ./cf_java.sh "$contest" "$problem" all 87; done; done && for contest in {91..100}; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); ./cf_java.sh "$contest" "$problem" all 87; done; done


### Reference ID
<select style="width: 300px;" name="programTypeId">
                            <option value="43">GNU GCC C11 5.1.0</option>
                            <option value="54">GNU G++17 7.3.0</option>
                            <option value="89">GNU G++20 13.2 (64 bit, winlibs)</option>
                            <option value="91">GNU G++23 14.2 (64 bit, msys2)</option>
                            <option value="65">C# 8, .NET Core 3.1</option>
                            <option value="79">C# 10, .NET SDK 6.0</option>
                            <option value="96">C# 13, .NET SDK 9</option>
                            <option value="9">C# Mono 6.8</option>
                            <option value="28">D DMD32 v2.105.0</option>
                            <option value="97">F# 9, .NET SDK 9</option>
                            <option value="32">Go 1.22.2</option>
                            <option value="12">Haskell GHC 8.10.1</option>
                            <option value="87" selected="selected">Java 21 64bit</option>
                            <option value="36">Java 8 32bit</option>
                            <option value="83">Kotlin 1.7.20</option>
                            <option value="88">Kotlin 1.9.21</option>
                            <option value="99">Kotlin 2.2.0</option>
                            <option value="19">OCaml 4.02.1</option>
                            <option value="3">Delphi 7</option>
                            <option value="4">Free Pascal 3.2.2</option>
                            <option value="51">PascalABC.NET 3.8.3</option>
                            <option value="13">Perl 5.20.1</option>
                            <option value="6">PHP 8.1.7</option>
                            <option value="7">Python 2.7.18</option>
                            <option value="31">Python 3.13.2</option>
                            <option value="40">PyPy 2.7.13 (7.3.0)</option>
                            <option value="41">PyPy 3.6.9 (7.3.0)</option>
                            <option value="70">PyPy 3.10 (7.3.15, 64bit)</option>
                            <option value="67">Ruby 3.2.2</option>
                            <option value="75">Rust 1.89.0 (2021)</option>
                            <option value="98">Rust 1.89.0 (2024)</option>
                            <option value="20">Scala 2.12.8</option>
                            <option value="34">JavaScript V8 4.8.0</option>
                            <option value="55">Node.js 15.8.0 (64bit)</option>
                    </select>


# Skipped questions

 ### Not accepting Java
 188:A 188:B 188:C 188:D 188:E 188:F 188:G 188:H
 64:A 64:B 64:C 64:D 64:E 64:F 64:G 64:H 64:I
 72:A 72:B 72:C 72:D 72:E 72:F 72:G 72:H 72:I
 100:A 100:B 100:C 100:D 100:E 100:F 100:G 100:H 100:I 100:J
 130:A 130:B 130:C 130:D 130:E 130:F 130:G 130:H 130:I 130:J
 153:A 153:B 153:C 153:D 153:E
 162:A 162:B 162:C 162:D 162:E 162:F 162:G 162:H 162:I 162:J

 ### Not able to submit now
 206:A1 206:A2 206:A3 206:B1 206:B2 206:B3 206:C1 206:C2 206:C3


 - { for contest in {231..250}; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); ./cf_java.sh "$contest" "$problem" all 87; done; done && python codeforces_api.py; } > "outputs/$(TZ=Asia/Kolkata date +%F).txt"
 
 - { for contest in {292..300}; do for source in "cf/contest/$contest"/*/Main.java; do [ -f "$source" ] || continue; problem=$(basename "$(dirname "$source")" | tr '[:lower:]' '[:upper:]'); ./cf_java.sh "$contest" "$problem" all 87; done; done && python codeforces_api.py; } >> "outputs/28_10_2026/265_to_300.txt"

 - { ./reruns.sh && python codeforces_api.py; } > "outputs/27_10_2026/reruns_1_to_230.txt"