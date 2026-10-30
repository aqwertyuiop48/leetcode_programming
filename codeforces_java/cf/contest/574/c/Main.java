import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).map(x -> x >> Integer.numberOfTrailingZeros(x)).map(y -> IntStream.iterate(y, z -> z % 3 == 0, z -> z / 3).map(z -> z / 3).reduce((p, q) -> q).orElse(y)).distinct().count() == 1 ? "Yes" : "No");
    }
}
