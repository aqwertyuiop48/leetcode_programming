import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && IntStream.range(0, raw.length).filter(k -> raw[k] == 10).boxed().findFirst().get() instanceof Integer nl
            && new String(raw, 0, nl).trim().split("\\s+") instanceof String[] h
            && Integer.valueOf(h[0]) instanceof Integer n && Integer.valueOf(h[1]) instanceof Integer m
            && Integer.valueOf(m + (raw[nl - 1] == 13 ? 2 : 1)) instanceof Integer w && Integer.valueOf(nl + 1) instanceof Integer base
            && new int[n] instanceof int[] run && new int[m + 2] instanceof int[] cnt && new int[]{0, 0} instanceof int[] st
            && IntStream.range(0, m).allMatch(j -> IntStream.of(0).peek(z -> IntStream.range(0, n).forEach(i -> ++cnt[run[i] = raw[base + i * w + j] == 49 ? run[i] + 1 : 0])).sum() == 0
                && (st[0] = 0) == 0
                && IntStream.of(0).peek(z -> IntStream.range(0, j + 1).forEach(k -> st[1] = Math.max(st[1], (j + 1 - k) * (st[0] += cnt[j + 1 - k])) + 0 * (cnt[j + 1 - k] = 0))).sum() == 0)
            ? st[1] : "");
    }
}
