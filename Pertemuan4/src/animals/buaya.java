/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animals;
import models.Animal;

public class buaya extends Animal {
    private String name;
    
    public buaya(String name, int jmlhKaki, boolean isMamal) {
        super(jmlhKaki, isMamal);
        this.name = name;
    }

    @Override
    public void makeASound() {
        System.out.println(name + " say: Kalo aku chat, ada yang marah ga");
    }
    
    
}
