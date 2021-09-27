package com.company.qazaqninja;

import java.util.ArrayList;
import java.util.List;

public class VolunteersClub implements Observed{
    List<String> slots = new ArrayList<>();

    List<Observer> volunteers = new ArrayList<>();

    public void addSlot(String slot){
        this.slots.add(slot);
        notifyObservers();
    }

    public void removeSlot(String slot){
        this.slots.remove(slot);
         notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.volunteers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.volunteers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : volunteers){
            observer.handleEvent(this.slots);
        }
    }
}
