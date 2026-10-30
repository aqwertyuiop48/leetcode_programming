import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Optional.of(Map.entry(new File("input.txt").exists() ? new FileInputStream("input.txt") : System.in, new File("input.txt").exists() ? new PrintStream(new FileOutputStream("output.txt"), true) : System.out)).ifPresent(io -> io.getValue().println(new Scanner(io.getKey()) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} instanceof int[] dm && new int[3000] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(s.nextInt()) instanceof Integer m && Integer.valueOf(s.nextInt()) instanceof Integer d
                && Integer.valueOf(s.nextInt()) instanceof Integer p && Integer.valueOf(s.nextInt()) instanceof Integer t
                && Integer.valueOf(Arrays.stream(dm, 0, m - 1).sum() + d + 1500) instanceof Integer day
                && IntStream.rangeClosed(1, t).allMatch(k -> (cnt[day - k] += p) > 0))
            ? Arrays.stream(cnt).max().getAsInt() : ""));
    }
}
