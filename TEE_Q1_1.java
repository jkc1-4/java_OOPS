public class TEE_Q1_1 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[6] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}