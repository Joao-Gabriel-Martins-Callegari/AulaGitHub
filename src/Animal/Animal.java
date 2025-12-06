package Animal;

public class Animal {
    
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void comer(){
        System.out.printf("O %s comeu lasanha\n",this.name);
    }

    public void beber(){
        System.out.printf("O %s bebeu água\n",this.name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
}
