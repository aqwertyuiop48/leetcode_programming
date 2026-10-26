import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer m && (Integer) s.nextInt() instanceof Integer t && (Integer) s.nextInt() instanceof Integer r
            && new boolean[2000] instanceof boolean[] lit && new int[1] instanceof int[] total
            ? r > t ? -1 : IntStream.range(0, m).map(i -> s.nextInt()).allMatch(w ->
                (Integer) (int) (r - IntStream.rangeClosed(w - t, w - 1).filter(x -> lit[x + 500]).count()) instanceof Integer need
                && IntStream.iterate(w - 1, x -> x >= w - t, x -> x - 1).filter(x -> !lit[x + 500]).limit(Math.max(0, need)).peek(x -> lit[x + 500] = true).count() >= 0) ? IntStream.range(0, 2000).filter(i -> lit[i]).count() : 0
            : 0);
    }
}
