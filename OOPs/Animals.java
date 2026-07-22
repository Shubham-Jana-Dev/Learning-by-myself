//
//  Animals.java
//  
//
//  Created by Shubham Jana on 21/07/26.
//
public class Animals{
    private String name;
    public Animals(String name){
        this.name = name;
    }
    public void say(){
        if(name.toUpperCase().equals("DOG")){
            System.out.println("Hi students I am a dog. And I say bhaw! bhaw!.");
        }
        if(name.toUpperCase().equals("CAT")){
            System.out.println("Hello students I am a cat. And I say Meaw! Meaw!.");
        }
    }
    public static void main(String[] args){
        String animalName = "Dog";
        Animals theAnimal = new Animals(animalName);
        theAnimal.say();
    }
}
