package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarsController {
    private CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(required = false, value = "count") Integer count) {
        List<Car> cars = carService.getNumOfCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
