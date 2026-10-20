import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && LongStream.generate(s::nextLong).limit(6).toArray() instanceof long[] v
            && Long.valueOf(java.math.BigInteger.valueOf(v[4]).gcd(java.math.BigInteger.valueOf(v[5])).longValue()) instanceof Long g
            && Long.valueOf(Math.min(v[0] / (v[4] / g), v[1] / (v[5] / g))) instanceof Long k
            && Long.valueOf(v[4] / g * k) instanceof Long w && Long.valueOf(v[5] / g * k) instanceof Long h
            && Long.valueOf(Math.max(0, Math.min(v[2] - (w + 1) / 2, v[0] - w))) instanceof Long x1
            && Long.valueOf(Math.max(0, Math.min(v[3] - (h + 1) / 2, v[1] - h))) instanceof Long y1
            ? x1 + " " + y1 + " " + (x1 + w) + " " + (y1 + h) : "");
    }
}
