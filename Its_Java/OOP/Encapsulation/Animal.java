package OOP.Encapsulation;

public class Animal {
    protected String animalType;
    protected int animalAge;
    protected String animalJob;

    public void setType(String animalType){
        this.animalType = animalType;
    }
    public String getType(){
        return this.animalType;
    }

    public void setAge(int animalAge){
        this.animalAge = animalAge;
    }
    public int getAge(){
        return this.animalAge;
    }

    public void setJob(String animalJob){
        this.animalJob = animalJob;
    }
    public String getJob(){
        return this.animalJob;
    }

     public static void main(String[] args){
        Animal didi = new Animal();
        didi.setAge(22);
        didi.setType("Elder Sister");
        didi.setJob("Teaching");
        System.out.println("Animal type: "+didi.getType());
        System.out.println("Animal Age: "+didi.getAge());
        System.out.println("Animal's Job:"+ didi.getJob());
    }

}

