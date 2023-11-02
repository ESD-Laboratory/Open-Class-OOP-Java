import java.util.ArrayList;

public class Hospital {
    private ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    // public Hospital(ArrayList<Doctor> doctors) {
    //     this.doctors = doctors;
    // }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void ShowAllDoctor() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor.getName());
        }
    }
}
