/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.JOptionPane;
import Model.*;

/**
 *
 * @author SILVI PRISILLIA
 */
public class MainScreen {
    
    Animal animal = new Animal();
    
    public MainScreen() {
        showMenu();
    }
    
    private void showMenu() {
        JOptionPane.showMessageDialog(null, "Welcome to animal world!");
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Choose & Input Animal Data\n2. Play Sound of Your Animal\n3. Check Animal Condition (Alive/Not)\n4. Print Animal Data"));
            switch(menu){
                case 1 :
                    int type = chooseAnimal();
                    inputAnimalData(type);
                    break;
                case 2 :
                    int name = chooseAnimalName();
                    playAnimalSound(name);
                    break;
                case 3 :
                    name = chooseAnimalName();
                    checkAnimalCondition(name);
                    break;
                case 4 :
                    printAnimalData();
                    break;
            }
        } while(menu!=5);
    }
    
    private int chooseAnimal() {
        int type;
        do {
            type = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose your animal :\n1. Cat\n2. Dog\n3. Duck\n4. Horse"));
        } while(type<1 || type>4);
        return type;
    }
    
    private void inputAnimalData(int type) {
        String name = JOptionPane.showInputDialog(null, "Name :");
        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Age :"));
        String food = JOptionPane.showInputDialog(null, "Food :");
        int inputGender = Integer.parseInt(JOptionPane.showInputDialog(null, "Gender :\n1. Male\n2. Female"));
        int inputAlive = Integer.parseInt(JOptionPane.showInputDialog(null, "Is your animal alive?\n1. Yes\n2. No"));
        
        String gender;
        int alive;
        
        if(inputGender==1){
            gender = "Male";
        } else {
            gender = "Female";
        }
        
        if(inputAlive==1){
            alive = 1;
        } else {
            alive = 0;
        }

        switch(type){
            case 1 :
                Cat cat = new Cat(name, age, food, gender, alive);
                animal.animalList.add(cat);
                break;
            case 2 :
                Dog dog = new Dog(name, age, food, gender, alive);
                animal.animalList.add(dog);
                break;
            case 3 :
                Duck duck = new Duck(name, age, food, gender, alive);
                animal.animalList.add(duck);
                break;
            case 4 :
                Horse horse = new Horse(name, age, food, gender, alive);
                animal.animalList.add(horse);
                break;
        }   
    }
    
    private int chooseAnimalName() {
        String list = "";
        list = animal.printAnimalName();
        int name = Integer.parseInt(JOptionPane.showInputDialog(null, list));
        return name;
    }
    
    private void playAnimalSound(int name) {
        animal.animalList.get(name-1).printSound();
    }
    
    private void checkAnimalCondition(int name) {
        String alive = "";
        boolean condition = animal.isAlive(animal.animalList.get(name-1).alive);
        if(condition){
            alive = "alive";
        } else {
            alive = "dead";
        }
        JOptionPane.showMessageDialog(null, "Your animal is "+alive);
    }
    
    private void printAnimalData() {
        for (int i=0; i<animal.animalList.size(); i++) {
            animal.animalList.get(i).printData();
            JOptionPane.showMessageDialog(null, "Please check the data in the output window!");
        }
    }
}
