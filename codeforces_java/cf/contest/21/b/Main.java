import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong(), s.nextLong()}).ifPresent(v ->
            System.out.println(
                v[0] * v[4] - v[3] * v[1] != 0
                    ? 1
                    : (v[0] * v[5] - v[3] * v[2] == 0 && v[1] * v[5] - v[4] * v[2] == 0 ? -1 : 0))));
    }
}
