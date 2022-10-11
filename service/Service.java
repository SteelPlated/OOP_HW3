package service;

import people.Human;
import people.Relative;

import java.util.ArrayList;
import java.util.List;

public class Service {


    public List<Human> findHuman(List<Human> list, String name, String surname) {
        List<Human> human = new ArrayList<>();
        for (Human h : list) {
            if (h.getName().equals(name) && h.getSurname().equals(surname)) {
                human.add(h);
            }
        }
        return human;
    }

    public List<Relative> getHumansRelative(List<Relative> listRelativeMain, String name, String surname) {
        List<Relative> relativeListService = new ArrayList<>();
        for (Relative r : listRelativeMain) {
            if (r.getHuman1().getName().equals(name) && r.getHuman1().getSurname().equals(surname))
                relativeListService.add(r);
        }
        return relativeListService;
    }


}