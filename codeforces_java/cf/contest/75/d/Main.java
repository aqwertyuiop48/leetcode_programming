import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && Integer.valueOf(s.nextInt()) instanceof Integer m
                && Long.valueOf(-(1L << 60)) instanceof Long neg
                && IntStream.range(0, n).mapToObj(i ->
                    new long[]{neg, neg, 0, neg, 0} instanceof long[] z
                    && IntStream.range(0, s.nextInt()).allMatch(j ->
                        Long.valueOf(s.nextLong()) instanceof Long x
                        && (z[0] = Math.max(x, z[0] + x)) == z[0]
                        && (z[1] = Math.max(z[1], z[0])) == z[1]
                        && (z[4] = Math.min(z[4], z[2])) == z[4]
                        && (z[2] += x) == z[2]
                        && (z[3] = Math.max(z[3], z[2])) == z[3])
                    ? new long[]{z[2], z[3], z[2] - z[4], z[1]}
                    : null).toList() instanceof List<long[]> st
                && new long[]{neg, neg} instanceof long[] r
                && IntStream.range(0, m).allMatch(i ->
                    st.get(s.nextInt() - 1) instanceof long[] a
                    && (r[0] = Math.max(r[0], Math.max(a[3], r[1] + a[1]))) == r[0]
                    && (r[1] = Math.max(a[2], r[1] + a[0])) == r[1])
                ? r[0]
                : 0L));
    }
}




