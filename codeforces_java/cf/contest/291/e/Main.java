import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n - 1).mapToObj(i -> new Object[]{sc.nextInt(), sc.next()}).toList() instanceof List<Object[]> es
            && sc.next() instanceof String s && Integer.valueOf(s.length()) instanceof Integer L
            && new int[(L + 1) * 26] instanceof int[] aut && new int[L + 2] instanceof int[] f
            && IntStream.rangeClosed(0, L).allMatch(i -> IntStream.range(0, 26).allMatch(c -> (aut[i * 26 + c] = i < L && s.charAt(i) - 'a' == c ? i + 1 : i == 0 ? 0 : aut[f[i] * 26 + c]) >= 0)
                && (i >= L || (f[i + 1] = i == 0 ? 0 : aut[f[i] * 26 + s.charAt(i) - 'a']) >= 0))
            && new String[n] instanceof String[] st && new int[n] instanceof int[] par && new int[n] instanceof int[] state
            && IntStream.range(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> ch && (st[0] = "") != null
            && IntStream.range(0, n - 1).allMatch(i -> (st[i + 1] = (String) es.get(i)[1]) != null && (par[i + 1] = (Integer) es.get(i)[0] - 1) >= 0 && ch.get(par[i + 1]).add(i + 1))
            && new long[1] instanceof long[] ans && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).allMatch(x -> (x == 0 || (state[x] = IntStream.range(0, st[x].length()).reduce(state[par[x]], (cur, j) -> Integer.valueOf(aut[cur * 26 + st[x].charAt(j) - 'a']) instanceof Integer nx && (ans[0] += nx == L ? 1 : 0) >= 0 ? nx : 0)) >= 0)
                && ch.get(x).stream().allMatch(c -> dq.add(c)))
            ? ans[0] : "");
    }
}
