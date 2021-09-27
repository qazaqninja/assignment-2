package com.company.qazaqninja;

import java.util.List;

public class Volunteer implements Observer{
    String name;

    public Volunteer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> slots) {
        System.out.println("Dear " + name + "\n" + "right now these are all available slots for volunteering event: ️\n" + "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n" + slots + "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
    }
}
