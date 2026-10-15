import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(LongStream.generate(s::nextLong).limit(6).toArray()).ifPresent(v -> System.out.print(v[2] == 0 && v[3] > 0 || v[0] == 0 && v[1] > 0 && v[3] > 0 || v[0] * v[2] * v[4] < v[1] * v[3] * v[5] ? "Ron" : "Hermione")));
    }
}


