import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            ? IntStream.rangeClosed(1, 20000000).filter(h -> h / 2 >= n && h / 3 >= m && h / 2 + h / 3 - h / 6 >= n + m).findFirst().getAsInt() : -1);
    }
}
