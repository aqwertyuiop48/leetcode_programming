import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n - 1).map(i -> s.nextInt()).toArray() instanceof int[] a1
            && IntStream.range(0, n - 1).map(i -> s.nextInt()).toArray() instanceof int[] a2
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] b
            ? IntStream.range(0, n).map(i -> IntStream.range(0, i).map(j -> a1[j]).sum() + b[i] + IntStream.range(i, n - 1).map(j -> a2[j]).sum()).sorted().limit(2).sum() : 0);
    }
}
