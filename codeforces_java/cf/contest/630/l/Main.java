import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim() instanceof String s
            && Long.valueOf(Long.parseLong("" + s.charAt(0) + s.charAt(2) + s.charAt(4) + s.charAt(3) + s.charAt(1))) instanceof Long x
            ? String.format("%05d", IntStream.range(0, 5).boxed().reduce(1L, (r, i) -> r * x % 100000, (p, q) -> p)) : "");
    }
}
