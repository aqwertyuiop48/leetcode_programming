import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.of(0).peek(z -> IntStream.range(0, ni.getAsInt()).forEach(tc -> sb.append(Integer.valueOf(ni.getAsInt()) instanceof Integer n
                && Integer.valueOf(ni.getAsInt()) instanceof Integer m && Integer.valueOf(ni.getAsInt()) instanceof Integer k
                && new long[1] instanceof long[] acc
                && Long.valueOf(IntStream.range(0, k).filter(i -> Integer.valueOf(ni.getAsInt()) instanceof Integer x
                    && Integer.valueOf(ni.getAsInt()) instanceof Integer y && Integer.valueOf(ni.getAsInt()) instanceof Integer c
                    && (x - 1 == 0 || x - n == 0 || y - 1 == 0 || y - m == 0)
                    && !((x - 1 == 0 || x - n == 0) && (y - 1 == 0 || y - m == 0))
                    && (acc[0] += c) >= 0).count()) instanceof Long fo
                && Long.valueOf(2L * (n - 2) + 2L * (m - 2) - fo) instanceof Long uf
                && Long.valueOf(1L * n * m - k) instanceof Long fr
                ? (uf > 0 ? BigInteger.TWO.modPow(BigInteger.valueOf(fr - 1), BigInteger.valueOf(1000000007L)).toString()
                    : acc[0] % 2 == 0 ? BigInteger.TWO.modPow(BigInteger.valueOf(fr), BigInteger.valueOf(1000000007L)).toString() : "0") : "").append('\n'))).sum() == 0
            ? sb.toString() : "");
    }
}
