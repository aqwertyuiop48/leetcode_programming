import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).ifPresent(s -> System.out.println(
            s.chars().filter(Character::isUpperCase).count() > s.length() / 2.0 ? s.toUpperCase() : s.toLowerCase()));
    }
}




