package builder;

public class Main {
    public static void main(String[] args) {
        House house = new House
                .HouseBuilder("Pushkina 4", 4)
                .setSwimmingPool(true)
                .setGarden(false)
                .build();
        System.out.println(house);
    }
}
//Строитель — это порождающий паттерн проектирования,
//который позволяет создавать сложные объекты пошагово.
//Строитель даёт возможность использовать один и тот же код строительства
//для получения разных представлений объектов.