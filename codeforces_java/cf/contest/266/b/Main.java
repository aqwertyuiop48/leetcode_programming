import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.nextInt() > 0 && Integer.valueOf(sc.nextInt()) instanceof Integer t && sc.next() instanceof String s
            ? Stream.iterate(s, x -> x.replace("BG", "GB")).skip(t).findFirst().get() : "");
    }
}
