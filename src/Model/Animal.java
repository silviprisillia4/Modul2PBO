/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.ArrayList;

/**
 *
 * @author SILVI PRISILLIA
 */
public class Animal implements Controller.Interface {
    public String name;
    public int age;
    public String food;
    public String gender;
    public int alive;
    
    public Animal() {
        
    }
    
    public ArrayList<Animal> animalList = new ArrayList<>();
    
    public Animal(String name, int age, String food, String gender, int alive) {
        this.name = name;
        this.age = age;
        this.food = food;
        this.gender = gender;
        this.alive = alive;
    }
    
    public void printSound() {
        
    }
    
    public boolean isAlive(int alive) {
        boolean condition;
        if(alive==ALIVE){
            condition = true;
        } else {
            condition = false;
        }
        return condition;
    }
    
    public String printAnimalName() {
        String list = "";
        for (int i=0; i<animalList.size(); i++) {
            list += (i+1)+". "+animalList.get(i).name+"\n";
        }
        return list;
    }
    
    public void printData() {
        
    }
    
}
