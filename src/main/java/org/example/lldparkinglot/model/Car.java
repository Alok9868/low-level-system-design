package org.example.lldparkinglot.model;


public class Car {

    Integer carRegistrationNo;
    String color;

    public Car(Integer carRegistrationNo, String color) {
        this.carRegistrationNo = carRegistrationNo;
        this.color = color;
    }

    public Integer getCarRegistrationNo() {
        return carRegistrationNo;
    }

    public void setCarRegistrationNo(Integer carRegistrationNo) {
        this.carRegistrationNo = carRegistrationNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}




