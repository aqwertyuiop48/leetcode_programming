import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
                System.out.println(IntStream.range(0, nm[0]).mapToObj(i ->
                    new long[]{s.nextInt(), s.nextInt(), s.nextInt()} instanceof long[] q
                    && (Long) (2L * (nm[1] - 1)) instanceof Long T
                    && (Long) (q[0] < q[1] ? q[0] - 1 : T - (q[0] - 1)) instanceof Long r
                    ? String.valueOf(q[0] == q[1] ? q[2] : q[2] + Math.floorMod(r - q[2], T) + Math.abs(q[1] - q[0]))
                    : "").collect(Collectors.joining("\n")))));
    }
}

