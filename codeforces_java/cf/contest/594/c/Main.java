import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer k
            && new long[n] instanceof long[] X && new long[n] instanceof long[] Y
            && IntStream.range(0, n).allMatch(i -> (X[i] = Long.parseLong(tk.nextToken())) > 0 && (Y[i] = Long.parseLong(tk.nextToken())) > 0 && (X[i] += Long.parseLong(tk.nextToken())) > 0 && (Y[i] += Long.parseLong(tk.nextToken())) > 0)
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> X[i])).mapToInt(Integer::intValue).toArray() instanceof int[] ox
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong(i -> Y[i])).mapToInt(Integer::intValue).toArray() instanceof int[] oy
            && (Integer) (k + 1) instanceof Integer K
            ? IntStream.range(0, K * K * K * K).mapToLong(c -> IntStream.concat(IntStream.concat(IntStream.range(0, c % K).map(j -> ox[j]), IntStream.range(0, c / K % K).map(j -> ox[n - 1 - j])),
                    IntStream.concat(IntStream.range(0, c / K / K % K).map(j -> oy[j]), IntStream.range(0, c / K / K / K).map(j -> oy[n - 1 - j]))).boxed().collect(Collectors.toSet()) instanceof Set<Integer> rem && rem.size() <= k
                    && (Long) IntStream.range(0, n).map(j -> ox[j]).filter(i -> !rem.contains(i)).mapToLong(i -> X[i]).findFirst().getAsLong() instanceof Long x0
                    && (Long) IntStream.range(0, n).map(j -> ox[n - 1 - j]).filter(i -> !rem.contains(i)).mapToLong(i -> X[i]).findFirst().getAsLong() instanceof Long x1
                    && (Long) IntStream.range(0, n).map(j -> oy[j]).filter(i -> !rem.contains(i)).mapToLong(i -> Y[i]).findFirst().getAsLong() instanceof Long y0
                    && (Long) IntStream.range(0, n).map(j -> oy[n - 1 - j]).filter(i -> !rem.contains(i)).mapToLong(i -> Y[i]).findFirst().getAsLong() instanceof Long y1
                    ? Math.max(1L, (x1 - x0 + 1) / 2) * Math.max(1L, (y1 - y0 + 1) / 2) : Long.MAX_VALUE).min().getAsLong() : 0);
    }
}
