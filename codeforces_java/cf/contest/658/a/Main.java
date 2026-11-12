import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer c
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] p
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] t
            && new int[n + 1] instanceof int[] pre
            && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + t[i]) >= 0)
            && Long.valueOf(IntStream.range(0, n).map(i -> Math.max(0, p[i] - c * pre[i + 1])).sum()) instanceof Long a
            && Long.valueOf(IntStream.range(0, n).map(i -> Math.max(0, p[i] - c * (pre[n] - pre[i]))).sum()) instanceof Long b
            ? (a > b ? "Limak" : a < b ? "Radewoosh" : "Tie")
            : "");
    }
}
