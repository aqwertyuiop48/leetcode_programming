import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer a && Integer.valueOf(sc.nextInt()) instanceof Integer b
            ? IntStream.range(1, a).boxed().flatMap(x -> Stream.of(1, -1).map(s -> new int[] {x, (int) Math.round(Math.sqrt(a * a - x * x)), s}))
                .filter(v -> v[1] > 0 && v[0] * v[0] + v[1] * v[1] == a * a && v[0] * b % a == 0 && v[1] * b % a == 0 && v[0] + v[2] * v[1] * b / a != 0 && v[1] - v[2] * v[0] * b / a != 0)
                .map(v -> "YES\n0 0\n" + v[0] + " " + v[1] + "\n" + (-v[2] * v[1] * b / a) + " " + (v[2] * v[0] * b / a)).findFirst().orElse("NO") : "");
    }
}
