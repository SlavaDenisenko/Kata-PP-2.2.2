package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCar(int count) {
        if (count == 0 || count > 5) return carDao.getCarList();
        return carDao.getCarList().stream().limit(count).collect(Collectors.toList());
    }
}