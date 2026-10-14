import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Arrays.stream(s.nextLine().trim().split("[.]")).mapToInt(Integer::parseInt).toArray() instanceof int[] f
            && Arrays.stream(s.nextLine().trim().split("[.]")).mapToInt(Integer::parseInt).toArray() instanceof int[] b
            && IntStream.range(0, 27).filter(c -> c / 9 != c / 3 % 3 && c / 9 != c % 3 && c / 3 % 3 != c % 3)
                .anyMatch(c -> b[c / 3 % 3] >= 1 && b[c / 3 % 3] <= 12
                    && b[c / 9] >= 1
                    && b[c / 9] <= (b[c / 3 % 3] == 2 ? (b[c % 3] % 4 == 0 ? 29 : 28) : List.of(4, 6, 9, 11).contains(b[c / 3 % 3]) ? 30 : 31)
                    && (b[c % 3] + 18) * 10000 + b[c / 3 % 3] * 100 + b[c / 9] <= f[2] * 10000 + f[1] * 100 + f[0])
            ? "YES" : "NO"));
    }
}

