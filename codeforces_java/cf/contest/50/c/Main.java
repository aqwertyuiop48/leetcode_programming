import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.range(0, s.nextInt()).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toList()).ifPresent(p ->
            System.out.println(
                p.stream().mapToInt(q -> q[0] + q[1]).max().getAsInt() - p.stream().mapToInt(q -> q[0] + q[1]).min().getAsInt()
                + p.stream().mapToInt(q -> q[0] - q[1]).max().getAsInt() - p.stream().mapToInt(q -> q[0] - q[1]).min().getAsInt() + 4)));
    }
}





