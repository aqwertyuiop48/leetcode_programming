import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long n ? n % 2 == 0 ? n / 2 : -(n + 1) / 2 : 0);
    }
}
