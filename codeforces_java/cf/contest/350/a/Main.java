import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m && IntStream.generate(ni).limit(n).toArray() instanceof int[] a && IntStream.generate(ni).limit(m).toArray() instanceof int[] b && Integer.valueOf(Math.max(Arrays.stream(a).max().getAsInt(), 2 * Arrays.stream(a).min().getAsInt())) instanceof Integer v)
            System.out.print(v < Arrays.stream(b).min().getAsInt() ? v : -1);
    }
}
