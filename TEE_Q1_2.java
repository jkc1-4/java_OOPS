public class TEE_Q1_2 {
    public static void main(String[] args) {
        try {
            int num = 10;
            System.out.println(num / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}