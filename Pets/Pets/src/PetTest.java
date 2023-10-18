public class PetTest {
/* 1. In a new Java project called Pets, define a new class Pet with instance variables
name and age. Provide a suitable constructor and accessor/mutator methods for
the class TICK

2. Now, define two new classes Cat and Dog as subclasses of Pet. Each sub-class has
an addi@onal instance variable breed that can store the par@cular type of cat (e.g.
Persian, Tabby, etc.) or dog (e.g. Spaniel, terrier, etc.).

3 Each sub-class should contain a method called speak() that returns a typical
animal noise, plus a descrip@on of the animal such as
“Miaow! I am Pixel, a 4 year old tabby”, or
“Woof! I am Rex, a 9 year old terrier”.

4Provide a further class PetTest that implements a main() method to test your
new class hierarchy
 */

    public static void main (String[]args){

        Cat c1= new Cat("fluffy one",6,"kitty");
        System.out.println(c1.speak());

        Dog d2= new Dog("Husky", 5,"doggo");
        System.out.println(d2.speak());


    }

}
