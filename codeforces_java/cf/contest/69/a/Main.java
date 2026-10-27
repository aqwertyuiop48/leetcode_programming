import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
                System.out.print(Arrays.equals(IntStream.range(0, n).mapToObj(i -> IntStream.generate(s::nextInt).limit(3).toArray()).reduce(new int[3], (a, b) -> new int[]{a[0] + b[0], a[1] + b[1], a[2] + b[2]}), new int[3]) ? "YES" : "NO")));
    }
}





