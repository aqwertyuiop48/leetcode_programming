import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] h
            && Integer.valueOf(h[0]) instanceof Integer n
            ? Math.min(n, 3 + (int) IntStream.range(1, n).filter(i -> h[1].charAt(i) != h[1].charAt(i - 1)).count()) : "");
    }
}
