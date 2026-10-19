import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(Math.min(sc.nextInt(), sc.nextInt())) instanceof Integer k
            ? (k + 1) + IntStream.rangeClosed(0, k).mapToObj(i -> "\n" + i + " " + (k - i)).collect(Collectors.joining()) : "");
    }
}
