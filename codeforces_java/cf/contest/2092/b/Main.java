import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.of(0).peek(z -> IntStream.range(0, ni.getAsInt()).forEach(tc -> sb.append(Integer.valueOf(ni.getAsInt()) instanceof Integer n
                && st.nextToken() instanceof String a && st.nextToken() instanceof String b
                && IntStream.range(0, n).filter(i -> i % 2 == 0 ? a.charAt(i) == '0' : b.charAt(i) == '0').count() >= (n + 1) / 2
                && IntStream.range(0, n).filter(i -> i % 2 == 1 ? a.charAt(i) == '0' : b.charAt(i) == '0').count() >= n / 2 ? "YES\n" : "NO\n"))).sum() == 0
            ? sb.toString() : "");
    }
}
