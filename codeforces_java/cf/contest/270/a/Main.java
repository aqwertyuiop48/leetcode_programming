import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            ? IntStream.range(0, sc.nextInt()).mapToObj(i -> 360 % (180 - sc.nextInt()) == 0 ? "YES" : "NO").collect(Collectors.joining("\n")) : "");
    }
}
