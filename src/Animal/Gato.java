package Animal;

public class Gato extends Animal{
    //Peso
    private double weight;

    public Gato(String name, int age, double weight){
        super(name, age);
        this.weight = weight;
    }

    public void miar(){
        System.out.printf("O %s fez MIAAAAAAUUUUUUUUU!!!!!",getName());
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
