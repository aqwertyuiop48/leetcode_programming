import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && LongStream.generate(s::nextLong).limit(6).toArray() instanceof long[] a
            ? ((a[0] + a[1] + a[2]) * (a[0] + a[1] + a[2]) - a[0] * a[0] - a[2] * a[2] - a[4] * a[4]) % 2 == 1 ? "First" : "Second"
            : "");
    }
}
