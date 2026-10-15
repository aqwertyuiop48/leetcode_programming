import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                sc.tokens().toList() instanceof List<String> tk
                && (Integer) Integer.parseInt(tk.get(0)) instanceof Integer n
                && tk.subList(3, 3 + n) instanceof List<String> names
                && tk.subList(3 + 2 * n, tk.size()) instanceof List<String> rest
                && ((ToIntFunction<String>) x -> Integer.parseInt(x.substring(0, 2)) * 60 + Integer.parseInt(x.substring(3, 5))) instanceof ToIntFunction<String> pt
                && new boolean[1440] instanceof boolean[] busy
                && rest.stream().filter(x -> x.matches("[0-9][0-9]:[0-9][0-9]-[0-9][0-9]:[0-9][0-9]"))
                    .allMatch(x -> IntStream.rangeClosed(pt.applyAsInt(x.substring(0, 5)), pt.applyAsInt(x.substring(6))).allMatch(m -> busy[m] = true))
                && rest.stream().filter(x -> !x.matches("[0-9][0-9]:[0-9][0-9]-[0-9][0-9]:[0-9][0-9]")).toList() instanceof List<String> tt
                && IntStream.range(0, tt.size() / 4).mapToObj(i -> new long[]{i + 1,
                        names.indexOf(tt.get(4 * i)) < 0 ? -1 : Long.parseLong(tk.get(3 + n + names.indexOf(tt.get(4 * i)))),
                        (Long.parseLong(tt.get(4 * i + 1)) - 1) * 1440 + pt.applyAsInt(tt.get(4 * i + 2)),
                        Long.parseLong(tt.get(4 * i + 3))}).toList() instanceof List<long[]> all
                && (Integer) all.stream().mapToInt(a -> (int) a[2]).max().orElse(0) instanceof Integer maxD
                && new int[maxD + 2] instanceof int[] cum
                && IntStream.rangeClosed(0, maxD).allMatch(x -> (cum[x + 1] = cum[x] + (busy[x % 1440] ? 0 : 1)) >= 0)
                && all.stream().filter(a -> a[1] > 0 && a[1] <= cum[(int) a[2]]).sorted(Comparator.comparingLong(a -> a[2])).toArray(long[][]::new) instanceof long[][] t
                && (Integer) t.length instanceof Integer cnt
                && (Integer) cum[maxD] instanceof Integer cap
                && new long[cnt + 1][cap + 1] instanceof long[][] dp
                && Arrays.stream(dp).allMatch(row -> IntStream.rangeClosed(0, cap).allMatch(j -> (row[j] = -1) < 0))
                && (dp[0][0] = 0) == 0
                && IntStream.range(0, cnt).allMatch(i -> IntStream.rangeClosed(0, cap).allMatch(x ->
                    (dp[i + 1][x] = Math.max(dp[i][x], x >= t[i][1] && x <= cum[(int) t[i][2]] && dp[i][x - (int) t[i][1]] >= 0 ? dp[i][x - (int) t[i][1]] + t[i][3] : -1)) >= -1))
                && (Integer) IntStream.rangeClosed(0, cap).boxed().max(Comparator.comparingLong(x -> dp[cnt][x])).get() instanceof Integer bt
                && Stream.iterate(new int[]{cnt, bt}, s -> s[0] > 0,
                        s -> dp[s[0]][s[1]] == dp[s[0] - 1][s[1]] ? new int[]{s[0] - 1, s[1]} : new int[]{s[0] - 1, s[1] - (int) t[s[0] - 1][1]})
                    .filter(s -> dp[s[0]][s[1]] != dp[s[0] - 1][s[1]]).mapToInt(s -> s[0] - 1).sorted().toArray() instanceof int[] ch
                && new int[ch.length + 1] instanceof int[] pre
                && IntStream.range(0, ch.length).allMatch(j -> (pre[j + 1] = pre[j] + (int) t[ch[j]][1]) > 0)
                && IntStream.rangeClosed(0, maxD).filter(m -> !busy[m % 1440]).toArray() instanceof int[] fm
                && ((IntFunction<String>) m -> (m / 1440 + 1) + " " + String.format("%02d:%02d", m % 1440 / 60, m % 60)) instanceof IntFunction<String> fmt
                ? (cnt == 0 ? 0 : dp[cnt][bt]) + "\n" + ch.length + IntStream.range(0, ch.length).mapToObj(j ->
                    "\n" + (int) t[ch[j]][0] + " " + fmt.apply(fm[pre[j]]) + " " + fmt.apply(fm[pre[j + 1] - 1])).collect(Collectors.joining())
                : ""));
    }
}



