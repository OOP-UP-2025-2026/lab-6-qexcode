public class Cat extends Animal {

    public Cat(String name) {
        // Виклик конструктора батьківського класу Animal
        super(name);
    }

    @Override
    public String makeSound() {
        return "Мяу";
    }
}