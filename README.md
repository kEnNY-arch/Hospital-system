Hospital Management System
Description
The Hospital Management System is a Java-based application that simulates the management of a hospital, including the admission of patients, management of doctors, receptionists, security personnel, and nurses.
Classes, Attributes, and Methods
Personnel (Abstract Class)
•	Attributes: name, age
•	Methods: displayInformation() (Abstract)
Patient (Extends Personnel)
•	Attributes: illness, bill
•	Methods: displayInformation()
Receptionist (Extends Personnel)
•	Attributes: role
•	Methods: displayInformation()
SecurityPersonnel (Extends Personnel)
•	Attributes: role
•	Methods: displayInformation()
Nurse (Extends Personnel)
•	Attributes: specialization
•	Methods: displayInformation()
PeopleGroup
•	Attributes: peopleList
•	Methods: addPerson(Personnel person), listPeople()
Hospital (Extends PeopleGroup)
•	Methods: admitPatient(Patient patient), listPatients(), updateBill(Patient patient, double amount)
Doctor (Extends Personnel)
•	Attributes: specialization
•	Methods: displayInformation()
Clinic (Extends PeopleGroup)
SecurityCompany (Extends PeopleGroup)
OOP Concepts Utilized
•	Inheritance: The various personnel classes (Patient, Receptionist, SecurityPersonnel, Nurse, Doctor, Clinic, SecurityCompany, Hospital) inherit common attributes and methods from the abstract class Personnel and PeopleGroup.
•	Polymorphism: The displayInformation() method is overridden in each concrete class to provide specific implementations.
•	Encapsulation: The attributes of each class are encapsulated within their respective classes, and access is controlled through methods.
Group Members and Roles
•	Team Lead: Kennedy Odhiambo
•	Java Developer: Edward Kibet
•	Slides Develoment: Abdulsamad Osman
•	Testing  : Stacy Ng’ang’a

