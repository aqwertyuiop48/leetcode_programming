import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer v && IntStream.concat(IntStream.of(0), IntStream.generate(ni).limit(9)).toArray() instanceof int[] a && Integer.valueOf(IntStream.rangeClosed(1, 9).map(i -> a[i]).min().getAsInt()) instanceof Integer mc && Integer.valueOf(v / mc) instanceof Integer len && new int[] {v} instanceof int[] r)
            System.out.print(len == 0 ? "-1" : IntStream.range(0, len).mapToObj(p -> Integer.valueOf(IntStream.iterate(9, k -> k - 1).filter(k -> a[k] <= r[0] && r[0] - a[k] >= (len - p - 1) * mc).findFirst().getAsInt()) instanceof Integer d && (r[0] -= a[d]) >= 0 ? String.valueOf(d) : "").collect(Collectors.joining()));
    }
}
