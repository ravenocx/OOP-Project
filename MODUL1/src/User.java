// Github : https://github.com/ritsuhaaa

public class User {
    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    String name;
    int phoneNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void regiser() {
        System.out.println("\nRegister Success");
        // display name and phone number
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }
    


}
