import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(new long[]{s.nextLong(), s.nextLong()}).ifPresent(v ->
                System.out.println(
                    Math.min(v[0], v[1]) == 1
                        ? Math.max(v[0], v[1])
                        : Math.min(v[0], v[1]) == 2
                            ? Math.max(v[0], v[1]) / 4 * 4 + (Math.max(v[0], v[1]) % 4 == 1 ? 2 : Math.max(v[0], v[1]) % 4 >= 2 ? 4 : 0)
                            : (v[0] * v[1] + 1) / 2)));
    }
}

