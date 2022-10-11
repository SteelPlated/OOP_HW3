package service;

import people.Human;
import people.Relation;
import people.Relative;

import java.util.List;

public class ViewService {

    public void printMenu() {
        String menu = "\n\n" +
                "Выберете действие:\n" +
                "1. Вывести информацию по людям\n" +
                "2. Найти человека\n" +
                "3. Вывести полную информацию о родственниках\n" +
                "0: Выход\n" + "_> ";
        System.out.println(menu);
    }

    public void printFullHumanList(List<Human> list){
        for (Human person : list) {
            System.out.println(person);
        }
    }

    public void printFullRelativesList(List<Relative> rtlList) {
        for (Relative pair : rtlList)
            System.out.println(pair);
    }

    public void printTree(List<Relative> list) {
        for (Relative r : list) {
            if (r.getRelation().equals(Relation.FATHER)) {
                System.out.print("||  |\n||  |______");
                System.out.println(r.getRelation() + " of " + r.getHuman2());
            } else {
                System.out.print("||\n\n||");
                System.out.println(r);
            }
        }
    }
}