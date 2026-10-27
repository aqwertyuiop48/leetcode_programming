import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s ? 4 - IntStream.range(0, 4).map(i -> s.nextInt()).distinct().count() : "");
    }
}

