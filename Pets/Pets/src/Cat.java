public class Cat extends Pet{
    private String breed;

    public Cat(){
        super();
        this.breed = breed;

    }

    public Cat(String breed,int age, String name){
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
        return "Miaow! I am "  + this.getName() + " a " + this.getAge() + " year old " + this.getBreed();
    }

//Miaow! I am Pixel, a 4 year old tabby”
}
