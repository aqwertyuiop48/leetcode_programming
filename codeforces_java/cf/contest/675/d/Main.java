import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new long[raw.length / 2 + 4] instanceof long[] tok && new long[]{0, 0, 0, 0} instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : raw[i] == 45 ? (st[3] = 1) > 0 : st[2] == 0 || (tok[(int) st[0]++] = st[3] == 1 ? -st[1] : st[1]) * 0 == 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0 & (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf((int) tok[0]) instanceof Integer n && new long[n] instanceof long[] key
            && IntStream.range(0, n).filter(i -> (key[i] = tok[1 + i] * 131072 + i) > 0).count() >= 0 && Arrays.stream(key).sorted().toArray() instanceof long[] sk
            && new int[n + 2] instanceof int[] ord && new int[n] instanceof int[] pos && new int[n + 2] instanceof int[] prv && new int[n + 2] instanceof int[] nxt && new long[n] instanceof long[] ans
            && (ord[0] = -1) < 0 && (ord[n + 1] = -1) < 0
            && IntStream.rangeClosed(1, n).filter(r -> (ord[r] = (int) (sk[r - 1] & 131071)) >= 0 & (pos[ord[r]] = r) > 0 & (prv[r] = r - 1) >= 0 & (nxt[r] = r + 1) > 0).count() >= 0
            && IntStream.range(1, n).map(k -> n - k).filter(i -> (ans[i] = tok[1 + Math.max(ord[prv[pos[i]]], ord[nxt[pos[i]]])]) > 0 & (nxt[prv[pos[i]]] = nxt[pos[i]]) > 0 & (prv[nxt[pos[i]]] = prv[pos[i]]) >= 0).count() >= 0
            ? IntStream.range(1, n).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining(" ")) : "");
    }
}
