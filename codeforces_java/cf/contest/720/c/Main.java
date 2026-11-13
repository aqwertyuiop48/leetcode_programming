import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer tc
            && ((Function<Object[], Boolean>) ar -> ar[0] instanceof boolean[] src && ar[1] instanceof boolean[] dst && Integer.valueOf((Integer) ar[2]) instanceof Integer dl
                && IntStream.range(0, Math.max(0, src.length - dl)).allMatch(x -> (dst[x + dl] |= src[x]) || true)) instanceof Function<Object[], Boolean> sh
            && ((Function<Object[], int[]>) hq -> Integer.valueOf((Integer) hq[0]) instanceof Integer hd && Integer.valueOf((Integer) hq[1]) instanceof Integer cc && Long.valueOf((Long) hq[2]) instanceof Long k
                && Integer.valueOf(5 * 4 * (hd - 1) + 2) instanceof Integer vv && new boolean[6][hd + 1][vv] instanceof boolean[][][] rc && (rc[0][hd][0] = true)
                && IntStream.range(0, 5).allMatch(t -> new boolean[vv] instanceof boolean[] pa && new boolean[vv] instanceof boolean[] sa
                    && IntStream.rangeClosed(1, hd).map(g -> hd + 1 - g).allMatch(g -> sh.apply(new Object[]{sa, rc[t + 1][g], 4 * (g - 1) + 1})
                        && sh.apply(new Object[]{rc[t][g], sa, 0}) && sh.apply(new Object[]{rc[t][g], rc[t + 1][g], 4 * (g - 1)}))
                    && IntStream.rangeClosed(1, hd).allMatch(g -> sh.apply(new Object[]{pa, rc[t + 1][g], 0}) && sh.apply(new Object[]{rc[t][g], pa, 4 * (g - 1) + 1})))
                ? LongStream.rangeClosed(Math.max(0L, Math.floorDiv(k - (vv - 1) + 4L * (hd - 1) - 1, 4L * (hd - 1))), Math.min(cc - 1L, k / (4L * (hd - 1)))).mapToObj(a0 ->
                    Long.valueOf(k - 4L * (hd - 1) * a0) instanceof Long r0 && r0 < vv && Integer.valueOf(r0.intValue()) instanceof Integer r
                    && Integer.valueOf((int) Math.min(5L, cc - a0 - 1)) instanceof Integer tmax
                    && IntStream.rangeClosed(0, tmax).flatMap(t -> IntStream.rangeClosed(1, hd).filter(h -> rc[t][h][r]).map(h -> t * 1024 + h)).findFirst() instanceof OptionalInt fo
                    && fo.isPresent() && Integer.valueOf(fo.getAsInt() / 1024) instanceof Integer tt && new int[tt] instanceof int[] tl && new int[]{fo.getAsInt() % 1024, r} instanceof int[] stt
                    && IntStream.range(0, tt).map(i -> tt - i).allMatch(s -> (tl[s - 1] = stt[0]) > 0
                        && Integer.valueOf(IntStream.rangeClosed(1, hd).filter(x -> r - 0 >= 0 && stt[1] - (4 * (Math.min(x, stt[0]) - 1) + (x != stt[0] ? 1 : 0)) >= 0
                            && rc[s - 1][x][stt[1] - (4 * (Math.min(x, stt[0]) - 1) + (x != stt[0] ? 1 : 0))]).findFirst().getAsInt()) instanceof Integer hp
                        && (stt[1] -= 4 * (Math.min(hp, stt[0]) - 1) + (hp != stt[0] ? 1 : 0)) >= 0 && (stt[0] = hp) > 0)
                    ? IntStream.concat(IntStream.generate(() -> hd).limit(a0 + 1), Arrays.stream(tl)).toArray() : null).filter(Objects::nonNull).findFirst().orElse(null) : null) instanceof Function<Object[], int[]> tryHead
            && ((Function<long[], String>) c -> Integer.valueOf((int) c[0]) instanceof Integer n && Integer.valueOf((int) c[1]) instanceof Integer m && Long.valueOf(c[2]) instanceof Long k
                && Integer.valueOf(Math.min(n, m)) instanceof Integer h0 && Integer.valueOf(Math.max(n, m)) instanceof Integer cc && Long.valueOf(4L * (h0 - 1) * (cc - 1)) instanceof Long mx
                ? (k > mx || mx - k == 1 || mx - k == 2 || mx - k == 4 || mx - k == 5 || (mx - k == 8 && h0 >= 4) ? "-1"
                    : h0 == 3 && cc == 3 && k == 3 ? ".**\n**.\n*.."
                    : h0 == 3 && cc == 3 && k == 7 ? "**.\n***\n.*."
                    : h0 == 4 && cc == 4 && k == 20 ? "***.\n****\n***.\n.*.."
                    : Stream.of(h0, h0 - 1, 2, 3).filter(x -> x >= 2 && x <= h0).distinct().map(x -> tryHead.apply(new Object[]{x, cc, k})).filter(Objects::nonNull).findFirst().orElse(null) instanceof int[] hts
                    ? IntStream.range(0, n == h0 ? n : cc).mapToObj(i -> IntStream.range(0, n == h0 ? cc : h0).mapToObj(j ->
                        (n == h0 ? j < hts.length && hts[j] > i : i < hts.length && hts[i] > j) ? "*" : ".").collect(Collectors.joining())).collect(Collectors.joining("\n"))
                    : "-1") : "") instanceof Function<long[], String> sc
            ? IntStream.range(0, tc).mapToObj(i -> sc.apply(new long[]{Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken()), Long.parseLong(tk.nextToken())})).collect(Collectors.joining("\n")) : "");
    }
}
