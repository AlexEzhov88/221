package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {

    void add(Car car);

    @SuppressWarnings("unchecked")
    List<Car> listCars();

    void add(User user);

    List<User> listUsers();

    User findOwner(String car_model, int car_series);
}
