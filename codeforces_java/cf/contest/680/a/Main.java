import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Arrays.stream(t).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            ? IntStream.of(a).sum() - IntStream.of(a).map(v -> Integer.valueOf((int) IntStream.of(a).filter(u -> u == v).count()) instanceof Integer c && c >= 2 ? v * Math.min(c, 3) : 0).max().getAsInt() : "");
    }
}
