/*
Create a class Patient that contains instance variables
for patient id, first name, last name, address,
city, province, postal code. Provide also
multiple argument constructor to allow the
initialization instance variables.
Provide all getter and setter methods.
Provide also a default constructor.
Provide a getPatientInfo method to return
patient's data in a nicely formatted string.
*/

//Class created
public class Patient {

    //Instance variables
    String patientId;
    String firstName;
    String lastName;
    String address;
    String city;
    String province;
    String postalCode;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    //Argument Constructor
    public Patient(String patientId, String firstName, String lastName, String address, String city, String province, String postalCode){
        this.patientId = patientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
    }


    //getPatientInfo method that return patient's data
    public String getPatientInfo(){
        return "Patient Id: " + patientId + "\n" + "First Name: " + firstName + "\n" + "Last Name: " + lastName + "\n" + "Address: " + address + "\n" + "City: " + city + "\n" + "Province: " + province + "\n" + "Postal Code: " + postalCode + "\n";
    }

}
