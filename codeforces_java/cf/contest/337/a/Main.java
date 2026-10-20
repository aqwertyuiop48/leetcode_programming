import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.generate(s::nextInt).limit(m).sorted().toArray() instanceof int[] f
            ? IntStream.rangeClosed(0, m - n).map(i -> f[i + n - 1] - f[i]).min().getAsInt() : "");
    }
}
