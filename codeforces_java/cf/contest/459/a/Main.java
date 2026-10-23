import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(
            new Scanner(System.in) instanceof Scanner s
            && IntStream.generate(s::nextInt).limit(4).toArray() instanceof int[] a
            ? a[0] == a[2]
                ? (a[0] + Math.abs(a[1] - a[3])) + " " + a[1] + " " + (a[2] + Math.abs(a[1] - a[3])) + " " + a[3]
                : a[1] == a[3]
                    ? a[0] + " " + (a[1] + Math.abs(a[0] - a[2])) + " " + a[2] + " " + (a[3] + Math.abs(a[0] - a[2]))
                    : Math.abs(a[0] - a[2]) == Math.abs(a[1] - a[3])
                        ? a[0] + " " + a[3] + " " + a[2] + " " + a[1]
                        : "-1"
            : "");
    }
}
