import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && ((Function<int[], int[]>) p -> new int[n + 1] instanceof int[] bit && IntStream.rangeClosed(0, n).map(i -> bit[i] = i & -i).sum() >= 0
                ? Arrays.stream(p).map(v -> IntStream.iterate(v, j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum()
                    + 0 * IntStream.iterate(v + 1, j -> j <= n, j -> j + (j & -j)).map(j -> bit[j]--).sum()).toArray()
                : null) instanceof Function<int[], int[]> code
            && code.apply(IntStream.range(0, n).map(i -> s.nextInt()).toArray()) instanceof int[] c1
            && code.apply(IntStream.range(0, n).map(i -> s.nextInt()).toArray()) instanceof int[] c2
            && new int[]{0} instanceof int[] carry && new int[n] instanceof int[] r
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (Integer) (c1[i] + c2[i] + carry[0]) instanceof Integer d
                && (r[i] = d % (n - i)) >= 0 && (carry[0] = d / (n - i)) >= 0)
            && new int[n + 1] instanceof int[] bit2 && IntStream.rangeClosed(0, n).map(i -> bit2[i] = i & -i).sum() >= 0
            && new int[2] instanceof int[] st
            && Arrays.stream(r).map(k -> (st[0] = 0) * 0 + (st[1] = k) * 0
                + IntStream.iterate(Integer.highestOneBit(n), pw -> pw > 0, pw -> pw / 2)
                    .map(pw -> st[0] + pw <= n && bit2[st[0] + pw] <= st[1] ? (st[1] -= bit2[st[0] += pw]) * 0 : 0).sum() * 0
                + IntStream.iterate(st[0] + 1, j -> j <= n, j -> j + (j & -j)).map(j -> bit2[j]--).sum() * 0 + st[0]).toArray() instanceof int[] res
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
