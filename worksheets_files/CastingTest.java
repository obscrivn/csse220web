package intro; /// change your package name


public class CastingTest {
    public static void main(String[] args) {

       	System.out.println("=== Basic Polymorphism ===");

        Pet a = new Dog();
        Pet b = new Cat();
        Dog c = new Dog();

        System.out.print("a.speak(): ");
        a.speak(); 

        System.out.print("\nb.speak(): ");
        b.speak(); 

        System.out.print("\nc.speak(): ");
        c.speak(); 

        System.out.print("\na.sound(): ");
        a.sound(); 

        System.out.print("\nb.sound(): ");
        b.sound(); 

        System.out.println("\n\n=== Casting Tests ===");

        //  Uncomment each line
      //  Pet p1 = new Dog();
      //  ((Dog) p1).sound(); 

     //   Pet p2 = new Pet(); 
       
        
      //  Pet p2 = new Dog();
       //  ((Cat) p2).sound();  

        // Dog d3 = new Pet();          // parent → child
        // Cat c1 = new Dog();          // siblings
        
        System.out.println("\n\nDone.");
    }
}

abstract class Pet {
    public void speak() {
        System.out.print("Pet ");
        sound();
    }

    public abstract void sound();
}

class Dog extends Pet {
    public void sound() {
        System.out.print("Woof ");
    }
}

class Cat extends Pet {
    public void sound() {
        System.out.print("Meow ");
    }
}

