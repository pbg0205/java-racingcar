package racingcar;

import racingcar.model.Car;
import racingcar.model.CarLocationResult;

import java.util.List;
import java.util.stream.Collectors;

public class CarLocationResultConverter {

    private CarLocationResultConverter() {
    }

    public static List<CarLocationResult> convertIntoCarLocationResult(List<Car> cars) {
        return cars.stream()
                .map(CarLocationResult::from)
                .collect(Collectors.toList());
    }

}
