public class Dog extends Animal {

    public Dog(String name) {
        // Виклик конструктора батьківського класу Animal
        super(name);
    }

    @Override
    public String makeSound() {
        return "Гав";
    }
}