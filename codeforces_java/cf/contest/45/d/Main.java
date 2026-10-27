import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] e
            && new int[n] instanceof int[] res
            && new int[]{0} instanceof int[] cur
            && IntStream.range(0, n).allMatch(k -> (cur[0] = Math.max(cur[0] + 1, IntStream.range(0, n).filter(i -> res[i] == 0).map(i -> e[i][0]).min().getAsInt())) > 0
                && IntStream.range(0, n).filter(i -> res[i] == 0 && e[i][0] <= cur[0]).boxed().min(Comparator.comparingInt((Integer i) -> e[i][1])).map(i -> res[i] = cur[0]).isPresent())
            ? Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : "")));
    }
}





