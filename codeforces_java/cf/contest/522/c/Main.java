import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer tests
            ? IntStream.range(0, tests).mapToObj(tc -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
                && IntStream.range(0, k).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] a
                && IntStream.range(0, m - 1).mapToObj(i -> new int[]{Integer.parseInt(tk.nextToken()), Integer.parseInt(tk.nextToken())}).toList() instanceof List<int[]> ps
                && (Integer) IntStream.range(0, m - 1).filter(i -> ps.get(i)[1] == 1).findFirst().orElse(m - 1) instanceof Integer p
                && new int[k + 1] instanceof int[] cb && new int[k + 1] instanceof int[] ct
                && IntStream.range(0, m - 1).allMatch(i -> ps.get(i)[0] == 0 || (i < p ? ++cb[ps.get(i)[0]] > 0 : true) && ++ct[ps.get(i)[0]] > 0)
                && (Integer) (int) IntStream.range(0, m - 1).filter(i -> ps.get(i)[0] == 0).count() instanceof Integer ut
                && (Integer) (int) IntStream.range(0, p).filter(i -> ps.get(i)[0] == 0).count() instanceof Integer up
                && (Integer) (p == m - 1 ? 0 : IntStream.rangeClosed(1, k).filter(d -> a[d - 1] - cb[d] <= up && (p >= m - 1 || ps.get(p)[0] != d)).map(d -> Math.max(0, a[d - 1] - cb[d])).min().orElse(0)) instanceof Integer mn
                ? IntStream.rangeClosed(1, k).mapToObj(e -> p < m - 1 && a[e - 1] - cb[e] <= up && ps.get(p)[0] != e || a[e - 1] - ct[e] <= ut - mn ? "Y" : "N").collect(Collectors.joining()) : "").collect(Collectors.joining("\n")) : "");
    }
}
