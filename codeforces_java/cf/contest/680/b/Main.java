import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer a
            ? IntStream.rangeClosed(1, n).map(i -> 2 * a - i < 1 || 2 * a - i > n || 2 * a - i == i ? Integer.parseInt(t[1 + i]) : Integer.parseInt(t[1 + i]) * Integer.parseInt(t[1 + 2 * a - i])).sum() : "");
    }
}
