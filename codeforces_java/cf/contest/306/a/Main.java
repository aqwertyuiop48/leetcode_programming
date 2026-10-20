import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(i -> String.valueOf(n / m + (i >= m - n % m ? 1 : 0))).collect(Collectors.joining(" ")) : "");
    }
}
