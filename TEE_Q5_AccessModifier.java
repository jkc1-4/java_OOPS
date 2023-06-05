class MyClass {
    public int publicData; // Accessible from anywhere
    private int privateData; // Accessible only within the same class
    protected int protectedData; // Accessible within the same class, subclasses, and same package
    int defaultData; // Accessible within the same package only

    public void publicMethod() {
        // Accessible from anywhere
    }

    private void privateMethod() {
        // Accessible only within the same class
    }

    protected void protectedMethod() {
        // Accessible within the same class, subclasses, and same package
    }

    void defaultMethod() {
        // Accessible within the same package only
    }
}

public class TEE_Q5_AccessModifier {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.publicData = 10; // Accessible
        // obj.privateData = 20; // Not accessible (compile-time error)
        obj.protectedData = 30; // Accessible
        obj.defaultData = 40; // Accessible

        obj.publicMethod(); // Accessible
        // obj.privateMethod(); // Not accessible (compile-time error)
        obj.protectedMethod(); // Accessible
        obj.defaultMethod(); // Accessible
    }
}