public class Contact {
    public String id;
    private String firstName;
    private String lastName;
    private String number;
    private String address;


    public Contact(String id, String firstName, String lastName, String number, String address) {
        if(id == null || id.length()>10) {
            throw new IllegalArgumentException("Invalid id");
        }
        if(firstName == null || firstName.length()>10) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        if(lastName == null || lastName.length()>10) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        if(number == null || number.length()!=10) {
            throw new IllegalArgumentException("Invalid number");
        }
        if(address == null || address.length()>30) {
            throw new IllegalArgumentException("Invalid address");
        }

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.length()>10) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.length()>10) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        this.lastName = lastName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(number == null || number.length()!=10) {
            throw new IllegalArgumentException("Invalid number");
        }
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address == null || address.length()>30) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
