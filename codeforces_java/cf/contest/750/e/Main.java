import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer q && t[2] instanceof String s
            && Integer.valueOf(Integer.highestOneBit(Math.max(n, 2) - 1) << 1) instanceof Integer size
            && new int[2 * size * 25] instanceof int[] tr
            && IntStream.range(0, size).allMatch(i -> Integer.valueOf((size + i) * 25) instanceof Integer base
                && IntStream.range(0, 25).allMatch(j -> (tr[base + j] = j / 5 == j % 5 ? 0 : 500000000) >= 0)
                && Character.valueOf(i < n ? s.charAt(i) : 'x') instanceof Character c
                && (c == '2' ? (tr[base] = 1) + (tr[base + 1] = 0)
                    : c == '0' ? (tr[base + 6] = 1) + (tr[base + 7] = 0)
                    : c == '1' ? (tr[base + 12] = 1) + (tr[base + 13] = 0)
                    : c == '7' ? (tr[base + 18] = 1) + (tr[base + 19] = 0)
                    : c == '6' ? (tr[base + 18] = 1) + (tr[base + 24] = 1) : 0) >= 0)
            && ((java.util.function.IntBinaryOperator) (a, b) -> Math.min(500000000, Math.min(Math.min(Math.min(tr[a] + tr[b], tr[a + 1] + tr[b + 5]), Math.min(tr[a + 2] + tr[b + 10], tr[a + 3] + tr[b + 15])), tr[a + 4] + tr[b + 20]))) instanceof java.util.function.IntBinaryOperator mm
            && IntStream.iterate(size - 1, i -> i >= 1, i -> i - 1).allMatch(i -> IntStream.range(0, 25).allMatch(j -> (tr[i * 25 + j] = mm.applyAsInt(2 * i * 25 + j / 5 * 5, (2 * i + 1) * 25 + j % 5)) >= 0))
            && new int[1][] instanceof int[][] vh && new int[64] instanceof int[] sk && new int[]{0, 0, 0} instanceof int[] st && new StringBuilder() instanceof StringBuilder sb
            && ((java.util.function.IntBinaryOperator) (bs, c) -> Math.min(500000000, Math.min(Math.min(Math.min(vh[0][0] + tr[bs + c], vh[0][1] + tr[bs + 5 + c]), Math.min(vh[0][2] + tr[bs + 10 + c], vh[0][3] + tr[bs + 15 + c])), vh[0][4] + tr[bs + 20 + c]))) instanceof java.util.function.IntBinaryOperator col
            && ((java.util.function.IntPredicate) nd -> (vh[0] = new int[]{col.applyAsInt(nd * 25, 0), col.applyAsInt(nd * 25, 1), col.applyAsInt(nd * 25, 2), col.applyAsInt(nd * 25, 3), col.applyAsInt(nd * 25, 4)}) != null) instanceof java.util.function.IntPredicate ap
            && IntStream.range(0, q).allMatch(qi -> Integer.valueOf(t[3 + 2 * qi]) instanceof Integer l && Integer.valueOf(t[4 + 2 * qi]) instanceof Integer r
                && (vh[0] = new int[]{0, 500000000, 500000000, 500000000, 500000000}) != null && (st[0] = l - 1 + size) >= 0 && (st[1] = r + size) >= 0 && (st[2] = 0) == 0
                && IntStream.iterate(0, k -> st[0] < st[1], k -> k + 1).allMatch(k -> ((st[0] & 1) == 1 ? ap.test(st[0]++) : true)
                    && ((st[1] & 1) == 1 ? (sk[st[2]++] = --st[1]) >= 0 : true) && (st[0] >>= 1) >= 0 && (st[1] >>= 1) >= 0)
                && IntStream.iterate(st[2] - 1, k -> k >= 0, k -> k - 1).peek(k -> ap.test(sk[k])).count() >= 0
                && sb.append(vh[0][4] >= 500000000 ? -1 : vh[0][4]).append('\n') != null)
            ? sb : "");
    }
}
