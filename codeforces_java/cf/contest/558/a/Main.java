import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] t
            && Arrays.stream(t).filter(p -> p[0] > 0).sorted(Comparator.comparingInt(p -> p[0])).mapToInt(p -> p[1]).toArray() instanceof int[] pos
            && Arrays.stream(t).filter(p -> p[0] < 0).sorted(Comparator.comparingInt(p -> -p[0])).mapToInt(p -> p[1]).toArray() instanceof int[] neg
            ? Arrays.stream(pos).limit(Math.min(pos.length, neg.length) + (pos.length > neg.length ? 1 : 0)).sum() + Arrays.stream(neg).limit(Math.min(pos.length, neg.length) + (neg.length > pos.length ? 1 : 0)).sum() : "");
    }
}
