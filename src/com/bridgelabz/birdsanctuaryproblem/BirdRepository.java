package com.bridgelabz.birdsanctuaryproblem;

import java.util.ArrayList;
import java.util.List;

public class BirdRepository {

    private List birdList = new ArrayList();

    List getBirdList() {
        return birdList;
    }

     void addBirds (Duck duck) {
        birdList.add(duck);
    }

     void addBirds (Flemingo flemingo) {
        birdList.add(flemingo);
    }

     void addBirds (Ostrich ostrich) {
        birdList.add(ostrich);
    }

     void addBirds (Parrot parrot) {
        birdList.add(parrot);
    }

     void addBirds (Penguine penguine) {
        birdList.add(penguine);
    }

    void removeBirds (Duck duck) {
        birdList.remove(duck);
    }

    void removeBirds (Flemingo flemingo) {
        birdList.remove(flemingo);
    }

    void removeBirds (Ostrich ostrich) {
        birdList.remove(ostrich);
    }

}
