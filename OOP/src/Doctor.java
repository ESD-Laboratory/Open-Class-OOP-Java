public class Doctor extends Person {
    
    private String unit;
    private int yearOfService;

    public Doctor(String name, String adress, String gender, String unit, int yearOfService) {
        super(name, adress, gender);
        this.unit = unit;
        this.yearOfService = yearOfService;
    }

    @Override
    public void Greet() {
        // TODO Auto-generated method stub
        // super.Greet();
        System.out.println("Hello Im a Doctor, My Name is " + this.getName());
    }
    
    

}
