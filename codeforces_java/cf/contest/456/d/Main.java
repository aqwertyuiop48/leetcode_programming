import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] w
            && (Integer) Integer.parseInt(w[0]) instanceof Integer n
            && (Integer) Integer.parseInt(w[1]) instanceof Integer k
            && new int[(w.length * 8 + 1000000) / 8 * 26 + 26] instanceof int[] trie
            && new int[2] instanceof int[] st
            && IntStream.range(0, n).allMatch(i ->
                (st[0] = 0) == 0
                && w[2 + i].chars().allMatch(ch ->
                    (st[0] = trie[st[0] * 26 + ch - 'a'] != 0 ? trie[st[0] * 26 + ch - 'a'] : (trie[st[0] * 26 + ch - 'a'] = ++st[1])) >= 0))
            && new boolean[st[1] + 1] instanceof boolean[] win
            && new boolean[st[1] + 1] instanceof boolean[] lose
            && IntStream.rangeClosed(0, st[1]).allMatch(i ->
                (Integer) (st[1] - i) instanceof Integer v
                && ((win[v] = IntStream.range(0, 26).anyMatch(c -> trie[v * 26 + c] != 0 && !win[trie[v * 26 + c]])) || true)
                && ((lose[v] = IntStream.range(0, 26).noneMatch(c -> trie[v * 26 + c] != 0)
                    || IntStream.range(0, 26).anyMatch(c -> trie[v * 26 + c] != 0 && !lose[trie[v * 26 + c]])) || true))
            ? win[0] && (lose[0] || k % 2 == 1) ? "First" : "Second" : "");
    }
}
