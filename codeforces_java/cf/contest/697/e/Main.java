import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && Integer.valueOf(Integer.parseInt(st.nextToken())) instanceof Integer k
            && BigInteger.valueOf(1000000006L) instanceof BigInteger ph && BigInteger.valueOf(1000000007L) instanceof BigInteger M
            && new long[]{1, 0} instanceof long[] acc
            && IntStream.range(0, k).filter(i -> Long.valueOf(Long.parseLong(st.nextToken())) instanceof Long a && (a % 2 == 0 ? acc[1] = 1 : 0) >= 0 && (acc[0] = acc[0] * (a % 1000000006L) % 1000000006L) >= 0).count() >= 0
            && BigInteger.TWO.modPow(BigInteger.valueOf((acc[0] + 1000000005L) % 1000000006L), M) instanceof BigInteger p2
            ? p2.add(BigInteger.valueOf(acc[1] == 1 ? 1 : -1)).multiply(BigInteger.valueOf(3).modInverse(M)).mod(M) + "/" + p2 : "");
    }
}
