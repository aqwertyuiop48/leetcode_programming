import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.generate(ni).limit(n).toArray() instanceof int[] a)
            System.out.print(IntStream.range(0, n).filter(i -> a[i] == i).count() + (IntStream.range(0, n).anyMatch(i -> a[i] != i && a[a[i]] == i) ? 2 : IntStream.range(0, n).anyMatch(i -> a[i] != i) ? 1 : 0));
    }
}
