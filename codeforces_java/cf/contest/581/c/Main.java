import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && new int[]{t[1]} instanceof int[] k && (Long) Arrays.stream(t).skip(2).filter(a -> a % 10 != 0).map(a -> 10 - a % 10).sorted().filter(c -> k[0] >= c && (k[0] -= c) >= 0).count() instanceof Long g ? Math.min(10L * t[0], Arrays.stream(t).skip(2).map(a -> a / 10).sum() + g + k[0] / 10) : 0);
    }
}
