import Animals.Animal;
import Animals.Dog;
import Animals.Monkey;

public class OverRiding {
   public static void main(String[] args) {
     Dog d1 = new Dog();
    Animal a1 = new Animal();
    Monkey m1 = new Monkey();
    d1.Eat();
    a1.Eat();
    m1.Eat();

   }
}
