// Write a program in java to implement multiple inheritance.

class q4 implements A, B {
    @Override
    public void A_function() {
        System.out.println("From A's function");
    }

    @Override
    public void B_function() {
        System.out.println("From B's function");
    }
    public static void main(String[] args) {
        q4 obj = new q4();
        obj.A_function();
        obj.B_function();
    }
}

interface A {
    void A_function();
}

interface B {
    void B_function();
}
