import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer sc && (Integer) Integer.parseInt(sc.nextToken()) instanceof Integer n
            ? n / 2 + "\n" + IntStream.range(0, n / 2).mapToObj(i -> i == n / 2 - 1 && n % 2 == 1 ? "3" : "2").collect(Collectors.joining(" ")) : "");
    }
}
