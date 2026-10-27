import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nd ->
            System.out.println(
                IntStream.range(0, nd[0]).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] mm
                && new int[]{Arrays.stream(mm).mapToInt(e -> e[0]).sum()} instanceof int[] sumMin
                && new int[]{Arrays.stream(mm).mapToInt(e -> e[1]).sum()} instanceof int[] sumMax
                ? (nd[1] < sumMin[0] || nd[1] > sumMax[0]
                    ? "NO"
                    : (new int[]{nd[1] - sumMin[0]} instanceof int[] rem
                        && new int[mm.length] instanceof int[] h
                        && IntStream.range(0, mm.length).allMatch(i ->
                            (h[i] = mm[i][0] + Math.min(mm[i][1] - mm[i][0], rem[0])) >= 0
                            & (rem[0] -= Math.min(mm[i][1] - mm[i][0], rem[0])) >= 0)
                        ? "YES\n" + Arrays.stream(h).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                        : "NO"))
                : "NO")));
    }
}





