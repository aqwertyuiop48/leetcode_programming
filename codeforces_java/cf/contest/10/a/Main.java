import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(cfg ->
            System.out.println(
                new long[(int) cfg[0]] instanceof long[] l
                && new long[(int) cfg[0]] instanceof long[] r
                && IntStream.range(0, (int) cfg[0]).allMatch(i -> (l[i] = s.nextLong()) >= 0 && (r[i] = s.nextLong()) >= 0)
                && new long[]{0} instanceof long[] total
                && IntStream.range(0, (int) cfg[0]).allMatch(i ->
                    (total[0] += (r[i] - l[i]) * cfg[1]) >= 0
                    && (i == cfg[0] - 1
                        || (new long[]{l[i + 1] - r[i]} instanceof long[] gap
                            && (total[0] += Math.min(gap[0], cfg[4]) * cfg[1]
                                + Math.max(0, Math.min(gap[0] - cfg[4], cfg[5])) * cfg[2]
                                + Math.max(0, gap[0] - cfg[4] - cfg[5]) * cfg[3]) >= 0)))
                ? total[0]
                : 0L)));
    }
}



