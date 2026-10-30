import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Boolean.valueOf(Boolean.valueOf(new java.io.File("input.txt").exists()) instanceof Boolean f
            && (f ? new java.io.FileInputStream("input.txt") : System.in) instanceof java.io.InputStream in
            && (f ? new java.io.PrintStream(new java.io.FileOutputStream("output.txt")) : System.out) instanceof java.io.PrintStream out
            && new Scanner(in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && new int[n + 1] instanceof int[] pre && new int[n + 2] instanceof int[] suf
            && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + (a[i] >= 0 ? 1 : 0)) >= 0)
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (suf[i] = suf[i + 1] + (a[i] <= 0 ? 1 : 0)) >= 0)
            && out.append(IntStream.range(1, n).map(i -> pre[i] + suf[i]).min().getAsInt() + "\n").checkError());
    }
}
