import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(IntStream.range(0, 2 * n).map(i -> s.nextInt()).toArray()).ifPresent(arr ->
                System.out.println(IntStream.range(0, n).anyMatch(i -> IntStream.range(i + 1, n).anyMatch(j ->
                    arr[2 * i] + arr[2 * i + 1] == arr[2 * j] && arr[2 * j] + arr[2 * j + 1] == arr[2 * i])) ? "YES" : "NO"))));
    }
}



