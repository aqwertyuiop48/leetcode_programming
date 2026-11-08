import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(6 - Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToInt(Integer::parseInt).sum());
    }
}
