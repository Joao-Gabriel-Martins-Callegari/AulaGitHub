import Animal.Cachorro;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cachorro dog = new Cachorro("Bob", 18, "Pintcher");
        
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getRace());
        dog.beber();
        dog.comer();
        dog.latir();
        

    }
}
