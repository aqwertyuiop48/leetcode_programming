import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.toList()) instanceof List<String> lines
            && new int[]{lines.stream().mapToInt(String::length).max().getAsInt()} instanceof int[] width
            && new int[]{0} instanceof int[] oddCnt
            ? "*".repeat(width[0] + 2) + "\n"
                + lines.stream().map(line ->
                    (width[0] - line.length()) % 2 == 0
                        ? "*" + " ".repeat((width[0] - line.length()) / 2) + line + " ".repeat((width[0] - line.length()) / 2) + "*"
                        : ((oddCnt[0] += 1) % 2 == 1
                            ? "*" + " ".repeat((width[0] - line.length()) / 2) + line + " ".repeat((width[0] - line.length()) / 2 + 1) + "*"
                            : "*" + " ".repeat((width[0] - line.length()) / 2 + 1) + line + " ".repeat((width[0] - line.length()) / 2) + "*"))
                    .collect(Collectors.joining("\n"))
                + "\n" + "*".repeat(width[0] + 2)
            : "");
    }
}


