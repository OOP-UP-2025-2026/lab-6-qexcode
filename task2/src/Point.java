public class Point implements Movable {

    // Поля для зберігання координат
    private double x;
    private double y;

    // Конструктор для ініціалізації точки
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // --- Реалізація методів інтерфейсу Movable ---

    @Override
    public void setX(double x) {
        this.x = x;
    }

    @Override
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }

    @Override
    public void moveTo(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Додатковий метод для зручного виведення
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}