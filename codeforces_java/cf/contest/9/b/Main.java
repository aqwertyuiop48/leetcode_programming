import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(nvv ->
            System.out.println(
                IntStream.range(0, nvv[0]).map(i -> s.nextInt()).toArray() instanceof int[] xs
                && new int[]{s.nextInt(), s.nextInt()} instanceof int[] uni
                && new double[]{Double.MAX_VALUE, 0} instanceof double[] best
                && IntStream.range(1, nvv[0]).allMatch(i ->
                    new double[]{(double) xs[i] / nvv[1] + Math.hypot(xs[i] - uni[0], uni[1]) / nvv[2]} instanceof double[] t
                    && (t[0] <= best[0] + 1e-9
                        ? ((best[0] = t[0]) >= 0 && (best[1] = i + 1) >= 0)
                        : true))
                ? (int) best[1]
                : 0)));
    }
}

