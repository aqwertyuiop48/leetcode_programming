import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] a
            && new int[1000001] instanceof int[] c && new int[1000001] instanceof int[] r
            && IntStream.range(1, a.length).filter(i -> ++c[a[i]] < 0).count() == 0
            && Integer.valueOf(IntStream.range(1, a.length).map(i -> c[a[i]]).max().getAsInt()) instanceof Integer mx
            ? IntStream.range(1, a.length).filter(i -> ++r[a[i]] == mx).map(i -> a[i]).findFirst().getAsInt() : "");
    }
}
