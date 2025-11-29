public class Smartphone implements GPS, Cellular {

    private double latitude;
    private double longitude;

    // Конструктор для встановлення початкової локації
    public Smartphone(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }



    @Override
    public double[] getCoordinates() {
        // Повертаємо масив з двох значень
        return new double[] { this.latitude, this.longitude };
    }



    @Override
    public void makeCall() {
        System.out.println("Здійснюю дзвінок...");
    }

    @Override
    public void receiveCall() {
        System.out.println("Приймаю вхідний дзвінок...");
    }

    // Додатковий метод для зміни локації
    public void updateLocation(double newLatitude, double newLongitude) {
        this.latitude = newLatitude;
        this.longitude = newLongitude;
        System.out.println("Локацію оновлено.");
    }
}