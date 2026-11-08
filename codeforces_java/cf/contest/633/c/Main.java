import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[2]) instanceof Integer m && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(Arrays.stream(t, 3, m + 3).mapToInt(String::length).max().getAsInt()) instanceof Integer mx
            && new int[26 * (Arrays.stream(t, 3, m + 3).mapToInt(String::length).sum() + 2)] instanceof int[] ch
            && new int[ch.length / 26 + 1] instanceof int[] term && new int[]{0, 0} instanceof int[] st
            && IntStream.range(0, m).allMatch(w -> t[3 + w] instanceof String s && (st[0] = 0) == 0
                && IntStream.range(0, s.length()).allMatch(p -> Integer.valueOf(st[0] * 26 + Character.toLowerCase(s.charAt(s.length() - 1 - p)) - 'a') instanceof Integer ci
                    && (st[0] = ch[ci] == 0 ? (ch[ci] = ++st[1]) : ch[ci]) > 0)
                && (term[st[0]] = 3 + w) > 0)
            && new int[n + 1] instanceof int[] nxt && new int[n + 1] instanceof int[] pick && (nxt[n] = n) == n && t[1].getBytes() instanceof byte[] cb
            && IntStream.range(0, n).allMatch(tt -> Integer.valueOf(n - 1 - tt) instanceof Integer i && (st[0] = 0) == 0
                && (IntStream.range(i, Math.min(n, i + mx)).filter(j -> (st[0] = st[0] < 0 || ch[st[0] * 26 + cb[j] - 'a'] == 0 ? -1 : ch[st[0] * 26 + cb[j] - 'a']) > 0 && term[st[0]] > 0 && nxt[j + 1] > 0 && (nxt[i] = j + 1) > 0 && (pick[i] = term[st[0]]) > 0).count() >= 0))
            ? Stream.iterate(0, i -> i < n, i -> nxt[i]).map(i -> t[pick[i]]).collect(Collectors.joining(" ")) : "");
    }
}
