import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((LongSupplier) () -> Long.parseLong(st.nextToken())) instanceof LongSupplier nx
            && Integer.valueOf((int) nx.getAsLong()) instanceof Integer n && Integer.valueOf((int) nx.getAsLong()) instanceof Integer q
            && LongStream.generate(nx).limit(n).toArray() instanceof long[] cur
            && new long[q] instanceof long[] qt && new long[q] instanceof long[] qa && new long[q] instanceof long[] qb
            && IntStream.range(0, q).allMatch(i -> (qt[i] = nx.getAsLong()) > 0 && (qa[i] = nx.getAsLong()) >= 0 && (qt[i] != 1 || (qb[i] = nx.getAsLong()) >= 0))
            && LongStream.concat(LongStream.of(cur), IntStream.range(0, q).filter(i -> qt[i] == 1).mapToLong(i -> qb[i])).distinct().sorted().toArray() instanceof long[] vals
            && Integer.valueOf(vals.length) instanceof Integer K && new long[K + 1] instanceof long[] fc && new long[K + 1] instanceof long[] fs && new long[K + 2] instanceof long[] pc
            && ((LongBinaryOperator) (val, sg) -> Integer.valueOf(Arrays.binarySearch(vals, val) + 1) instanceof Integer b && (pc[b] += sg) >= 0
                && IntStream.iterate(b, j -> j <= K, j -> j + (j & -j)).allMatch(j -> (fc[j] += sg) >= 0 && (fs[j] += sg * val) >= 0) ? 1 : 0) instanceof LongBinaryOperator upd
            && Arrays.stream(cur).allMatch(x -> upd.applyAsLong(x, 1) == 1)
            ? IntStream.range(0, q).mapToObj(i -> qt[i] == 1
                ? upd.applyAsLong(cur[(int) qa[i] - 1], -1) == 1 && upd.applyAsLong(qb[i], 1) == 1 && (cur[(int) qa[i] - 1] = qb[i]) >= 0 ? "" : ""
                : new long[]{0, 0, 0} instanceof long[] s
                    && IntStream.iterate(Integer.highestOneBit(K), k -> k > 0, k -> k >> 1).allMatch(k -> s[0] + k >= K
                        || (s[1] + fc[(int) (s[0] + k)]) * vals[(int) (s[0] + k)] - (s[2] + fs[(int) (s[0] + k)]) > qa[i]
                        || (s[0] += k) > 0 && (s[1] += fc[(int) s[0]]) >= 0 && (s[2] += fs[(int) s[0]]) >= 0)
                    && Long.valueOf(s[1] + pc[(int) s[0] + 1]) instanceof Long c
                    && Long.valueOf(qa[i] + s[2] + pc[(int) s[0] + 1] * vals[(int) s[0]]) instanceof Long num
                    && Long.valueOf(num / c * 100000 + (num % c * 100000 + c / 2) / c) instanceof Long tot
                    ? tot / 100000 + "." + String.valueOf(100000 + tot % 100000).substring(1) : "").filter(x -> !x.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
