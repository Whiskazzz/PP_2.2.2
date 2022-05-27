package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private List<Car> createCars() {
        List<Car> cars = new ArrayList<>(5);
        cars.add(new Car(123,1000,"koyota"));
        cars.add(new Car(124,1500,"gada"));
        cars.add(new Car(125,500,"many cooper"));
        cars.add(new Car(126,1500,"supraaa"));
        cars.add(new Car(127,1000,"nesupra"));
        return cars;
    }

    @Override
    public List<Car> getNumOfCars(Integer num) {
        if (num != null) {
            return createCars().subList(0,num);
        }
        else {
            return createCars();
        }
    }
}
