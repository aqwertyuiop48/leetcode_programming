import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.range(0, n).mapToObj(i -> new int[] {ni.getAsInt(), ni.getAsInt()}).sorted(Comparator.comparingInt(p -> Math.abs(p[0]) + Math.abs(p[1]))).flatMap(p -> Stream.of(p[0] != 0 ? "1 " + Math.abs(p[0]) + (p[0] > 0 ? " R" : " L") : "", p[1] != 0 ? "1 " + Math.abs(p[1]) + (p[1] > 0 ? " U" : " D") : "", "2", p[0] != 0 ? "1 " + Math.abs(p[0]) + (p[0] > 0 ? " L" : " R") : "", p[1] != 0 ? "1 " + Math.abs(p[1]) + (p[1] > 0 ? " D" : " U") : "", "3")).filter(s -> !s.isEmpty()).collect(Collectors.toList()) instanceof List<String> ops)
            System.out.print(ops.size() + "\n" + String.join("\n", ops));
    }
}
