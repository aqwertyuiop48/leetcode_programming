import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Double.valueOf(st.nextToken()) instanceof Double a && Double.valueOf(st.nextToken()) instanceof Double b && Integer.valueOf(st.nextToken()) instanceof Integer n
            ? String.format(Locale.US, "%.12f", IntStream.range(0, n).mapToDouble(i -> Math.hypot(Double.parseDouble(st.nextToken()) - a, Double.parseDouble(st.nextToken()) - b) / Double.parseDouble(st.nextToken())).min().getAsDouble()) : "");
    }
}
