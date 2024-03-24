package org.example.lldparkinglot.model;

public class Slot {

    Integer slotNo;
    Car car;
    Boolean isFree;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Slot(Integer slotNo, Boolean isFree) {
        this.slotNo = slotNo;
        this.isFree = isFree;
    }

    public Integer getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(Integer slotNo) {
        this.slotNo = slotNo;
    }

    public Boolean getFree() {
        return isFree;
    }

    public void setFree(Boolean free) {
        isFree = free;
    }
}
