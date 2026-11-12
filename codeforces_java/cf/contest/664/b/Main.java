import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).nextLine().trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[tk.length - 1]) instanceof Integer n
            && Integer.valueOf(tk.length / 2) instanceof Integer cnt
            && IntStream.range(0, cnt).map(i -> i == 0 || tk[2 * i - 1].equals("+") ? 1 : -1).toArray() instanceof int[] sg
            && Long.valueOf(Arrays.stream(sg).filter(x -> x > 0).count()) instanceof Long p
            && Long.valueOf(cnt - p) instanceof Long q
            && p - q * n <= n && n <= p * n - q
            && Integer.valueOf(n - (int) (p - q)) instanceof Integer diff
            && Integer.valueOf(diff > 0 ? 1 : -1) instanceof Integer dir
            && new int[]{0} instanceof int[] c
            && IntStream.range(0, cnt).map(i -> 1 + (sg[i] == dir ? Math.max(0, Math.min(n - 1, Math.abs(diff) - c[0]++ * (n - 1))) : 0)).toArray() instanceof int[] vals
            ? "Possible\n" + IntStream.range(0, tk.length).mapToObj(j -> j % 2 == 0 && j < tk.length - 1 ? String.valueOf(vals[j / 2]) : tk[j]).collect(Collectors.joining(" "))
            : "Impossible");
    }
}
