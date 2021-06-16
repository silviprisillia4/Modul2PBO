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
public class Horse extends Animal {
    
    public Horse() {
        
    }
    
    public Horse(String name, int age, String food, String gender, int alive) {
        super(name, age, food, gender, alive);
    }
    
    @Override
    public void printSound() {
        JOptionPane.showMessageDialog(null, "Ngik!");
    }
    
    @Override
    public void printData() {
        System.out.println("HORSE\t"+name+"+\t"+age+"\t"+food+"\t"+gender+"\t"+alive+"\n");
    }
    
}
