package com.codedifferently.stayready.lab04;


import org.junit.Test;

public class CarRideTest {
    //Given
    CarRide.answer = "yes";
        
    //When
    String expectedValue = "Good!";
    String actualValue = CarRide.areWeThereYet();


    //Then
    Assert.assertEquals(expectedValue, actualValue);


}
