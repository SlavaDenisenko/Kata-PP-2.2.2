package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", defaultValue = "5") int carCount, ModelMap modelMap) {
        modelMap.addAttribute("cars", carService.getCar(carCount));
        return "cars";
    }
}