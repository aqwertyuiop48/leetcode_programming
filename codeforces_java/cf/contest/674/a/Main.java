import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 4] instanceof int[] tok && new int[]{0, 0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && new int[n + 1] instanceof int[] cnt && new int[n + 1] instanceof int[] ans && new int[]{0, 0} instanceof int[] b
            && Arrays.copyOfRange(tok, 1, n + 1) instanceof int[] a
            && IntStream.range(0, n).filter(l -> (b[0] = 0) == 0 && (b[1] = 0) == 0
                && IntStream.range(l, n).filter(r -> ((++cnt[a[r]] > b[1] || cnt[a[r]] == b[1] && a[r] < b[0]) ? (b[0] = a[r]) + (b[1] = cnt[a[r]]) > 0 : true) && ++ans[b[0]] > 0).count() >= 0
                && IntStream.range(l, n).filter(r -> (cnt[a[r]] = 0) == 0).count() >= 0).count() >= 0
            ? IntStream.rangeClosed(1, n).mapToObj(c -> String.valueOf(ans[c])).collect(Collectors.joining(" ")) : "");
    }
}
