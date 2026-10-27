import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.print(LongStream.generate(s::nextLong).limit(s.nextLong()).sum()));
    }
}

