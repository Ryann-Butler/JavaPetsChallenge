public class Dog extends Pet {

    private String breed;

    public Dog(){
        super();
        this.breed = breed;

    }

    public Dog(String breed,int age, String name){
        super(name,age);
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(){
        this.breed = breed;
    }

    public String speak(){
        return "Woof! I am "  + this.getName() + " a " + this.getAge() + " year old " + this.getBreed();
    }


}
