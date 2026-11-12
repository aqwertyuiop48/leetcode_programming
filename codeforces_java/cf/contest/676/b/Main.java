import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 4] instanceof long[] tok && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[(int) st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tok[0]) instanceof Integer n && new double[12][12] instanceof double[][] g && (g[0][0] = tok[1]) >= 0
            && IntStream.range(0, n).filter(r -> IntStream.rangeClosed(0, r).filter(j -> g[r][j] > 1 ? (g[r + 1][j] += (g[r][j] - 1) / 2) >= 0 & (g[r + 1][j + 1] += (g[r][j] - 1) / 2) >= 0 & (g[r][j] = 1) > 0 : true).count() >= 0).count() >= 0
            ? IntStream.range(0, n).map(r -> (int) IntStream.rangeClosed(0, r).filter(j -> g[r][j] >= 1).count()).sum() : "");
    }
}
