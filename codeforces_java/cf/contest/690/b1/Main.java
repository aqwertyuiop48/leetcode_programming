import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> st.nextToken()).toArray(String[]::new) instanceof String[] rows
            && IntStream.range(0, n * n).filter(p -> rows[p / n].charAt(p % n) != '0').toArray() instanceof int[] nz
            && nz.length > 0
            && Integer.valueOf(Arrays.stream(nz).map(p -> p % n + 1).min().getAsInt()) instanceof Integer minx
            && Integer.valueOf(Arrays.stream(nz).map(p -> p % n + 1).max().getAsInt()) instanceof Integer maxx
            && Integer.valueOf(Arrays.stream(nz).map(p -> n - p / n).min().getAsInt()) instanceof Integer miny
            && Integer.valueOf(Arrays.stream(nz).map(p -> n - p / n).max().getAsInt()) instanceof Integer maxy
            && IntStream.range(0, 16).anyMatch(m ->
                ((m & 1) == 0 || minx == 1) && ((m & 2) == 0 || maxx == n) && ((m & 4) == 0 || miny == 1) && ((m & 8) == 0 || maxy == n)
                && Integer.valueOf((m & 1) == 0 ? minx : 0) instanceof Integer x1
                && Integer.valueOf((m & 2) == 0 ? maxx - 1 : n) instanceof Integer x2
                && Integer.valueOf((m & 4) == 0 ? miny : 0) instanceof Integer y1
                && Integer.valueOf((m & 8) == 0 ? maxy - 1 : n) instanceof Integer y2
                && x1 < x2 && y1 < y2
                && IntStream.range(0, n * n).allMatch(p -> Integer.valueOf(p % n + 1) instanceof Integer x
                    && Integer.valueOf(n - p / n) instanceof Integer y
                    && ((x - 1 >= x1 && x - 1 <= x2 ? 1 : 0) + (x >= x1 && x <= x2 ? 1 : 0))
                        * ((y - 1 >= y1 && y - 1 <= y2 ? 1 : 0) + (y >= y1 && y <= y2 ? 1 : 0)) == rows[p / n].charAt(p % n) - '0'))
            ? "Yes" : "No");
    }
}
