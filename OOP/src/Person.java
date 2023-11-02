public class Person {

    // Atribute
    private String name;
    private String adress;
    private String gender;

    public Person(String name, String adress, String gender) {
        this.name = name;
        this.adress = adress;
        this.gender = gender;
    }

    public void Greet() {
        System.out.println("Hello, My name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
