import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new int[n] instanceof int[] l && new int[n] instanceof int[] r && new int[n] instanceof int[] st && new int[]{0} instanceof int[] sp
            && IntStream.range(0, n).allMatch(i -> Stream.generate(() -> 0).takeWhile(z -> sp[0] > 0 && a[st[sp[0] - 1]] >= a[i]).allMatch(z -> --sp[0] >= 0) && (l[i] = sp[0] == 0 ? -1 : st[sp[0] - 1]) > -2 && (st[sp[0]++] = i) >= 0)
            && (sp[0] = 0) == 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Stream.generate(() -> 0).takeWhile(z -> sp[0] > 0 && a[st[sp[0] - 1]] >= a[i]).allMatch(z -> --sp[0] >= 0) && (r[i] = sp[0] == 0 ? n : st[sp[0] - 1]) >= 0 && (st[sp[0]++] = i) >= 0)
            && new int[n + 2] instanceof int[] ans && IntStream.range(0, n).allMatch(i -> (Integer) (r[i] - l[i] - 1) instanceof Integer len && (ans[len] = Math.max(ans[len], a[i])) >= 0)
            && IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (ans[i] = Math.max(ans[i], ans[i + 1])) >= 0)
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining(" ")) : "");
    }
}
