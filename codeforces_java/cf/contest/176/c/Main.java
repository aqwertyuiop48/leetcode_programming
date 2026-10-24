import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.range(0, 6).map(i -> s.nextInt()).toArray() instanceof int[] a
            && (Integer) Math.min(Math.abs(a[2] - a[4]), Math.abs(a[3] - a[5])) instanceof Integer lo && (Integer) Math.max(Math.abs(a[2] - a[4]), Math.abs(a[3] - a[5])) instanceof Integer hi
            ? hi >= 5 || hi == 4 && lo >= 3 ? "Second" : "First"
            : "");
    }
}
