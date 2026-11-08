import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && IntStream.range(0, 6).map(i -> Integer.parseInt(t[i])).toArray() instanceof int[] v
            ? (v[0] == v[2] && v[2] == v[4] || v[1] == v[3] && v[3] == v[5] ? 1
                : IntStream.range(0, 3).anyMatch(k -> (k + 1) % 3 < 3 && ((v[2 * k] == v[2 * ((k + 1) % 3)] && !(Math.min(v[2 * k + 1], v[2 * ((k + 1) % 3) + 1]) < v[2 * ((k + 2) % 3) + 1] && v[2 * ((k + 2) % 3) + 1] < Math.max(v[2 * k + 1], v[2 * ((k + 1) % 3) + 1])))
                    || (v[2 * k + 1] == v[2 * ((k + 1) % 3) + 1] && !(Math.min(v[2 * k], v[2 * ((k + 1) % 3)]) < v[2 * ((k + 2) % 3)] && v[2 * ((k + 2) % 3)] < Math.max(v[2 * k], v[2 * ((k + 1) % 3)]))))) ? 2 : 3) : "");
    }
}
