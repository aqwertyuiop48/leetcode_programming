import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            ? (IntStream.range(0, a.length).anyMatch(i -> Arrays.stream(a).allMatch(x -> a[i] % x == 0)) ? 1 : 0) : "");
    }
}
