import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] p
            && Arrays.stream(p).mapToInt(a -> a[0]).distinct().count() == 2 && Arrays.stream(p).mapToInt(a -> a[1]).distinct().count() == 2
            ? (Integer) ((Arrays.stream(p).mapToInt(a -> a[0]).max().getAsInt() - Arrays.stream(p).mapToInt(a -> a[0]).min().getAsInt()) * (Arrays.stream(p).mapToInt(a -> a[1]).max().getAsInt() - Arrays.stream(p).mapToInt(a -> a[1]).min().getAsInt())) : (Integer) (-1));
    }
}
