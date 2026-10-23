import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new long[m] instanceof long[] f
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).allMatch(j -> (f[j] = Math.max(f[j], j == 0 ? 0 : f[j - 1]) + Integer.parseInt(tk.nextToken())) > 0) ? String.valueOf(f[m - 1]) : "").collect(Collectors.joining(" ")) : "");
    }
}
