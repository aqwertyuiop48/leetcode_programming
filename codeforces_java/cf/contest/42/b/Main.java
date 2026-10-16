import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            IntStream.range(0, 4).mapToObj(i -> s.next()).toList() instanceof List<String> p
            && p.stream().mapToInt(t -> t.charAt(0) - 'a').toArray() instanceof int[] X
            && p.stream().mapToInt(t -> t.charAt(1) - '1').toArray() instanceof int[] Y
            && ((Predicate<int[]>) q -> Math.max(Math.abs(q[0] - X[2]), Math.abs(q[1] - Y[2])) <= 1
                || IntStream.range(0, 2).filter(r -> r != q[2] && (X[r] == q[0] || Y[r] == q[1]))
                    .anyMatch(r -> IntStream.range(0, 3).noneMatch(o -> o != r && o != q[2]
                        && X[o] >= Math.min(X[r], q[0]) && X[o] <= Math.max(X[r], q[0]) && Y[o] >= Math.min(Y[r], q[1]) && Y[o] <= Math.max(Y[r], q[1])))) instanceof Predicate<int[]> at
            ? (at.test(new int[]{X[3], Y[3], -1})
                && IntStream.rangeClosed(-1, 1).boxed().flatMap(dx -> IntStream.rangeClosed(-1, 1).mapToObj(dy -> new int[]{X[3] + dx, Y[3] + dy}))
                    .filter(q -> (q[0] != X[3] || q[1] != Y[3]) && q[0] >= 0 && q[0] < 8 && q[1] >= 0 && q[1] < 8 && (q[0] != X[2] || q[1] != Y[2]))
                    .noneMatch(q -> !at.test(new int[]{q[0], q[1], IntStream.range(0, 2).filter(r -> X[r] == q[0] && Y[r] == q[1]).findFirst().orElse(-1)}))
                ? "CHECKMATE" : "OTHER")
            : ""));
    }
}




