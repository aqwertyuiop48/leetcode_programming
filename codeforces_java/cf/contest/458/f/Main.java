import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Stream.generate(st::nextToken).limit(st.countTokens()).mapToInt(Integer::parseInt).toArray() instanceof int[] g
            && "23567aaagc5556h75a6bbh7bcch76h34789cifff7j98998e9fej7cce7jj857abc55577aaabbca5bhhbch77bcbb68bdehhkjjbbldeeshtj7cc777ccgi79cef77999cefeffejf9jec77jceeeac5h7aaacc555hh75ahbbh7bcch7hhai5h7aaacc555hh75ahbbh7bcch7hhaf5k9aamff5nokp9nqprlk7bcehjkkgf7j9ccfff7j9j99je9fej7cce7jjjcf7j9ccfff7j9j99je9fej7cce7jjj57abc55577aaabbca5bhhbch77bcbb5jabe55njjaaqblea5lkhbch77bcbb59alf55o99aqmlrfqnrpklch7jbell68bdehhkjjbblceebhej7cc777cccch9befhhp99blrefflkf9jec77jceee79cef77999cefeffejf9jec77jceee58ase55njjaaqblea5lkhbch77bcbbae5hjaaqee55nhkj5aklbh7bcch7hh69btfhhp99blrefflkf9jec77jceeebfhj9bbrffhkpj99kl9fej7cce7jjjbeh7jbbleehhk7jjhbjec77ccc7777hjbcehhkjjbblceebhej7cc777cccc77ccc77777ccccccc7c77cc777ccccbch77bbbcchhh777hb7cc77ccc7777cc777ccccc7777777c7cc77ccc7777ce77jcceee77j7jj7cjec77ccc7777h7bcchhh77bbbcccbhc77cc777cccc7jcce77jjjcceceec7ej7cc777cccc6jbgehhkjjbblceebhej7cc777cccch8biehhkjjbblceebhej7cc777cccc" instanceof String tb
            && "010110001101111110111101110111" instanceof String fv
            && new int[]{1} instanceof int[] ptr
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, g[0]).allMatch(tc ->
                (Integer) g[ptr[0]] instanceof Integer n
                && (ptr[0] += 1) > 0
                && new int[n] instanceof int[] lc
                && new int[n] instanceof int[] rc
                && new int[n] instanceof int[] vl
                && IntStream.range(0, n).allMatch(i ->
                    g[ptr[0]] == -1
                        ? (lc[i] = g[ptr[0] + 1]) >= 0 && (rc[i] = g[ptr[0] + 2]) >= 0 && (ptr[0] += 3) > 0
                        : (lc[i] = -1) < 0 && (vl[i] = g[ptr[0]]) >= 0 && (ptr[0] += 1) > 0)
                && new int[n] instanceof int[] ord
                && new int[]{1} instanceof int[] tl
                && IntStream.range(0, n).allMatch(q ->
                    q >= tl[0] || lc[ord[q]] < 0 || ((ord[tl[0]++] = lc[ord[q]]) >= 0 && (ord[tl[0]++] = rc[ord[q]]) >= 0))
                && new int[n] instanceof int[] cl
                && new int[]{0, 1000} instanceof int[] bs
                && IntStream.range(0, 12).allMatch(z ->
                    bs[0] >= bs[1]
                    || (Integer) ((bs[0] + bs[1] + 1) / 2) instanceof Integer mid
                    && IntStream.range(0, n).map(q -> n - 1 - q).allMatch(q ->
                        (Integer) ord[q] instanceof Integer v
                        && (cl[v] = lc[v] < 0 ? (vl[v] >= mid ? 1 : 0) : Character.digit(tb.charAt(cl[lc[v]] * 30 + cl[rc[v]]), 36)) >= 0)
                    && (fv.charAt(cl[0]) == (char) 49 ? (bs[0] = mid) >= 0 : (bs[1] = mid - 1) >= 0))
                && sb.append(bs[0]).append((char) 10) != null)
            ? sb.toString()
            : "");
    }
}
