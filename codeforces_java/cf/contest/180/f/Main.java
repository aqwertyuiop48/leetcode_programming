import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] b
            && new int[n + 1] instanceof int[] p
            && IntStream.range(0, n).allMatch(i -> (p[a[i]] = b[i]) > 0)
            ? IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(p[i])).collect(Collectors.joining(" "))
            : "");
    }
}



