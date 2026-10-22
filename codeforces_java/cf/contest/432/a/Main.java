import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            ? IntStream.range(0, n).map(i -> sc.nextInt()).filter(y -> y + k <= 5).count() / 3 : "");
    }
}
