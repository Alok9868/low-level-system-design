package org.example.lldparkinglot.model;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {


    Map<Integer, Slot> slotMap;

    Integer capacity;

    public ParkingLot(Map<Integer, Slot> slotMap, Integer cap) {

        // create the map with that capacity and all slots free
        slotMap = new HashMap<>();
        for (int i = 0; i < cap; i++) {
            slotMap.put(0, new Slot(i, true));
        }
        this.slotMap = slotMap;
        this.capacity = cap;
    }

    public String bookSlot(Car car, Integer slotNumber) {
        if (slotMap.get(slotNumber).isFree) {
            // park the car in that slot
            Slot currSlot = slotMap.get(slotNumber);
            currSlot.setFree(false);
            currSlot.setCar(car);
            slotMap.put(slotNumber, currSlot);
            return "successfully parked the car :" + car.getCarRegistrationNo() + "in slot :" + slotNumber;
        }
        return "already occupied";
    }


    public String freeSlot(Integer slotNumber) {
        // write the logic to free  the car in the slotnumber
        if (slotMap.get(slotNumber).isFree) {
            return "Slot is already empty";
        } else {
            // remove the car from that map
            Slot currSlot = slotMap.get(slotNumber);
            currSlot.setFree(true);
            Car car = currSlot.getCar();
            currSlot.setCar(null);
            return "Successfully emptied the slotNumber :" + slotNumber + "with parked car id :" + car.getCarRegistrationNo();
        }


    }


}
