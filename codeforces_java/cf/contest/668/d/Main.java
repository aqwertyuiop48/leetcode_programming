import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n
            && IntStream.range(0, n).mapToLong(i -> ((long) tok[2 + 3 * i + 1] << 30) | tok[2 + 3 * i]).toArray() instanceof long[] keys
            && keys.clone() instanceof long[] sorted && Arrays.stream(sorted).sorted().toArray() instanceof long[] srt
            && new int[n + 2] instanceof int[] bit
            ? IntStream.range(0, n).mapToObj(i -> Integer.valueOf(Arrays.binarySearch(srt, keys[i]) + 1) instanceof Integer p
                    ? tok[1 + 3 * i] == 3
                        ? String.valueOf(IntStream.iterate(p, j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum()
                            - IntStream.iterate(-Arrays.binarySearch(srt, ((long) tok[2 + 3 * i + 1]) << 30) - 1, j -> j > 0, j -> j - (j & -j)).map(j -> bit[j]).sum())
                        : IntStream.iterate(p, j -> j <= n, j -> j + (j & -j)).map(j -> bit[j] += tok[1 + 3 * i] == 1 ? 1 : -1).count() >= 0 ? "" : ""
                    : "").filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
