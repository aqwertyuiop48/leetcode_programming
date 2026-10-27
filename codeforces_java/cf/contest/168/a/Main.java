import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer x
            && Integer.valueOf(s.nextInt()) instanceof Integer y
            ? Math.max(0, (n * y + 99) / 100 - x)
            : 0);
    }
}

