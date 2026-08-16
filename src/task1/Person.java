package task1;

public class Person {
    private String name = "Your Name";
    private String surname = "Your Surname";
    private int age;
    private String adress = "Your Address";
    public Person() {

    }
    public  Person(String name, String surname, int age, String adress) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String surname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAdress() {
        return adress;

    }

    public void getAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void resume(){
        System.out.println("-".repeat(12)+"Resume"+"-".repeat(12));
        System.out.println("Name:"+"\t".repeat(5)+this.name);
        System.out.println("Surname:"+"\t".repeat(4)+this.surname);
        System.out.println("Age:"+"\t".repeat(5)+this.age);
        System.out.println("Adress:"+"\t".repeat(5)+this.adress);

    }

}
