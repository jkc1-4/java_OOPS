interface FlyAbility {
    void fly();
}

interface SwimAbility {
    void swim();
}

class Bird implements FlyAbility, SwimAbility {
    @Override
    public void swim() {
        System.out.println("Bird swims.");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies.");
    }
}

public class TEE_Q4_MultipleInheritence {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}
