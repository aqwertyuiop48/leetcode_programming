import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] h
            && Integer.valueOf(h[0]) instanceof Integer p && Integer.valueOf(h[1]) instanceof Integer k
            && (Integer) (k == 0 ? p - 1 : k == 1 ? p : (p - 1) / (1 + (int) IntStream.iterate(k, x -> x != 1, x -> (int) ((long) x * k % p)).count())) instanceof Integer e
            ? LongStream.range(0, e).reduce(1L, (r, z) -> r * p % 1000000007L) : "");
    }
}
