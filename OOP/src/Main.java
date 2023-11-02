import database.db;

public class Main {
    public static void main(String[] args) {
        // Insiasi Object
        // Person person1 = new Person();
        Doctor doctor = new Doctor("Dr.Josia", "Jakarta", "male", "RSPAD", 5);
        Doctor doctor1 = new Doctor("Dr.Josi", "Jakarta", "male", "RSPAD", 6);
        Doctor doctor2 = new Doctor("Dr.Jos", "Jakarta", "male", "RSPAD", 7);
        Doctor doctor3 = new Doctor("Dr.Jo", "Jakarta", "male", "RSPAD", 8);
        // doctor.Greet();
        
        Hospital hospital = new Hospital();
        hospital.addDoctor(doctor);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addDoctor(doctor3);
        hospital.ShowAllDoctor();

        db

    }
}
