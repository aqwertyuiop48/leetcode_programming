import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Long.valueOf(sc.nextLong()) instanceof Long a ? IntStream.rangeClosed(1, 20).filter(b -> String.valueOf(a + b).contains("8")).findFirst().getAsInt() : -1);
    }
}
