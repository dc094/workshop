package com.bridgelabz.birdsanctuaryproblem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Bird Sanctuary !");
        Duck duck = new Duck();
        Flemingo flemingo = new Flemingo();
        Ostrich ostrich = new Ostrich();
        Parrot parrot = new Parrot();
        Penguine penguine = new Penguine();

        BirdRepository birdRepo = new BirdRepository();
        birdRepo.addBirds(duck);
        birdRepo.addBirds(flemingo);
        birdRepo.addBirds(ostrich);
        birdRepo.addBirds(parrot);
        birdRepo.addBirds(penguine);

        UserInterface userInterface = new UserInterface();
        System.out.println("--------Added Birds Printing----------");
        userInterface.print(birdRepo.getBirdList());

        birdRepo.removeBirds(duck);
        birdRepo.removeBirds(flemingo);
        birdRepo.removeBirds(ostrich);

        System.out.println("\n");
        System.out.println("------------Printing Birds After Removal------------");
        userInterface.print(birdRepo.getBirdList());
    }
}
