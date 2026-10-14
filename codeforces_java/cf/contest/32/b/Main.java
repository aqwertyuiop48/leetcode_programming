import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(s.next().trim().replace("--", "2").replace("-.", "1").replace(".", "0")));
    }
}

