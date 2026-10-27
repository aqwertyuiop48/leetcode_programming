import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> sc.next()).toList() instanceof List<String> ss
            && Integer.valueOf(ss.stream().mapToInt(String::length).sum() * 2 + 5) instanceof Integer S
            && new int[S * 26] instanceof int[] nx && new int[S] instanceof int[] link && new int[S] instanceof int[] len && new int[S] instanceof int[] cnt && new int[S] instanceof int[] mark && new int[S] instanceof int[] good
            && new int[1] instanceof int[] sz && (link[0] = -1) == -1
            && ((IntBinaryOperator) (q, nl) -> Integer.valueOf(++sz[0]) instanceof Integer cl && (len[cl] = nl) >= 0
                && IntStream.range(0, 26).allMatch(j -> (nx[cl * 26 + j] = nx[q * 26 + j]) >= 0) && (link[cl] = link[q]) >= -1 ? cl : -2) instanceof IntBinaryOperator mk
            && ((IntBinaryOperator) (last, c) -> Integer.valueOf(nx[last * 26 + c]) instanceof Integer q0 && q0 != 0
                ? len[q0] == len[last] + 1 ? q0
                    : Integer.valueOf(mk.applyAsInt(q0, len[last] + 1)) instanceof Integer cl && (link[q0] = cl) >= 0
                        && IntStream.iterate(last, x -> x != -1 && nx[x * 26 + c] == q0, x -> link[x]).allMatch(x -> (nx[x * 26 + c] = cl) > 0) ? cl : -2
                : Integer.valueOf(++sz[0]) instanceof Integer cur && (len[cur] = len[last] + 1) > 0
                    && Integer.valueOf(IntStream.iterate(last, x -> x == -1 ? -1 : link[x]).filter(x -> x == -1 || nx[x * 26 + c] != 0).findFirst().getAsInt()) instanceof Integer p
                    && IntStream.iterate(last, x -> x != p, x -> link[x]).allMatch(x -> (nx[x * 26 + c] = cur) > 0)
                    && Integer.valueOf(p == -1 ? 0 : nx[p * 26 + c]) instanceof Integer q
                    ? p == -1 ? (link[cur] = 0) * 0 + cur
                        : len[p] + 1 == len[q] ? (link[cur] = q) * 0 + cur
                        : Integer.valueOf(mk.applyAsInt(q, len[p] + 1)) instanceof Integer cl && (link[q] = cl) >= 0 && (link[cur] = cl) >= 0
                            && IntStream.iterate(p, x -> x != -1 && nx[x * 26 + c] == q, x -> link[x]).allMatch(x -> (nx[x * 26 + c] = cl) > 0) ? cur : -2
                    : -2) instanceof IntBinaryOperator ext
            && ss.stream().allMatch(s -> s.chars().reduce(0, (last, ch) -> ext.applyAsInt(last, ch - 'a')) >= 0)
            && IntStream.range(0, n).allMatch(i -> ss.get(i).chars().reduce(0, (v, ch) -> Integer.valueOf(nx[v * 26 + ch - 'a']) instanceof Integer w
                && IntStream.iterate(w, x -> x > 0 && mark[x] != i + 1, x -> link[x]).allMatch(x -> (mark[x] = i + 1) > 0 && ++cnt[x] > 0) ? w : -1) >= 0)
            && IntStream.rangeClosed(1, sz[0]).boxed().sorted(Comparator.comparingInt(x -> len[x])).allMatch(x -> (good[x] = cnt[x] >= k ? len[x] : good[link[x]]) >= 0)
            && new int[1] instanceof int[] st
            ? ss.stream().map(s -> (st[0] = 0) == 0 ? String.valueOf(IntStream.range(0, s.length()).mapToLong(j -> (st[0] = nx[st[0] * 26 + s.charAt(j) - 'a']) >= 0 ? cnt[st[0]] >= k ? j + 1 : good[link[st[0]]] : 0).sum()) : "").collect(Collectors.joining(" "))
            : "");
    }
}

