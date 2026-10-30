import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t && (Integer) t[0] instanceof Integer n && new int[n] instanceof int[] done && new int[1] instanceof int[] c ? IntStream.iterate(0, k -> c[0] < n, k -> k + 1).map(k -> (int) IntStream.range(0, n).map(j -> k % 2 == 0 ? j : n - 1 - j).filter(i -> done[i] == 0 && t[1 + i] <= c[0] && (done[i] = 1) + (c[0]++) >= 0).count()).map(k -> 1).sum() - 1 : -1);
    }
}
