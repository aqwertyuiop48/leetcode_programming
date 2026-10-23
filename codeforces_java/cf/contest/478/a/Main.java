import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print(new Scanner(System.in) instanceof Scanner sc
            && (Integer) (sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt()) instanceof Integer t
            ? (t > 0 && t % 5 == 0 ? t / 5 : -1) : 0);
    }
}
