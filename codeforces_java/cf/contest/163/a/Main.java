import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next().toCharArray() instanceof char[] a && sc.next().toCharArray() instanceof char[] b
            && (Integer) b.length instanceof Integer m && new int[][]{new int[m + 1], new int[m + 1]} instanceof int[][] rows
            ? IntStream.range(0, a.length).mapToLong(i -> rows[i & 1] instanceof int[] prev && rows[(i + 1) & 1] instanceof int[] cur && (cur[0] = 0) == 0
                && IntStream.rangeClosed(1, m).allMatch(j -> (cur[j] = cur[j - 1] + (a[i] == b[j - 1] ? prev[j - 1] + 1 : 0)) >= 0 && (cur[j] < 1000000007 || (cur[j] -= 1000000007) >= 0)) ? cur[m] : 0).sum() % 1000000007L
            : 0);
    }


}
