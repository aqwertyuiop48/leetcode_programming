import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] k
            ? IntStream.range(0, n).map(i -> 15 * k[i] + 5 * IntStream.range(0, k[i]).map(j -> Integer.parseInt(tk.nextToken())).sum()).min().getAsInt() : 0);
    }
}
