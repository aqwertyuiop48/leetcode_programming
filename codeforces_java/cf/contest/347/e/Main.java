import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    record S(int a, int[] xs) {}

    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.generate(ni).limit(n).distinct().toArray() instanceof int[] xs && Integer.valueOf(ni.getAsInt()) instanceof Integer a && Integer.valueOf(ni.getAsInt()) instanceof Integer b)
            System.out.print(Stream.iterate(new S(a, xs), s -> s.a() > b, s -> Arrays.stream(s.xs()).filter(x -> s.a() - s.a() % x >= b).toArray() instanceof int[] ys ? new S(Math.min(s.a() - 1, Arrays.stream(ys).map(x -> s.a() - s.a() % x).min().orElse(s.a() - 1)), ys) : s).count());
    }
}
