import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n && new long[n] instanceof long[] x && new long[n] instanceof long[] y
            && IntStream.range(0, n).allMatch(i -> (x[i] = Long.parseLong(st.nextToken())) == x[i] && (y[i] = Long.parseLong(st.nextToken())) == y[i])
            && ((IntToLongFunction) i -> (x[i] - x[0]) * (x[i] - x[0]) + (y[i] - y[0]) * (y[i] - y[0])) instanceof IntToLongFunction d
            && Integer.valueOf(IntStream.range(1, n).reduce((a, b) -> d.applyAsLong(a) <= d.applyAsLong(b) ? a : b).getAsInt()) instanceof Integer p1
            && Integer.valueOf(IntStream.range(1, n).filter(i -> i != p1 && (x[p1] - x[0]) * (y[i] - y[0]) - (y[p1] - y[0]) * (x[i] - x[0]) != 0)
                .reduce((a, b) -> d.applyAsLong(a) <= d.applyAsLong(b) ? a : b).getAsInt()) instanceof Integer p2
            ? "1 " + (p1 + 1) + " " + (p2 + 1) : "");
    }
}
