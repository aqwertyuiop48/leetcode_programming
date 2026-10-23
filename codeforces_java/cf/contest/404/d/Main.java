import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s && (Integer) s.length() instanceof Integer n
            && new long[4] instanceof long[] st && new long[4] instanceof long[] nd
            && IntStream.range(0, 2).allMatch(c -> (st[c] = c == 1 ? (s.charAt(0) == '*' || s.charAt(0) == '?' ? 1 : 0) : (s.charAt(0) != '*' ? 1 : 0)) >= 0)
            && IntStream.range(0, n - 1).allMatch(i -> IntStream.range(0, 8).allMatch(q -> (q & 3) >= 0 && st[q >> 1] == 0
                || ((q & 1) == 1 ? s.charAt(i + 1) == '*' || s.charAt(i + 1) == '?' : s.charAt(i + 1) != '*')
                && ((q >> 1 & 1) == 1 || !Character.isDigit(s.charAt(i)) || (q >> 2) + (q & 1) == s.charAt(i) - '0')
                    ? (nd[(q >> 1 & 1) * 2 + (q & 1)] = (nd[(q >> 1 & 1) * 2 + (q & 1)] + st[q >> 1]) % 1000000007L) >= 0 : true)
                && IntStream.range(0, 4).allMatch(j -> (st[j] = nd[j]) >= 0 && (nd[j] = 0) == 0))
            ? IntStream.range(0, 4).filter(q -> (q & 1) == 1 || !Character.isDigit(s.charAt(n - 1)) || (q >> 1) == s.charAt(n - 1) - '0').mapToLong(q -> st[q]).sum() % 1000000007L : 0);
    }
}
