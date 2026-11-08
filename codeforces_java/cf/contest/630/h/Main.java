import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Long.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Long n
            && Long.valueOf(LongStream.rangeClosed(1, 5).reduce(1L, (c, i) -> c * (n - 5 + i) / i)) instanceof Long c5
            ? c5 * c5 * 120 : 0);
    }
}
