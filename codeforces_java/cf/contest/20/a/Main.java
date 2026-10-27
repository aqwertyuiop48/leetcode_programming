import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(path ->
            System.out.println(
                "/" + Arrays.stream(path.split("/")).filter(part -> !part.isEmpty()).collect(Collectors.joining("/")))));
    }
}





