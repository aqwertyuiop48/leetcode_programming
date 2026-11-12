public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).chars().map(c -> c >= 'A' && c <= 'Z' ? c - 'A' + 1 : c >= 'a' && c <= 'z' ? 'a' - c - 1 : 0).sum());
    }
}
