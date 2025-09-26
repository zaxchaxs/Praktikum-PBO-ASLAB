
package animals;
import models.Animal;

public class Cat extends Animal {
    String name;
    
    public Cat(String name, int jumlahKaki, boolean isMamal) {
        super(jumlahKaki, isMamal);
        this.name = name;
    };
    
    @Override
    public void makeASound() {
        super.makeASound();
      System.out.println(name + " bersuara meow...");
    };
    
    // overload
    public void makeASound(String sound) {
        super.makeASound();
        System.out.println(name + " " + sound);
    }
}
