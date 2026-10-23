import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            Integer.valueOf(new String(System.in.readAllBytes()).trim()) instanceof Integer n
            ? n < 4 ? "NO\n"
                : "YES\n" + (n % 2 == 0 ? "1 * 2 = 2\n2 * 3 = 6\n6 * 4 = 24\n" : "5 * 4 = 20\n20 + 3 = 23\n23 + 2 = 25\n25 - 1 = 24\n")
                    + IntStream.iterate(n % 2 == 0 ? 5 : 6, i -> i < n, i -> i + 2)
                        .mapToObj(i -> (i + 1) + " - " + i + " = 1\n24 * 1 = 24\n").collect(Collectors.joining())
            : "");
    }
}
