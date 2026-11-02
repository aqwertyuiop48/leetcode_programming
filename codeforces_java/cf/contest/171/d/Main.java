import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? n == 5 ? 1 : n % 3 + 1
            : 0);
    }
}
