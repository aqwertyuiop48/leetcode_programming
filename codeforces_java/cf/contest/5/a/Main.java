import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.toList()) instanceof List<String> lines
            && new int[]{0} instanceof int[] cnt
            && new long[]{0} instanceof long[] cost
            && lines.stream().allMatch(line ->
                line.startsWith("+") ? (cnt[0] += 1) == cnt[0]
                : line.startsWith("-") ? (cnt[0] -= 1) == cnt[0]
                : (cost[0] += (long) (line.length() - line.indexOf(':') - 1) * cnt[0]) == cost[0])
            ? String.valueOf(cost[0])
            : "");
    }
}

