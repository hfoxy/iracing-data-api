package me.hfox.iracing.data.api.service.car;

import me.hfox.iracing.data.api.IRacingDataApiConfiguration;
import me.hfox.iracing.data.api.service.TestAuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = IRacingDataApiConfiguration.class)
class CarServiceImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CarServiceImplTest.class);

    @Autowired
    TestAuthService authService;

    @Autowired
    CarService carService;

    @BeforeEach
    void setUp() {
        authService.login();
    }

    @Test
    void getCars() {
        LOGGER.info("cars: {}", carService.getCarClasses());
    }

    @Test
    void getCarClasses() {
        LOGGER.info("car classes: {}", carService.getCarClasses());
    }

}