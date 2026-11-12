import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            ? IntStream.range(1, a.length).map(i -> Math.abs(a[i] - a[i - 1])).max().orElse(0) : "");
    }
}
