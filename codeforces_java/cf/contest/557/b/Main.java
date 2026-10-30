import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer w
            && IntStream.range(0, 2 * n).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] a
            ? String.format(Locale.ROOT, "%.9f", 3.0 * n * Math.min(Math.min(a[0], a[n] / 2.0), w / (3.0 * n))) : "");
    }
}
