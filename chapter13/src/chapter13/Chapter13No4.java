package chapter13;

import java.util.*;

class Pet {

    private static String name;

    public String getName() {
        return name;
    }

    protected void setName(String newName) {
        name = newName;
    }

    public Pet(String petName) {
        name = petName;
    }

    String getWeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Dog extends Pet {

    private String weight;

    public String getWeight() {
        return weight;
    }

    protected void setWeight(String newWeight) {
        weight = newWeight;
    }

    public Dog(String petName, String dogWeight) {
        super(petName);
        weight = dogWeight;
    }
}

class Cat extends Pet {

    private String coatColor;

    protected String getColor() {
        return coatColor;
    }

    protected void setColor(String newColor) {
        coatColor = newColor;
    }

    public Cat(String petName, String coatColor) {
        super(petName);
        this.coatColor = coatColor;
    }
}

class PetTest {
//i made it static to make all method to be able to see it.

    static ArrayList<Pet> mainList = new ArrayList<Pet>();
    static Iterator<Pet> mainIter = mainList.iterator();
    static Scanner keyboard = new Scanner(System.in);
    static Pet cat2342 = new Cat("mirnav", "beyaz");

    public static void listDogs() {
        for (Pet pet : mainList) {
            if (pet instanceof Dog) {
                System.out.println("Dog Name: " + pet.getName() + " Dog Type: " + pet.getWeight());
            }
        }//end of for loop
    }//end of listDogs method

    public static void listCats() {
        for (Pet pet : mainList) {
            if (pet instanceof Cat) {
                System.out.println("Cat Name: " + pet.getName() + " Cat Type: " + ((Cat) pet).getColor());
            }
        }//end of for loop
    }//end of listCats method

    public static void addDog(String dogName, String dogWeight) {
        Pet dog = new Dog(dogName, dogWeight);
        mainList.add(dog);
    }//end of addDog method2

    public static void addCat(String catName, String furColor) {
        Pet cat = new Cat(catName, furColor);
        mainList.add(cat);
    }//end of addCat method

    public static void showMenu() {
        System.out.println("1. Add dog ");
        System.out.println("2. Add cat");
        System.out.println("3. List dogs");
        System.out.println("4. List cats");
        System.out.println("0. Quit");
        int action = keyboard.nextInt();
        Scanner parameter1 = new Scanner(System.in);
        Scanner parameter2 = new Scanner(System.in);
        while (action != 0) {
            switch (action) {
                case 1:
                    System.out.println("Type the name of dog: ");
                    String dogName = parameter1.next();
                    System.out.println("Enter Dog Type: ");
                    String dogWeight = parameter2.next();
                    addDog(dogName, dogWeight);
                    showMenu();
                case 2:
                    System.out.println("Type the name of cat: ");
                    String catName = parameter1.next();
                    System.out.println("Enter Cat Type: ");
                    String furColor = parameter2.next();
                    addCat(catName, furColor);
                    showMenu();
                case 3:
                    listDogs();
                    showMenu();
                case 4:
                    listCats();
                    showMenu();
                    break;
                case 0:
                    break;
            }//end of switch statement
        }//end of while loop
    }//end of showMenu method

    public static void main(String[] args) {
        showMenu();
    }//end of main method
}//end of the class
