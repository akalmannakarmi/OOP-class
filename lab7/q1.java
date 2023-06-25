// Write a Java program to create a class called Animal with a method called makeSound().
// Create a subclass called Cat that overrides the makeSound() method to bark.

public class q1 {
    public static void main(String []args){
        Animal a1 = new Animal();
        Cat c1 = new Cat();
        a1.makeSound();
        c1.makeSound();
    }
}

class Animal{
    public void makeSound(){
        System.out.println("Animal Sound!");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark!");
    }
}

