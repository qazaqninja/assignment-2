package com.company.qazaqninja;

public class Main {
    public static void main(String[] Args){
        VolunteersClub volunteersClub = new VolunteersClub();

        volunteersClub.addSlot("Volunteer at Comic-Con");
        volunteersClub.addSlot("Volunteer at Iron Man");
        volunteersClub.addSlot("Volunteer at Karate World Championship");
        volunteersClub.addSlot("Volunteer at UWW Championship");
        volunteersClub.addSlot("Volunteer at Astana Finance Forum");

        Observer Volunteer1 = new Volunteer("Angsagan Kenzhebek");
        Observer Volunteer2 = new Volunteer("Aida Turapbai");
        Observer Volunteer3 = new Volunteer("Sanzhar Bazilzhanov");
        Observer Volunteer4 = new Volunteer("Dauren Kadyrbek");
        Observer Volunteer5 = new Volunteer("Arkhat Serikbekov");

        volunteersClub.addObserver(Volunteer1);
        volunteersClub.addObserver(Volunteer2);
        volunteersClub.addObserver(Volunteer3);
        volunteersClub.addObserver(Volunteer4);
        volunteersClub.addObserver(Volunteer5);

        volunteersClub.addSlot("Volunteer");

        volunteersClub.removeSlot("Volunteer at Karate World Championship");
    }
}
