import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 9).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? IntStream.range(0, 3).mapToObj(i -> IntStream.range(0, 3).mapToObj(j -> (a[i * 3 + j] + (i > 0 ? a[i * 3 + j - 3] : 0) + (i < 2 ? a[i * 3 + j + 3] : 0) + (j > 0 ? a[i * 3 + j - 1] : 0) + (j < 2 ? a[i * 3 + j + 1] : 0)) % 2 == 0 ? "1" : "0").collect(Collectors.joining())).collect(Collectors.joining("\n")) : "");
    }
}
