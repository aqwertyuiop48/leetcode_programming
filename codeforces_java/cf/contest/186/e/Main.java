import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(tk.nextToken())).toArray() instanceof long[] a
            && IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n - i).mapToLong(j -> Long.parseLong(tk.nextToken())).toArray()).toArray(long[][]::new) instanceof long[][] w
            && new long[n][] instanceof long[][] c && (c[0] = a) != null
            && IntStream.range(0, n - 1).allMatch(i -> (c[i + 1] = IntStream.range(0, n - i - 1).mapToLong(j -> Math.min(4_000_000_000L, (c[i][j] >= w[i][j] ? c[i][j] : 0) + (c[i][j + 1] >= w[i][j + 1] ? c[i][j + 1] : 0))).toArray()) != null)
            ? (c[n - 1][0] >= w[n - 1][0] ? "Cerealguy" : "Fat Rat") : "");
    }
}
