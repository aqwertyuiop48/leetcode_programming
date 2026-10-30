import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n).map(i -> Integer.parseInt(tk.nextToken())).sorted().toArray() instanceof int[] x
            ? IntStream.range(0, n / 2).map(i -> x[i + n / 2] - x[i]).min().getAsInt() : 0);
    }
}
