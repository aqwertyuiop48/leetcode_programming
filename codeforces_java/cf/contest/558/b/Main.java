import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a && new int[1000001] instanceof int[] cnt && new int[1000001] instanceof int[] fst && new int[1000001] instanceof int[] lst
            && IntStream.range(0, n).allMatch(i -> ++cnt[a[i]] > 0 && (fst[a[i]] > 0 || (fst[a[i]] = i + 1) > 0) && (lst[a[i]] = i + 1) > 0)
            && IntStream.range(0, n).boxed().min(Comparator.comparingInt((Integer i) -> -cnt[a[i]]).thenComparingInt(i -> lst[a[i]] - fst[a[i]])).get() instanceof Integer b
            ? fst[a[b]] + " " + lst[a[b]] : "");
    }
}
