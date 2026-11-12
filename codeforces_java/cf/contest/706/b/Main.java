import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.range(0, n).mapToDouble(i -> Double.parseDouble(st.nextToken())).sorted().toArray() instanceof double[] p
            && Integer.valueOf(st.nextToken()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> String.valueOf(-Arrays.binarySearch(p, Double.parseDouble(st.nextToken()) + 0.5) - 1)).collect(Collectors.joining("\n")) : "");
    }
}
