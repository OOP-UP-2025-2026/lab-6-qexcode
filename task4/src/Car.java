public class Car implements Comparable {

    private int price;
    private int year; // рік виготовлення
    private int horsePower;


    public Car(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }


    @Override
    public int compareTo(Object o) {
        //  Приводимо тип Object до Car
        Car otherCar = (Car) o;

        //  Порівнюємо ціну ("більше" = вища ціна)
        // Використовуємо арифметику, як вимагає завдання
        int priceCompare = this.price - otherCar.price;
        if (priceCompare != 0) {
            return priceCompare;
        }


        int yearCompare = otherCar.year - this.year;
        if (yearCompare != 0) {
            return yearCompare;
        }

        //  Якщо роки рівні, порівнюємо кінські сили ("більше" = більше к.с.)
        return this.horsePower - otherCar.horsePower;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    // Додатковий метод toString() для зручного виведення
    @Override
    public String toString() {
        return "Car[Ціна=" + price + ", Рік=" + year + ", к.с.=" + horsePower + "]";
    }
}