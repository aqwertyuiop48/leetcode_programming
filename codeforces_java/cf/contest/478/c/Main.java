import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && LongStream.generate(sc::nextLong).limit(3).sorted().toArray() instanceof long[] a
            ? Math.min((a[0] + a[1] + a[2]) / 3, a[0] + a[1]) : 0);
    }
}
