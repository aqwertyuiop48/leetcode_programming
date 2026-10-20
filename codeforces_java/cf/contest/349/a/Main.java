import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.generate(ni).limit(n).toArray() instanceof int[] a && new int[3] instanceof int[] c)
            System.out.print(Arrays.stream(a).allMatch(v -> v == 25 ? c[0]++ >= 0 : v == 50 ? c[0]-- > 0 && c[1]++ >= 0 : (c[1] > 0 && c[0] > 0 ? c[1]-- > 0 && c[0]-- > 0 : c[0] > 2 && (c[0] -= 3) >= 0)) ? "YES" : "NO");
    }
}
