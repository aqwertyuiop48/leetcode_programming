import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m
            && new long[n] instanceof long[] keys && new int[m] instanceof int[] cur && new int[m] instanceof int[] ap && new int[n] instanceof int[] asg
            && new int[]{0, 0} instanceof int[] c && new HashMap<Integer, int[]>() instanceof Map<Integer, int[]> mp
            && IntStream.range(0, n).filter(i -> (keys[i] = ((long) tok[2 + i] << 18) | i) > 0).count() >= 0
            && IntStream.range(0, m).filter(j -> (cur[j] = tok[2 + n + j]) > 0 & (ap[j] = -1) < 0).count() >= 0
            && Stream.of(0).peek(z -> Arrays.sort(keys)).findFirst().isPresent()
            && IntStream.range(0, n).filter(i -> (mp.computeIfAbsent((int) (keys[i] >> 18), q -> new int[]{i, i})[1] = i + 1) > 0).count() >= 0
            && IntStream.range(0, 32).filter(k -> IntStream.range(0, m).filter(j -> (ap[j] < 0 && mp.get(cur[j]) instanceof int[] pr && pr[0] < pr[1]
                    && (asg[(int) (keys[pr[0]++] & 262143L)] = j + 1) > 0 && (ap[j] = k) >= 0 && ++c[0] > 0 && (c[1] += k) >= 0) | (cur[j] = (cur[j] + 1) / 2) > 0).count() >= 0).count() >= 0
            ? c[0] + " " + c[1] + "\n" + Arrays.stream(ap).mapToObj(v -> String.valueOf(Math.max(v, 0))).collect(Collectors.joining(" ")) + "\n"
                + Arrays.stream(asg).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
