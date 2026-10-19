import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? IntStream.range(0, n).map(i -> s.next().contains("+") ? 1 : -1).sum() : "");
    }
}
