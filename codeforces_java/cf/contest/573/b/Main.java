import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] h && new int[n] instanceof int[] L && new int[n] instanceof int[] R
            && IntStream.range(0, n).filter(i -> (L[i] = Math.min(h[i], (i > 0 ? L[i - 1] : 0) + 1)) < 0).count() >= 0
            && IntStream.range(0, n).map(i -> n - 1 - i).filter(i -> (R[i] = Math.min(h[i], (i < n - 1 ? R[i + 1] : 0) + 1)) < 0).count() >= 0
            ? IntStream.range(0, n).map(i -> Math.min(L[i], R[i])).max().getAsInt() : -1);
    }
}
