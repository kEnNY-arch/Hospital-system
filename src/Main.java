import java.util.ArrayList;

// Abstract class representing  personnel
abstract class Personnel {
    String name;
    int age;

    // Constructor for initializing name and age
    public Personnel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to be implemented by subclasses for displaying information
    public abstract void displayInformation();
}

// Subclass representing a patient, extends Personnel
class Patient extends Personnel {
    String illness;
    double bill;

    // Constructor for initializing name, age, and illness
    public Patient(String name, int age, String illness) {
        super(name, age);
        this.illness = illness;
        this.bill = 0.0; // Initializing bill to zero
    }

    // Getter for the bill amount
    public double getBill() {
        return bill;
    }

    // Setter for updating the bill amount
    public void setBill(double bill) {
        this.bill = bill;
    }

    // Implementation of the abstract method to display patient information
    @Override
    public void displayInformation() {
        System.out.println("Patient - Name: " + name + ", Age: " + age + ", Illness: " + illness + ", Bill: " + bill);
    }
}

// Subclass representing a receptionist, extends Personnel
class Receptionist extends Personnel {
    String role;

    // Constructor for initializing name, age, and role
    public Receptionist(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    // Implementation of the abstract method to display receptionist information
    @Override
    public void displayInformation() {
        System.out.println("Receptionist - Name: " + name + ", Age: " + age + ", Role: " + role);
    }
}

// Subclass representing security personnel, extends Personnel
class SecurityPersonnel extends Personnel {
    String role;

    // Constructor for initializing name, age, and role
    public SecurityPersonnel(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    // Implementation of the abstract method to display security personnel information
    @Override
    public void displayInformation() {
        System.out.println("Security Personnel - Name: " + name + ", Age: " + age + ", Role: " + role);
    }
}

// Subclass representing a nurse, extends Personnel
class Nurse extends Personnel {
    String specialization;

    // Constructor for initializing name, age, and specialization
    public Nurse(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    // Implementation of the abstract method to display nurse information
    @Override
    public void displayInformation() {
        System.out.println("Nurse - Name: " + name + ", Age: " + age + ", Specialization: " + specialization);
    }
}

// Class representing a group of people (generic Personnel objects)
class PeopleGroup {
    ArrayList<Personnel> peopleList = new ArrayList<>();

    // Method to add a person to the group
    public void addPerson(Personnel person) {
        peopleList.add(person);
    }

    // Method to display information of all people in the group
    public void listPeople() {
        for (Personnel person : peopleList) {
            person.displayInformation();
        }
    }
}

// Class representing a hospital, extends PeopleGroup
class Hospital extends PeopleGroup {
    // Method to admit a patient to the hospital
    public void admitPatient(Patient patient) {
        addPerson(patient);
    }

    // Method to update the bill for a patient
    public void updateBill(Patient patient, double amount) {
        double currentBill = patient.getBill();
        patient.setBill(currentBill + amount);
    }
}

// Subclass representing a doctor, extends Personnel
class Doctor extends Personnel {
    String specialization;

    // Constructor for initializing name, age, and specialization
    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    // Implementation of the abstract method to display doctor information
    @Override
    public void displayInformation() {
        System.out.println("Doctor - Name: " + name + ", Age: " + age + ", Specialization: " + specialization);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating a group for all people
        PeopleGroup allPeople = new PeopleGroup();

        // Creating a hospital
        Hospital hospital = new Hospital();
        // Creating patients
        Patient patient1 = new Patient("Patient_Kibet", 30, "Flu");
        Patient patient2 = new Patient("Patient_Stacy", 25, "Cold");
        // Admitting patients to the hospital
        hospital.admitPatient(patient1);
        hospital.admitPatient(patient2);
        // Updating bills for patients
        hospital.updateBill(patient1, 5000000.0);
        hospital.updateBill(patient2, 3000000.0);

        // Creating doctors
        Doctor doctor1 = new Doctor("Dr_Kibet", 40, "Cardiologist");
        Doctor doctor2 = new Doctor("Dr_Stacy", 35, "Orthopedic Surgeon");

        // Creating receptionists
        Receptionist receptionist1 = new Receptionist("Receptionist_Abdul", 28, "Front Desk");
        Receptionist receptionist2 = new Receptionist("Receptionist_Ken", 32, "Admissions");

        // Creating security personnel
        SecurityPersonnel securityPersonnel1 = new SecurityPersonnel("Guard_Kibet", 35, "Security Guard");
        SecurityPersonnel securityPersonnel2 = new SecurityPersonnel("Officer_Ken", 28, "Security Officer");

        // Creating nurses
        Nurse nurse1 = new Nurse("Nurse_Abdul", 30, "Pediatric Nurse");
        Nurse nurse2 = new Nurse("Nurse_Stacy", 32, "ICU Nurse");

        // Adding people to the allPeople group
        allPeople.addPerson(patient1);
        allPeople.addPerson(patient2);
        allPeople.addPerson(doctor1);
        allPeople.addPerson(doctor2);
        allPeople.addPerson(receptionist1);
        allPeople.addPerson(receptionist2);
        allPeople.addPerson(securityPersonnel1);
        allPeople.addPerson(securityPersonnel2);
        allPeople.addPerson(nurse1);
        allPeople.addPerson(nurse2);

        // Displaying information of all people in the group
        System.out.println("List of All People:");
        allPeople.listPeople();
    }
}
