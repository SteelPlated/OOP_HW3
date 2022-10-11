package service;

import people.Gender;
import people.Human;
import people.Relation;
import people.Relative;

import java.util.ArrayList;
import java.util.List;

public class LoaderListInMain {

    public void voidLoadHumanRelativeInMain(List<Human> humanArrayList, List<Relative> relativeArrayList){
        humanArrayList.add(new Human("Андрей", "Бохан", Gender.MALE, "35"));
        humanArrayList.add(new Human("Катя", "Бохан", Gender.FEMALE, "37"));
        humanArrayList.add(new Human("Маша", "Бохан", Gender.FEMALE, "14"));



        relativeArrayList.add(new Relative(
                new Human("Андрей", "Бохан", Gender.MALE, "35"),
                Relation.HUSBAND,
                new Human("Катя", "Бохан", Gender.FEMALE, "37")));

        relativeArrayList.add(new Relative(
                new Human("Андрей", "Бохан", Gender.MALE, "35"),
                Relation.FATHER,
                new Human("Маша", "Бохан", Gender.FEMALE, "14")));

        relativeArrayList.add(new Relative(
                new Human("Катя", "Бохан", Gender.FEMALE, "37"),
                Relation.WIFE,
                new Human("Андрей", "Бохан", Gender.MALE, "35")));

        relativeArrayList.add(new Relative(
                new Human("Маша", "Бохан", Gender.FEMALE, "14"),
                Relation.DAUGHTER,
                new Human("Андрей", "Бохан", Gender.MALE, "35")));



    }

}