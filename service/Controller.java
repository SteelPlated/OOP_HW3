package service;

import people.Human;
import people.Relation;
import people.Relative;
import service.Service;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public List<Relative> tree = new ArrayList<>();

    private Service service;

    public Controller() {
        this.service = new Service();
    }


    public List<Human> getFindHumanByNameSurname(List<Human> list, String name, String surname) { 
        return service.findHuman(list, name, surname);
    }

    public List<Relative> getHumanRelative(List<Relative> listRelativeMain, String name, String surname){
        return service.getHumansRelative(listRelativeMain, name, surname);
    }

    public List<Human> findHuman(List<Human> list, String name, String surname) {
        List<Human> human = new ArrayList<>();
        for (Human h : list) {
            if (h.getName().equals(name) && h.getSurname().equals(surname)) {
                human.add(h);
            }
        }
        return human;
    }

    public List<Relative> searchByStatus(Human person, Relation status, List<Relative> rltList) {
        List<Relative> response = new ArrayList<>();
        for (Relative r : rltList) {
            if (r.getHuman1().equals(person) && r.getRelation().equals(status)) {
                response.add(r);
            }
        }
        return response;
    }

    public void buildTree(Human startPerson, List<Relative> rltList) {
        tree.addAll(searchByStatus(startPerson, Relation.HUSBAND, rltList));
        List<Relative> tmp = (searchByStatus(startPerson, Relation.FATHER, rltList));
        tree.addAll(tmp);
        for (Relative persons : tmp) {
            buildTree(persons.getHuman2(), rltList);
        }
    }
}