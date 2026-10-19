import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 9).map(i -> s.nextInt()).toArray() instanceof int[] a
            && Integer.valueOf((a[1] + a[2] + a[3] + a[5] + a[6] + a[7]) / 2) instanceof Integer S
            && new int[]{S - a[1] - a[2], S - a[3] - a[5], S - a[6] - a[7]} instanceof int[] d
            ? IntStream.range(0, 3).mapToObj(i -> IntStream.range(0, 3).mapToObj(j -> String.valueOf(i == j ? d[i] : a[3 * i + j])).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
