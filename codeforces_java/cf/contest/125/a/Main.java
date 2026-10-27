import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            (Integer) ((new Scanner(System.in).nextInt() + 1) / 3) instanceof Integer t
            ? t / 12 + " " + t % 12 : "");
    }
}

