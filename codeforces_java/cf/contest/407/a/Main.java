import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b
            && IntStream.range(1, a).boxed().flatMap(x -> IntStream.range(0, 8).mapToObj(c -> (Integer) (int) Math.round(Math.sqrt(a * a - x * x)) instanceof Integer y && y * y == a * a - x * x
                && new int[]{(c & 1) == 0 ? x : -x, (c & 2) == 0 ? y : -y, (c & 4) == 0 ? 1 : -1} instanceof int[] z
                && (z[1] * b) % a == 0 && (z[0] * b) % a == 0 && z[0] != -z[2] * z[1] * b / a && z[1] != z[2] * z[0] * b / a
                ? new int[]{z[0], z[1], -z[2] * z[1] * b / a, z[2] * z[0] * b / a} : null)).filter(Objects::nonNull).findFirst() instanceof Optional<int[]> r
            ? r.isPresent() ? "YES\n0 0\n" + r.get()[0] + " " + r.get()[1] + "\n" + r.get()[2] + " " + r.get()[3] : "NO" : "");
    }
}
