import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.generate(ni).limit(n).sorted().toArray() instanceof int[] a)
            System.out.print(IntStream.range(0, n).map(i -> i == 0 ? a[n - 1] : i == n - 1 ? a[0] : a[i]).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }
}
