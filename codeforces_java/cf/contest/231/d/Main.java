import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 3).map(i -> s.nextInt()).toArray() instanceof int[] p
            && IntStream.range(0, 3).map(i -> s.nextInt()).toArray() instanceof int[] b
            && IntStream.range(0, 6).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? (p[1] < 0 ? a[0] : 0) + (p[1] > b[1] ? a[1] : 0) + (p[2] < 0 ? a[2] : 0) + (p[2] > b[2] ? a[3] : 0) + (p[0] < 0 ? a[4] : 0) + (p[0] > b[0] ? a[5] : 0) : "");
    }
}
