import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).chars().anyMatch(c -> c == 'C' || c == 'M' || c == 'Y') ? "#Color" : "#Black&White");
    }
}
