import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new int[n] instanceof int[] dp
            ? IntStream.range(0, n).map(i -> dp[i] = Math.min(a[i], i == 0 ? Integer.MAX_VALUE : i == 1 ? dp[0] : Math.max(dp[i - 1], dp[i - 2]))).reduce((x, y) -> y).getAsInt()
            : 0);
    }
}

