
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.generate(ni).limit(n).distinct().toArray() instanceof int[] xs && new int[] {ni.getAsInt(), 0, xs.length, 0, 0, 0} instanceof int[] s && Integer.valueOf(ni.getAsInt()) instanceof Integer b && Integer.valueOf(s[1] = s[0] - 1) != null && IntStream.iterate(0, i -> s[0] > b, i -> s[4] < s[2] ? (s[0] - s[0] % xs[s[4]] >= b ? (s[1] = Math.min(s[1], s[0] - s[0] % xs[s[4]])) * 0 + (xs[s[3]++] = xs[s[4]++]) * 0 : s[4]++) : (s[2] = s[3]) * 0 + (s[0] = s[1]) * 0 + (s[3] = 0) * 0 + (s[4] = 0) * 0 + (s[1] = s[0] - 1) * 0 + s[5]++).count() >= 0)
            System.out.print(s[5]);
    }
}



