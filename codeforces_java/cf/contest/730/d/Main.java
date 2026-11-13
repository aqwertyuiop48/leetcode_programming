import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer z && Integer.valueOf(Integer.parseInt(z.nextToken())) instanceof Integer n && Long.valueOf(Long.parseLong(z.nextToken())) instanceof Long r
            && IntStream.range(0, n).mapToLong(i -> Long.parseLong(z.nextToken())).toArray() instanceof long[] L && IntStream.range(0, n).mapToLong(i -> Long.parseLong(z.nextToken())).toArray() instanceof long[] Tm
            && new long[]{0, 0, 0} instanceof long[] stt && new ArrayList<Long>() instanceof ArrayList<Long> times
            && IntStream.range(0, n).allMatch(i -> L[i] <= Tm[i] && Long.valueOf(Math.min(stt[1], L[i])) instanceof Long u && Long.valueOf(L[i] - u) instanceof Long lp
                && Long.valueOf(Math.max(0L, u + 2 * lp - Tm[i])) instanceof Long x
                && (x == 0 ? (stt[1] -= u) >= 0 & (stt[0] += u + 2 * lp) >= 0
                    : Long.valueOf((x + r - 1) / r) instanceof Long m && Long.valueOf(x - (m - 1) * r) instanceof Long y && Long.valueOf(stt[0] + u + 2 * lp - x) instanceof Long tEnd
                        && (stt[2] += m) > 0 && LongStream.range(0, Math.min(m, 100001 - times.size())).filter(idx -> times.add(tEnd - y - (m - 1 - idx) * r)).count() >= 0
                        && (stt[1] = r - y) >= 0 && (stt[0] = tEnd) >= 0))
            ? stt[2] + (stt[2] >= 1 && stt[2] <= 100000 ? "\n" + times.stream().map(String::valueOf).collect(Collectors.joining(" ")) : "") : "-1");
    }
}
