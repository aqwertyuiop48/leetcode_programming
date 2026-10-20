import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.generate(ni).limit(n).toArray() instanceof int[] a)
            System.out.print(Math.max(Arrays.stream(a).max().getAsInt(), (Arrays.stream(a).asLongStream().sum() + n - 2) / (n - 1)));
    }
}
