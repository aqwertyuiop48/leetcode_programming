import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(new long[]{s.nextLong(), s.nextLong(), s.nextLong()}).ifPresent(v ->
                System.out.println(
                    Optional.of(v[2] / v[0]).map(r ->
                        v[2] <= 0 || v[2] % v[0] == 0
                            ? -1L
                            : r % 2 == 0 && r > 0
                                ? (Math.abs(v[1]) < v[0] && v[1] != 0 ? r + (r - 1) / 2 + (v[1] < 0 ? 1 : 2) : -1L)
                                : (2 * Math.abs(v[1]) < v[0] ? r + (r - 1) / 2 + 1 : -1L)).get())));
    }
}

