import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry((new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in).readAllBytes(), new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(io.getKey() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= 48 && raw[i] <= 57
                ? (st[0] = st[0] * 10 + raw[i] - 48) >= 0 && (st[1] = 1) > 0
                : st[1] == 0 || (v[st[2]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[1] = 0) == 0)
            && Integer.valueOf(v[0]) instanceof Integer n
            && Integer.valueOf(IntStream.range(1, n + 1).map(i -> v[i]).max().getAsInt()) instanceof Integer mx
            && new int[2 * mx + 3] instanceof int[] pre
            && IntStream.range(1, n + 1).allMatch(i -> ++pre[v[i] + 1] > 0)
            && IntStream.range(1, 2 * mx + 3).allMatch(i -> (pre[i] += pre[i - 1]) >= 0)
            ? n - IntStream.rangeClosed(1, mx).map(x -> pre[2 * x + 1] - pre[x]).max().getAsInt() : ""));
    }
}
