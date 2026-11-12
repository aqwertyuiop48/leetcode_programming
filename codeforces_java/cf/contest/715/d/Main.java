import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long T
            && new long[]{T} instanceof long[] cur && new int[40] instanceof int[] mk && new int[1] instanceof int[] kk
            && new int[]{0, 1, 3, 4, 5, 7, 12, 13, 15} instanceof int[] MF
            && new int[][]{{}, {2223, 3233}, {2122, 3233}, {3233}, {2122}, {3132}, {}} instanceof int[][] BASE
            && IntStream.range(0, 40).allMatch(z -> cur[0] <= 6
                || Integer.valueOf((int) (cur[0] % 6)) instanceof Integer r
                && Integer.valueOf(r + 6 <= 8 && cur[0] - (r + 6) >= 6 && Integer.bitCount(MF[r + 6]) > Integer.bitCount(MF[r]) ? r + 6 : r) instanceof Integer s
                && (mk[kk[0]++] = MF[s]) >= 0 && (cur[0] = (cur[0] - s) / 6) > 0)
            && Integer.valueOf(kk[0] + 1) instanceof Integer K
            && Stream.concat(Stream.concat(
                    Arrays.stream(BASE[(int) cur[0]]).mapToObj(c -> new int[]{c / 1000, c / 100 % 10, c / 10 % 10, c % 10}),
                    K >= 2 ? Stream.of(new int[]{2, 3, 2, 4}, new int[]{3, 2, 4, 2}, new int[]{1, 4, 1, 5}, new int[]{4, 1, 5, 1}) : Stream.<int[]>empty()),
                IntStream.range(1, K).boxed().flatMap(j -> Integer.valueOf(2 * j + 1) instanceof Integer a && Integer.valueOf(mk[K - 1 - j]) instanceof Integer mask
                    ? Stream.of(
                        (mask & 1) == 0 ? new int[]{a - 1, a + 2, a, a + 2} : null,
                        (mask & 2) == 0 ? new int[]{a + 2, a - 1, a + 2, a} : null,
                        (mask & 4) == 0 ? new int[]{a - 1, a + 1, a, a + 1} : null,
                        (mask & 8) == 0 ? new int[]{a + 1, a - 1, a + 1, a} : null,
                        j <= K - 2 ? new int[]{a, a + 2, a, a + 3} : null,
                        j <= K - 2 ? new int[]{a + 1, a + 2, a + 1, a + 3} : null,
                        j <= K - 2 ? new int[]{a + 2, a, a + 3, a} : null,
                        j <= K - 2 ? new int[]{a + 2, a + 1, a + 3, a + 1} : null,
                        j <= K - 2 ? new int[]{a - 1, a + 3, a - 1, a + 4} : null,
                        j <= K - 2 ? new int[]{a, a + 3, a, a + 4} : null,
                        j <= K - 2 ? new int[]{a + 3, a - 1, a + 4, a - 1} : null,
                        j <= K - 2 ? new int[]{a + 3, a, a + 4, a} : null).filter(Objects::nonNull)
                    : Stream.<int[]>empty()))
                .map(v -> v[0] + " " + v[1] + " " + v[2] + " " + v[3]).collect(Collectors.toList()) instanceof List<String> ls
            ? (2 * K + 1) + " " + (2 * K + 1) + "\n" + ls.size() + (ls.isEmpty() ? "" : "\n" + String.join("\n", ls))
            : "");
    }
}
