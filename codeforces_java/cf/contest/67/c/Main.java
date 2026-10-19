import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] tk
            && Integer.valueOf(tk[0]) instanceof Integer ti
            && Integer.valueOf(tk[1]) instanceof Integer td
            && Integer.valueOf(tk[2]) instanceof Integer tr
            && Integer.valueOf(tk[3]) instanceof Integer te
            && tk[4].getBytes() instanceof byte[] ac
            && tk[5].getBytes() instanceof byte[] bc
            && Integer.valueOf(ac.length) instanceof Integer n
            && Integer.valueOf(bc.length) instanceof Integer m
            && new int[n + 1][m + 1] instanceof int[][] d
            && IntStream.rangeClosed(1, n).allMatch(i -> (d[i][0] = i * td) >= 0)
            && IntStream.rangeClosed(1, m).allMatch(j -> (d[0][j] = j * ti) >= 0)
            && new int[128] instanceof int[] last
            && new int[1] instanceof int[] col
            && IntStream.rangeClosed(1, n).allMatch(i ->
                d[i] instanceof int[] cur
                && d[i - 1] instanceof int[] prv
                && (col[0] = 0) == 0
                && IntStream.rangeClosed(1, m).filter(j ->
                    (cur[j] = Math.min(
                        Math.min(prv[j - 1] + (ac[i - 1] == bc[j - 1] ? 0 : tr), cur[j - 1] + ti),
                        Math.min(prv[j] + td,
                            last[bc[j - 1]] > 0 && col[0] > 0
                                ? d[last[bc[j - 1]] - 1][col[0] - 1] + (i - last[bc[j - 1]] - 1) * td + te + (j - col[0] - 1) * ti
                                : Integer.MAX_VALUE))) < 0
                    | (col[0] = ac[i - 1] == bc[j - 1] ? j : col[0]) < 0).count() >= 0
                && (last[ac[i - 1]] = i) > 0)
            ? d[n][m]
            : -1);
    }
}
