import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t && Integer.valueOf(t[0]) instanceof Integer n
            ? (long) IntStream.range(0, n).map(i -> Integer.parseInt(t[1 + i])).reduce(0, (x, y) -> x | y)
                + IntStream.range(0, n).map(i -> Integer.parseInt(t[1 + n + i])).reduce(0, (x, y) -> x | y) : 0);
    }
}
