public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println((2 * Long.parseLong(new String(System.in.readAllBytes()).trim()) + 1) / 3);
    }
}
