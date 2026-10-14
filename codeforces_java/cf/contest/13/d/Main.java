import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            System.out.println(
                new long[nm[0]] instanceof long[] rx
                && new long[nm[0]] instanceof long[] ry
                && IntStream.range(0, nm[0]).allMatch(i -> (rx[i] = s.nextLong()) >= Long.MIN_VALUE && (ry[i] = s.nextLong()) >= Long.MIN_VALUE)
                && new long[nm[1]] instanceof long[] bx
                && new long[nm[1]] instanceof long[] by
                && IntStream.range(0, nm[1]).allMatch(i -> (bx[i] = s.nextLong()) >= Long.MIN_VALUE && (by[i] = s.nextLong()) >= Long.MIN_VALUE)
                && ((Function<long[], Long>) (c -> (c[2] - c[0]) * (c[5] - c[1]) - (c[3] - c[1]) * (c[4] - c[0]))) instanceof Function<long[], Long> cross
                && ((Function<long[], Boolean>) (q ->
                        new long[]{
                            cross.apply(new long[]{rx[(int) q[2]], ry[(int) q[2]], rx[(int) q[3]], ry[(int) q[3]], q[0], q[1]}),
                            cross.apply(new long[]{rx[(int) q[3]], ry[(int) q[3]], rx[(int) q[4]], ry[(int) q[4]], q[0], q[1]}),
                            cross.apply(new long[]{rx[(int) q[4]], ry[(int) q[4]], rx[(int) q[2]], ry[(int) q[2]], q[0], q[1]})
                        } instanceof long[] d
                        && !((d[0] < 0 || d[1] < 0 || d[2] < 0) && (d[0] > 0 || d[1] > 0 || d[2] > 0)))) instanceof Function<long[], Boolean> pointInTriangle
                && ((Function<int[], Boolean>) (ijk -> IntStream.range(0, nm[1]).noneMatch(m -> pointInTriangle.apply(new long[]{bx[m], by[m], ijk[0], ijk[1], ijk[2]})))) instanceof Function<int[], Boolean> isEmptyTri
                ? IntStream.range(0, nm[0]).boxed()
                    .flatMap(i -> IntStream.range(i + 1, nm[0]).boxed().flatMap(j -> IntStream.range(j + 1, nm[0]).mapToObj(k -> new int[]{i, j, k})))
                    .filter(isEmptyTri::apply)
                    .count()
                : 0L)));
    }
}

