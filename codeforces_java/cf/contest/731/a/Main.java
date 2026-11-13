import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? IntStream.range(0, s.length()).map(i -> Integer.valueOf(Math.abs(s.charAt(i) - (i == 0 ? 'a' : s.charAt(i - 1)))) instanceof Integer d ? Math.min(d, 26 - d) : 0).sum() : 0);
    }
}
