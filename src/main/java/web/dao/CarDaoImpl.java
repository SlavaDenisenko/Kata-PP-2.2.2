package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> carList = new ArrayList<>(Arrays.asList(
            new Car("Audi", 5, 500),
            new Car("BMV", 3, 10000),
            new Car("Toyota", 2, 0),
            new Car("Kia", 10, 5000),
            new Car("Mercedes", 1, 50)));

    @Override
    public List<Car> getCarList() {
        return carList;
    }
}