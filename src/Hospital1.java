public class Hospital1 {

    public static void main(String[] args) {
        Hospital hospital = new Hospital("General Hospital");

        Doctor d1 = new Doctor("Dr. Smith", "Cardiology");
        hospital.addDoctor(d1);

        Patient p1 = new Patient("Robert");
        hospital.addPatient(p1);

        Doctor d2 = new Doctor("Dr. Adipose", "Dermatology");
        hospital.addDoctor(d2);

        Patient p2 = new Patient("Alice");
        hospital.addPatient(p2);

        hospital.displayDoctors();
        hospital.displayPatients();
    }
}
class Hospital {
    private String nameH;
    private Doctor[] doctors;
    private Patient[] patients;

    public Hospital(String nameH) {
        this.nameH = nameH;
        this.doctors = new Doctor[Doctor.NO_DOCTORS];
        this.patients = new Patient[Patient.NO_PATIENTS];
    }



    public void addDoctor(Doctor doctor) {
        for (int i = 0; i < doctors.length; i++) {
            if (doctors[i] == null) {
                doctors[i] = doctor;
                break;
            }
        }
    }

    public void addPatient(Patient patient) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i] == null) {
                patients[i] = patient;
                break;
            }
        }
    }

    public void displayDoctors() {
        System.out.println("Doctors in " + nameH + ":");
        for (Doctor doctor : doctors) {
            if (doctor != null) {
                System.out.println(doctor.getNameD() + " - " + doctor.getSpeciality());
            }
        }
    }

    public void displayPatients() {
        System.out.println("Patients in " + nameH + ":");
        for (Patient patient : patients) {
            if (patient != null) {
                System.out.println(patient.getNameP());
            }
        }
    }
}

class Doctor {
    public static final int NO_DOCTORS = 10;
    private String nameD;
    private String speciality;

    public Doctor(String nameD, String speciality) {
        this.nameD = nameD;
        this.speciality = speciality;
    }

    public String getNameD() {
        return nameD;
    }

    public String getSpeciality() {
        return speciality;
    }
}

class Patient {
    public static final int NO_PATIENTS = 20;
    private String nameP;
    //private int age;

    public Patient(String nameP) {

        this.nameP = nameP;

    }

    public String getNameP() {
        return nameP;
    }
}
