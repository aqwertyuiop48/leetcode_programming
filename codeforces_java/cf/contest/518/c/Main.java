import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] arr && new int[n + 1] instanceof int[] pos
            && IntStream.range(0, n).allMatch(i -> (pos[arr[i]] = i) >= 0)
            ? IntStream.range(0, m).mapToLong(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a
                ? pos[a] / k + 1 + (pos[a] > 0 && (Integer) arr[pos[a] - 1] instanceof Integer b && (arr[pos[a] - 1] = a) > 0 && (arr[pos[a]] = b) > 0 && (pos[b] = pos[a]) >= 0 && --pos[a] >= 0 ? 0 : 0) : 0).sum() : 0);
    }
}
