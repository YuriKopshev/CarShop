package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    List<Car> carList = new ArrayList<>(10);

    public synchronized Car buyNewCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " зашел в магазин");
            int customerTimeOut = 1000;
            Thread.sleep(customerTimeOut);
            while (getCarList().size() == 0) {
                System.out.println("Нет машин в продаже");
                wait();
            }
            Thread.sleep(customerTimeOut);
            System.out.println(Thread.currentThread().getName() + " уехал на новой " + getCarList().get(0).getName());
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        return getCarList().remove(0);
    }

    public synchronized void receiveCar() {
        try {
            System.out.println(Thread.currentThread().getName() + " поставил в салон новое авто");
            int getCarTimeOut = 3000;
            Thread.sleep(getCarTimeOut);
            carList.add(new Car("Toyota"));
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public List<Car> getCarList() {
        return carList;
    }
}

