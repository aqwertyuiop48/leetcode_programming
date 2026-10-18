import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Stream.iterate(new int[]{1, 1}, p -> new int[]{p[1], p[0] + p[1]}).skip(s.nextInt()).findFirst().get()[0]));
    }
}




