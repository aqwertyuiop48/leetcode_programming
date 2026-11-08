import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n
            ? IntStream.of(5, 6, 7).mapToLong(k -> LongStream.rangeClosed(1, k).reduce(1L, (c, i) -> c * (n - k + i) / i)).sum() : 0);
    }
}
