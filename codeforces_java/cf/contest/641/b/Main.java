import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m && Integer.valueOf(tk.nextToken()) instanceof Integer q
            && new int[q][4] instanceof int[][] op
            && IntStream.range(0, q).filter(i -> (op[i][0] = Integer.parseInt(tk.nextToken())) > 0 & (op[i][1] = Integer.parseInt(tk.nextToken())) > 0
                & (op[i][0] != 3 || ((op[i][2] = Integer.parseInt(tk.nextToken())) > 0 & (op[i][3] = Integer.parseInt(tk.nextToken())) > -1))).count() >= 0
            && new int[n * m] instanceof int[] g
            && IntStream.range(0, q).filter(k -> op[q - 1 - k] instanceof int[] o
                && (o[0] == 3 ? (g[(o[1] - 1) * m + o[2] - 1] = o[3]) >= 0
                    : o[0] == 1 ? IntStream.range(0, m).map(j -> g[(o[1] - 1) * m + (j + m - 1) % m]).toArray() instanceof int[] t && Stream.of(0).peek(z -> System.arraycopy(t, 0, g, (o[1] - 1) * m, m)).findFirst().isPresent()
                    : IntStream.range(0, n).map(i -> g[((i + n - 1) % n) * m + o[1] - 1]).toArray() instanceof int[] u && IntStream.range(0, n).filter(i -> (g[i * m + o[1] - 1] = u[i]) >= 0).count() >= 0)).count() >= 0
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j -> String.valueOf(g[i * m + j])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
