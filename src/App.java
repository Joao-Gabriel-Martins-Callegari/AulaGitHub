import Animal.Cachorro;
import Animal.Gato;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cachorro dog = new Cachorro("Bob", 18, "Pintcher");
        
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getRace());
        dog.beber();
        dog.comer();
        dog.latir();
        
        Gato cat = new Gato("Garfield", 40, 90.54);

        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getWeight());
        cat.beber();
        cat.comer();
        cat.miar();

    }
}
