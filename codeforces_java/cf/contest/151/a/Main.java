import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && IntStream.generate(s::nextInt).limit(8).toArray() instanceof int[] a
            ? Math.min(Math.min(a[1] * a[2] / a[6], a[3] * a[4]), a[5] / a[7]) / a[0]
            : 0);
    }
}

