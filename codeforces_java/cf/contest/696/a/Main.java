import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && Integer.valueOf(t[0]) instanceof Integer q
            && new HashMap<Long, Long>() instanceof HashMap<Long, Long> mp && new int[] {1} instanceof int[] ps
            ? IntStream.range(0, q).mapToObj(i -> Long.valueOf(t[ps[0]++]) instanceof Long ty
                && new long[] {Long.parseLong(t[ps[0]++]), Long.parseLong(t[ps[0]++]), ty.longValue(), ty.longValue() == 1 ? Long.parseLong(t[ps[0]++]) : 0} instanceof long[] c
                ? Long.valueOf(IntStream.generate(() -> 0).takeWhile(z -> c[0] != c[1])
                    .mapToLong(z -> (c[2] == 1 ? mp.merge(Math.max(c[0], c[1]), c[3], Long::sum) * 0 : mp.getOrDefault(Math.max(c[0], c[1]), 0L)) + (c[0] > c[1] ? (c[0] = c[0] / 2) * 0 : (c[1] = c[1] / 2) * 0)).sum()).toString() + (c[2] == 1 ? "!" : "")
                : "")
                .filter(s -> !s.endsWith("!")).collect(Collectors.joining("\n")) : "");
    }
}
