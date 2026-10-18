import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && new int[]{0} instanceof int[] mx
            ? new StringBuilder(s).reverse().chars().filter(c -> c >= mx[0] && (mx[0] = c) > 0)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).reverse()
            : "");
    }
}
