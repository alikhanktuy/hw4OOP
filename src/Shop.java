import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private List<Cars> listOfCars = new ArrayList<>();

    public void addCars(Cars cars) {
        listOfCars.add(cars);
    }

    public void printAllCars() {
        System.out.println(listOfCars);
    }

    public void soldCar(int i) {
        int size = listOfCars.size();
        if (i > size) {
            System.out.println("Количество авто ограничено. У нас есть " + size + " авто ");
            System.out.println("Чтобы купить авто введите название лота (начинается с 0 и до " + --size + ")");
        } else {
            System.out.println("В продаже имеется " + size + " машин");
            System.out.println("Чтобы купить авто введите название лота (начинается с 0 и до " + --size + ")");
            System.out.println("Вы купили " + listOfCars.get(i));
            listOfCars.remove(i);
            System.out.println("Машина продана");
        }

    }
}