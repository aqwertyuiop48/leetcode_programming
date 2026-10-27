import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(s.next()).ifPresent(str ->
                System.out.println(
                    (Integer) (int) str.chars().filter(c -> c == 'H').count() instanceof Integer k
                    && new int[2 * n + 1] instanceof int[] pre
                    && IntStream.range(0, 2 * n).allMatch(i -> (pre[i + 1] = pre[i] + (str.charAt(i % n) == 'T' ? 1 : 0)) >= 0)
                    ? IntStream.range(0, n).map(i -> pre[i + k] - pre[i]).min().getAsInt()
                    : 0))));
    }
}





