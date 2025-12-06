package Animal;

public class Cachorro extends Animal{

    private String race;

    public Cachorro(String name, int age, String race){
        super(name, age);
        this.race = race;
    }

    public void latir(){
        System.out.printf("O %s fez AU AU AU AU!!!!\n",getName());
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
}
