import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Long) Long.parseLong(tk.nextToken()) instanceof Long n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && new long[m] instanceof long[] X && new long[m] instanceof long[] Y
            && IntStream.range(0, m).allMatch(i -> (X[i] = Long.parseLong(tk.nextToken())) > 0 && (Y[i] = Long.parseLong(tk.nextToken())) > 0)
            && IntStream.range(0, m).boxed().flatMapToLong(i -> IntStream.range(i + 1, m).mapToLong(j -> Y[i] != Y[j] && (Long) (X[i] * (Y[j] - Y[i]) - Y[i] * (X[j] - X[i])) instanceof Long num && (Long) (Y[j] - Y[i]) instanceof Long dy
                && num % dy == 0 && num / dy >= 1 && num / dy <= n ? (num / dy << 8) + i : -1L)).filter(k -> k >= 0).boxed().collect(Collectors.groupingBy(k -> k, Collectors.counting())) instanceof Map<Long, Long> cnt
            && new HashMap<Long, Long>() instanceof HashMap<Long, Long> best && cnt.entrySet().stream().allMatch(e -> best.merge(e.getKey() >> 8, e.getValue(), (a, b) -> Math.max(a, b)) > 0)
            ? n + best.values().stream().mapToLong(v -> v).sum() : "");
    }
}


