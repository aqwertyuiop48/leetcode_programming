import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] nums && new int[3] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).allMatch(i -> i < raw.length && raw[i] >= '0' && raw[i] <= '9' ? (st[0] = st[0] * 10 + raw[i] - '0') >= 0 && (st[2] = 1) > 0
                : st[2] == 0 || ((nums[st[1]++] = st[0]) >= 0 && (st[0] = 0) == 0 && (st[2] = 0) == 0))
            && (Integer) nums[0] instanceof Integer la && (Integer) nums[1] instanceof Integer lb
            && IntStream.generate(() -> -1).limit(1000001).toArray() instanceof int[] pos && IntStream.range(0, lb).allMatch(j -> (pos[nums[2 + la + j]] = j) >= 0)
            && IntStream.range(0, 2 * la).map(i -> pos[nums[2 + i % la]]).toArray() instanceof int[] p
            && new long[2 * la] instanceof long[] pre
            && IntStream.range(0, 2 * la - 1).allMatch(i -> (pre[i + 1] = pre[i] + (p[i] < 0 || p[i + 1] < 0 ? lb : (p[i + 1] - p[i] + lb) % lb)) >= 0)
            && new int[3] instanceof int[] w
            && IntStream.range(0, 4 * la + 4).allMatch(z -> w[0] >= la || ((w[1] = Math.max(w[1], w[0])) >= 0
                && (p[w[0]] < 0 ? ++w[0] > 0
                    : w[1] + 1 <= w[0] + la - 1 && pre[w[1] + 1] - pre[w[0]] <= lb - 1 ? ++w[1] > 0
                    : (w[2] = Math.max(w[2], w[1] - w[0] + 1)) >= 0 && ++w[0] > 0)))
            ? w[2] : 0);
    }
}



