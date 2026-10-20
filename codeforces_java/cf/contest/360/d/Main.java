import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer m && Long.valueOf(it.nextLong()) instanceof Long p && Long.valueOf(p - 1) instanceof Long pm
            && LongStream.generate(it::nextLong).limit(n).toArray() instanceof long[] a
            && Long.valueOf(LongStream.generate(it::nextLong).limit(m).reduce(pm, (x, y) -> java.math.BigInteger.valueOf(x).gcd(java.math.BigInteger.valueOf(y)).longValue())) instanceof Long G
            && new long[]{pm} instanceof long[] rem
            && LongStream.rangeClosed(2, 40000).filter(q -> rem[0] % q == 0 && LongStream.iterate(0, z -> rem[0] % q == 0, z -> z + 1).allMatch(z -> (rem[0] /= q) > 0)).toArray() instanceof long[] pr1
            && LongStream.concat(Arrays.stream(pr1), rem[0] > 1 ? LongStream.of(rem[0]) : LongStream.empty()).toArray() instanceof long[] pr
            && ((LongBinaryOperator) (b, e) -> java.math.BigInteger.valueOf(b).modPow(java.math.BigInteger.valueOf(e), java.math.BigInteger.valueOf(p)).longValue()) instanceof LongBinaryOperator pw
            && Arrays.stream(a).map(v -> Long.valueOf(pw.applyAsLong(v, G)) instanceof Long x
                ? Arrays.stream(pr).reduce(pm, (o, q) -> o / java.math.BigInteger.valueOf(q).pow((int) LongStream.iterate(o, z -> z % q == 0 && pw.applyAsLong(x, z / q) == 1, z -> z / q).count()).longValue()) : 0).distinct().toArray() instanceof long[] ds
            && LongStream.rangeClosed(1, 40000).filter(d -> pm % d == 0).flatMap(d -> LongStream.of(d, pm / d)).distinct().toArray() instanceof long[] divs
            ? Arrays.stream(divs).filter(e -> Arrays.stream(ds).anyMatch(d -> d % e == 0)).map(e -> Arrays.stream(pr).filter(q -> e % q == 0).reduce(e, (ph, q) -> ph / q * (q - 1))).sum() : "");
    }
}
