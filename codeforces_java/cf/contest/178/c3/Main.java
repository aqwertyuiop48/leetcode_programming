import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer h && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Integer) BigInteger.valueOf(h).gcd(BigInteger.valueOf(m)).intValue() instanceof Integer g && (Integer) (h / g) instanceof Integer len
            && (Long) (len == 1 ? 0L : BigInteger.valueOf(m / g).modInverse(BigInteger.valueOf(len)).longValue()) instanceof Long inv
            && new TreeSet<Integer>(IntStream.range(0, h).boxed().toList()) instanceof TreeSet<Integer> free
            && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> placed && new long[]{0} instanceof long[] total
            ? IntStream.range(0, n).allMatch(i -> tk.nextToken() instanceof String op && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer id
                    && (op.equals("+")
                        ? (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x && (Integer) (x % g) instanceof Integer c && (Integer) (int) ((x / g) * inv % len) instanceof Integer t
                            && (Integer) (free.ceiling(c * len + t) instanceof Integer k1 && k1 < (c + 1) * len ? k1 : free.ceiling(c * len)) instanceof Integer key
                            && (total[0] += (key - c * len - t + len) % len) >= 0 && free.remove(key) && placed.put(id, key) == null
                        : placed.remove(id) instanceof Integer old && free.add(old))) ? total[0] : -1
            : -1);
    }
}


