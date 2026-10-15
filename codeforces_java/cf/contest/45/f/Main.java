import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.println(
            a[1] >= 4 ? Math.max(2 * a[0] <= a[1] ? 1 : 2 * Math.ceilDiv(2 * a[0] - a[1], a[1] - 2) + 1, a[1] % 2 == 1 ? 2 * Math.ceilDiv(2 * a[0] - a[1] - 3, a[1] - 3) + 1 : 1)
            : a[1] == 1 ? -1
            : a[1] == 2 ? (a[0] <= 3 ? new int[]{1, 5, 11}[a[0] - 1] : -1)
            : (a[0] <= 5 ? new int[]{1, 3, 5, 9, 11}[a[0] - 1] : -1))));
    }
}
