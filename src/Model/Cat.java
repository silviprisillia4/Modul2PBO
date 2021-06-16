/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import javax.swing.JOptionPane;

/**
 *
 * @author SILVI PRISILLIA
 */
public class Cat extends Animal {

    public Cat() {
        
    }
    
    public Cat(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }
    
    @Override
    public void printSound() {
        JOptionPane.showMessageDialog(null, "Meong!");
    }
    
    @Override
    public void printData() {
        System.out.println("CAT\t"+name+"+\t"+age+"\t"+food+"\t"+gender+"\t"+alive+"\n");
    }
}
