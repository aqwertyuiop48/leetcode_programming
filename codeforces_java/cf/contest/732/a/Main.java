import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer k && Integer.valueOf(s.nextInt()) instanceof Integer r
            ? IntStream.rangeClosed(1, 10).filter(n -> n * k % 10 == 0 || n * k % 10 == r).findFirst().getAsInt() : 0);
    }
}
