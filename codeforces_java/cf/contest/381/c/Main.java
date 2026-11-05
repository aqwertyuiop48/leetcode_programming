import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && new long[b.length / 2 + 3] instanceof long[] tk && new long[3] instanceof long[] w
            && IntStream.rangeClosed(0, b.length).mapToLong(i -> (i < b.length ? b[i] : 10) >= 48 ? (w[0] = w[0] * 10 + b[i] - 48) + (w[1] = 1) : w[1] == 1 ? (tk[(int) w[2]++] = w[0]) + (w[0] = 0) + (w[1] = 0) : 0).sum() >= 0
            && new int[]{1} instanceof int[] ptr && Integer.valueOf((int) tk[0]) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> Integer.valueOf((int) tk[ptr[0]++]) instanceof Integer ty ? new long[]{ty, tk[ptr[0]++], ty == 2 ? tk[ptr[0]++] : 1} : null).toArray(long[][]::new) instanceof long[][] st
            && new long[m] instanceof long[] cum && new long[1] instanceof long[] acc
            && IntStream.range(0, m).allMatch(i -> (cum[i] = acc[0] += st[i][0] == 1 ? 1 : st[i][1] * st[i][2]) > 0)
            && new long[100001] instanceof long[] pre && new int[1] instanceof int[] len
            && IntStream.range(0, m).filter(i -> len[0] < 100000).allMatch(i -> st[i][0] == 1 ? (pre[len[0]++] = st[i][1]) > 0
                : Integer.valueOf((int) Math.min(100000 - len[0], st[i][1] * st[i][2])) instanceof Integer add && IntStream.range(0, add).mapToLong(r -> pre[len[0] + r] = pre[(int) (r % st[i][1])]).sum() >= 0 && (len[0] += add) > 0)
            && Integer.valueOf((int) tk[ptr[0]++]) instanceof Integer n
            ? IntStream.range(0, n).mapToLong(k -> tk[ptr[0] + k]).mapToObj(p -> Integer.valueOf(Arrays.binarySearch(cum, p)) instanceof Integer b0 && Integer.valueOf(b0 < 0 ? -b0 - 1 : b0) instanceof Integer j
                    ? String.valueOf(st[j][0] == 1 ? st[j][1] : pre[(int) ((p - (j > 0 ? cum[j - 1] : 0) - 1) % st[j][1])]) : "").collect(Collectors.joining(" ")) : "");
    }
}
