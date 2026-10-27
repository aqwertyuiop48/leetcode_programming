import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(v ->
                System.out.println(
                    IntStream.range(0, 6561)
                        .mapToObj(k -> new int[]{k % 9 + 1, k / 9 % 9 + 1, k / 81 % 9 + 1, k / 729 + 1})
                        .filter(q -> q[0] + q[1] == v[0] && q[2] + q[3] == v[1] && q[0] + q[2] == v[2] && q[1] + q[3] == v[3]
                            && q[0] + q[3] == v[4] && q[1] + q[2] == v[5]
                            && IntStream.of(q).distinct().count() == 4)
                        .findFirst()
                        .map(q -> q[0] + " " + q[1] + "\n" + q[2] + " " + q[3])
                        .orElse("-1"))));
    }
}

