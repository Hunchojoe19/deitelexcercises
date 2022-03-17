package tddClass.airConditioner;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
@Test
    void acCanBeCreated(){
    AirConditioner aC = new AirConditioner();
    assertNotNull(aC);
}

@Test
void acCanBeSwitchedOn(){
AirConditioner aC = new AirConditioner();
aC.setSwitch();
assertEquals(true, aC.isOn());
}

@Test
    void acCanBeSwitchedOff(){
    AirConditioner aC = new AirConditioner();
    aC.setSwitch();
    aC.setSwitch();
    assertFalse(aC.isOn());
}

@Test
    void acTemperatureCanIncrease(){
    AirConditioner aC = new AirConditioner();
    aC.setSwitch();
    aC.increaseTemperature();
    assertEquals(17, aC.getTemperature());
}

@Test
    void acTemperatureCannotIncreaseTemperatureWhenItsOff(){
    AirConditioner aC = new AirConditioner();
    aC.setSwitch();
    aC.setSwitch();
    aC.increaseTemperature();
    assertEquals(16, aC.getTemperature());
}

@Test
    void acTemperatureCannotExceed30 (){
    AirConditioner aC = new AirConditioner();
    aC.setSwitch();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    aC.increaseTemperature();
    assertEquals(30, aC.getTemperature());
}
@Test
    void aCTemperatureWillNotDecreaseWhenOff (){
    AirConditioner aC = new AirConditioner();
    aC.setSwitch();
    aC.decreaseTemperature();
    assertEquals(16, aC.getTemperature());
}

@Test
void aCTemperatureWillNotDecreaseBelow16(){
    AirConditioner aC = new AirConditioner();
    aC.setSwitch();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    aC.decreaseTemperature();
    assertEquals(16, aC.getTemperature());
}
}