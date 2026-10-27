import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(v -> System.out.println(IntStream.rangeClosed(0, v[3]).mapToLong(z -> IntStream.rangeClosed(0, v[2]).filter(y -> 2 * v[0] - 2 * y - 4 * z >= 0 && 2 * v[0] - 2 * y - 4 * z <= v[1]).count()).sum())));
    }
}





