package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", defaultValue = "5") int carCount, ModelMap modelMap) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", 5, 500));
        carList.add(new Car("BMV", 3, 10000));
        carList.add(new Car("Toyota", 2, 0));
        carList.add(new Car("Kia", 10, 5000));
        carList.add(new Car("Mercedes", 1, 50));
        carList = CarService.getCar(carList, carCount);
        modelMap.addAttribute("cars", carList);
        return "cars";
    }
}
