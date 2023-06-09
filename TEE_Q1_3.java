public class TEE_Q1_3 {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}