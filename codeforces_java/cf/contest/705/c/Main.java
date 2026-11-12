import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni
            && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer q
            && new int[n + 1] instanceof int[] cur && new int[n + 1] instanceof int[] last && new int[q + 2] instanceof int[] nx
            && new boolean[q + 2] instanceof boolean[] rd && new int[3] instanceof int[] sts
            ? IntStream.range(0, q).mapToObj(e -> Integer.valueOf(ni.getAsInt()) instanceof Integer t && Integer.valueOf(ni.getAsInt()) instanceof Integer x
                ? String.valueOf(t == 1
                    ? (++sts[0]) * 0 + (last[x] == 0 ? (cur[x] = sts[0]) : (nx[last[x]] = sts[0])) * 0 + (last[x] = sts[0]) * 0 + ++sts[2]
                    : t == 2
                        ? (sts[2] -= (int) IntStream.iterate(cur[x], j -> j != 0, j -> nx[j]).filter(j -> !rd[j] && (rd[j] = true)).count()) + 0 * (cur[x] = 0) + 0 * (last[x] = 0)
                        : (sts[2] -= (int) IntStream.rangeClosed(sts[1] + 1, x).filter(j -> !rd[j] && (rd[j] = true)).count()) + 0 * (sts[1] = Math.max(sts[1], x)))
                : "").collect(Collectors.joining("\n")) : "");
    }
}
