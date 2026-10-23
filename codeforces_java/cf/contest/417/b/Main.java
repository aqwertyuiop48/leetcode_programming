import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, 100002).map(i -> -1).toArray() instanceof int[] mx
            && IntStream.range(0, n).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
                && x <= mx[k] + 1 && (mx[k] = Math.max(mx[k], x)) >= 0) ? "YES" : "NO");
    }
}
