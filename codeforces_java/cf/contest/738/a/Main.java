public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+")[1].replaceAll("ogo(go)*", "***"));
    }
}
