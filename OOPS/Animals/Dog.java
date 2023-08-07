package Animals;
public class Dog extends Animal{
    public void Sound(){
        System.out.println("Barking");
    }
    @Override
    public void Eat(){
        System.out.println("Dog is eating pedigree");
    }
}