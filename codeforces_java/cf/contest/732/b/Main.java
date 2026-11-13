import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] b && new long[]{0} instanceof long[] t
            && IntStream.range(1, n).filter(i -> Integer.valueOf(Math.max(0, k - b[i - 1] - b[i])) instanceof Integer d && (t[0] += d) >= 0 && (b[i] += d) >= 0).count() >= 0
            ? t[0] + "\n" + Arrays.stream(b).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
