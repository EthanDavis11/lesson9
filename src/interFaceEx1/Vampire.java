
package interFaceEx1;

public class Vampire implements Monster{
    
    private String name;
    
    Vampire(String n){
        name = n;
    }

    public void attack() {
        System.out.println("Vampire attack");
    }

    public void identify() {
        System.out.println("I am " + name + " the vampire.");
    }
    
    public void changeToBat(){
        System.out.println("Vampire is now a bat");
    }
    
}
