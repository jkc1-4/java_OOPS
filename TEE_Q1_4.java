public class TEE_Q1_4 {
    public static void main(String[] args) {
        try {
            String name = "Sheersh";
            System.out.println(Integer.parseInt(name));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}