import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] v && (Long) v[3] instanceof Long l
            ? (l + 1) * (l + 2) * (l + 3) / 6 - LongStream.range(0, 3).map(r -> LongStream.rangeClosed(0, l).map(x -> Math.max(-1L, Math.min(l - x, v[(int) r] + x - v[(int) ((r + 1) % 3)] - v[(int) ((r + 2) % 3)]))).map(m -> (m + 1) * (m + 2) / 2).sum()).sum()
            : 0L);
    }
}
