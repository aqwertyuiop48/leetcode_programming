import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && new int[n + 2] instanceof int[] L && new int[n + 2] instanceof int[] R
            && IntStream.range(0, n).allMatch(i -> (L[i + 1] = i > 0 && a[i] > a[i - 1] ? L[i] + 1 : 1) > 0)
            && IntStream.range(0, n).map(i -> n - 1 - i).allMatch(i -> (R[i + 1] = i < n - 1 && a[i] < a[i + 1] ? R[i + 2] + 1 : 1) > 0)
            ? IntStream.range(0, n).map(i -> Math.max(Math.max(L[i] + 1, R[i + 2] + 1), i > 0 && i < n - 1 && a[i + 1] - a[i - 1] >= 2 ? L[i] + 1 + R[i + 2] : 0)).max().getAsInt() : 0);
    }
}
