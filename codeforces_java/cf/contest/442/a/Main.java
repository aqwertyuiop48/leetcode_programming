import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).distinct().toList() instanceof List<String> t
            ? IntStream.range(0, 1024).filter(m -> t.stream().allMatch(a -> t.stream().allMatch(b -> a.equals(b)
                || a.charAt(0) != b.charAt(0) && ((m >> "RGBYW".indexOf(a.charAt(0)) & 1) == 1 || (m >> "RGBYW".indexOf(b.charAt(0)) & 1) == 1)
                || a.charAt(1) != b.charAt(1) && ((m >> 5 + a.charAt(1) - '1' & 1) == 1 || (m >> 5 + b.charAt(1) - '1' & 1) == 1)))).map(Integer::bitCount).min().getAsInt() : 0);
    }
}
