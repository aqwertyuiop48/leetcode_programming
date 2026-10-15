import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(t ->
            System.out.println(
                IntStream.range(0, t).mapToObj(ti ->
                    new long[3][4] instanceof long[][] seg
                    && IntStream.range(0, 3).allMatch(i -> IntStream.range(0, 4).allMatch(j -> (seg[i][j] = s.nextLong()) >= Long.MIN_VALUE))
                    && ((Function<long[], Long>) (v -> v[0] * v[3] - v[1] * v[2])) instanceof Function<long[], Long> cross
                    && ((Function<long[], Long>) (v -> v[0] * v[2] + v[1] * v[3])) instanceof Function<long[], Long> dot
                    && ((Function<long[], Boolean>) (p -> new long[]{p[2] - p[0], p[3] - p[1], p[4] - p[0], p[5] - p[1]} instanceof long[] v
                            && cross.apply(v) == 0
                            && new long[]{dot.apply(new long[]{v[2], v[3], v[0], v[1]}), dot.apply(new long[]{v[0], v[1], v[0], v[1]})} instanceof long[] nd
                            && nd[0] > 0 && nd[0] < nd[1] && 5 * nd[0] >= nd[1] && 5 * nd[0] <= 4 * nd[1])) instanceof Function<long[], Boolean> validLeg
                    && ((Function<long[], Boolean>) (p -> new long[]{p[2] - p[0], p[3] - p[1], p[4] - p[0], p[5] - p[1]} instanceof long[] v
                            && cross.apply(v) != 0 && dot.apply(v) >= 0
                            && ((validLeg.apply(new long[]{p[0], p[1], p[2], p[3], p[6], p[7]}) && validLeg.apply(new long[]{p[0], p[1], p[4], p[5], p[8], p[9]}))
                                || (validLeg.apply(new long[]{p[0], p[1], p[2], p[3], p[8], p[9]}) && validLeg.apply(new long[]{p[0], p[1], p[4], p[5], p[6], p[7]}))))) instanceof Function<long[], Boolean> checkAssign
                    && ((Function<int[], Boolean>) (tr -> IntStream.range(0, 4).anyMatch(combo ->
                            new long[]{
                                combo < 2 ? seg[tr[0]][0] : seg[tr[0]][2], combo < 2 ? seg[tr[0]][1] : seg[tr[0]][3],
                                combo < 2 ? seg[tr[0]][2] : seg[tr[0]][0], combo < 2 ? seg[tr[0]][3] : seg[tr[0]][1],
                                combo % 2 == 0 ? seg[tr[1]][0] : seg[tr[1]][2], combo % 2 == 0 ? seg[tr[1]][1] : seg[tr[1]][3],
                                combo % 2 == 0 ? seg[tr[1]][2] : seg[tr[1]][0], combo % 2 == 0 ? seg[tr[1]][3] : seg[tr[1]][1]
                            } instanceof long[] pts
                            && pts[0] == pts[4] && pts[1] == pts[5]
                            && checkAssign.apply(new long[]{pts[0], pts[1], pts[2], pts[3], pts[6], pts[7], seg[tr[2]][0], seg[tr[2]][1], seg[tr[2]][2], seg[tr[2]][3]})))) instanceof Function<int[], Boolean> tryLegs
                    && (tryLegs.apply(new int[]{0, 1, 2}) || tryLegs.apply(new int[]{1, 2, 0}) || tryLegs.apply(new int[]{0, 2, 1}))
                    ? "YES"
                    : "NO")
                .collect(Collectors.joining("\n")))));
    }
}



