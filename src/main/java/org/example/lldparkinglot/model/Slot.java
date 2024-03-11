package org.example.lldparkinglot.model;

public class Slot {

    Integer slotNo;
    Boolean isFree;

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
