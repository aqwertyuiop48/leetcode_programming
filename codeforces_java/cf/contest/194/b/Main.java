import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer t
            ? IntStream.range(0, t).mapToObj(i -> Long.valueOf(s.nextLong()) instanceof Long n
                ? String.valueOf(4 * n / (n % 2 == 0 ? 1 : (n + 1) % 4 == 0 ? 4 : 2) + 1) : "").collect(Collectors.joining("\n"))
            : "");
    }
}

