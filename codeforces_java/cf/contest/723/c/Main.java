import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(n / m) instanceof Integer q
            && new int[m + 1] instanceof int[] kept && new int[n] instanceof int[] rep && new int[]{0} instanceof int[] rc
            && IntStream.range(0, n).allMatch(i -> t[2 + i] <= m && kept[t[2 + i]] < q ? ++kept[t[2 + i]] > 0 : (rep[rc[0]++] = i) >= 0)
            && new int[]{0} instanceof int[] used
            && IntStream.rangeClosed(1, m).allMatch(b -> IntStream.range(kept[b], q).allMatch(z -> (t[2 + rep[used[0]++]] = b) > 0))
            ? q + " " + used[0] + "\n" + IntStream.range(0, n).mapToObj(i -> "" + t[2 + i]).collect(Collectors.joining(" ")) : "");
    }
}
