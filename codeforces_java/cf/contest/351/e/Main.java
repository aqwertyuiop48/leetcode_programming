import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Math.abs(s.nextInt())).toArray() instanceof int[] a
            ? IntStream.range(0, n).map(i -> Math.min((int) IntStream.range(0, i).filter(j -> a[j] < a[i]).count(), (int) IntStream.range(i + 1, n).filter(j -> a[j] < a[i]).count())).sum() : "");
    }
}
