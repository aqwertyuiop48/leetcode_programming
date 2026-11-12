import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in).next() instanceof String s && Integer.valueOf(s.length()) instanceof Integer n
            && (Integer) IntStream.range(0, n).filter(i -> s.charAt(i) != (char) 97).findFirst().orElse(-1) instanceof Integer f
            && (Integer) IntStream.range(Math.max(f, 0), n).filter(i -> s.charAt(i) == (char) 97).findFirst().orElse(n) instanceof Integer e
            ? IntStream.range(0, n).mapToObj(i -> String.valueOf((char) (f < 0 ? (i == n - 1 ? 'z' : 'a') : i >= f && i < e ? s.charAt(i) - 1 : s.charAt(i)))).collect(Collectors.joining()) : "");
    }
}
