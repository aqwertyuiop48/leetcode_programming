import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && IntStream.range(0, 5).map(i -> s.nextInt()).toArray() instanceof int[] a
            ? Math.min(Math.min(Math.min(a[0], a[1]), Math.min(a[2] / 2, a[3] / 7)), a[4] / 4) : 0);
    }
}
