import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k && Integer.valueOf(s.nextInt()) instanceof Integer w
            && s.next() instanceof String t
            && IntStream.range(0, k).mapToObj(c -> new int[n + 1]).toArray(int[][]::new) instanceof int[][] pre
            && IntStream.rangeClosed(1, n).allMatch(i -> IntStream.range(0, k).allMatch(c -> (pre[c][i] = pre[c][i - 1] + ((i - 1) % k == c && t.charAt(i - 1) == '1' ? 1 : 0)) >= 0))
            ? IntStream.range(0, w).mapToObj(q -> Integer.valueOf(s.nextInt()) instanceof Integer l && Integer.valueOf(s.nextInt()) instanceof Integer r
                && Integer.valueOf(IntStream.range(0, k).map(c -> pre[c][r] - pre[c][l - 1]).sum()) instanceof Integer ones
                ? String.valueOf(IntStream.range(0, k).map(c -> Integer.valueOf(pre[c][r] - pre[c][l - 1]) instanceof Integer oc
                    ? ones - oc + (r + k - c - 1) / k - (l - 1 + k - c - 1) / k - oc : 0).min().getAsInt()) : "").collect(Collectors.joining("\n")) : "");
    }
}
