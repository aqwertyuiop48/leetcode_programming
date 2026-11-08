import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n
            ? LongStream.rangeClosed(1, 5).reduce(1L, (c, i) -> c * (n - 1 + i) / i) * LongStream.rangeClosed(1, 3).reduce(1L, (c, i) -> c * (n - 1 + i) / i) : 0);
    }
}
