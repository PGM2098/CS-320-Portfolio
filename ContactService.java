import java.util.ArrayList;
public class ContactService {

    ArrayList<Contact> contactList = new ArrayList<Contact>();

    //Unique Id Check
    public void addContact(String id, String firstName, String lastName, String number, String address) {
        Contact tempContact = new Contact(id, firstName, lastName, number, address);
        for (int cycle = 0; cycle < contactList.size(); cycle++) {
            if (contactList.get(cycle).getId().contentEquals(id)) {
                System.out.println("Duplicate Contact Id");
                break;
            }
            if (cycle == contactList.size() - 1) {
                contactList.add(tempContact);
            }
            return;
        }
    }

    public Contact getContact(String contactID){
        Contact contact = new Contact(null, null, null, null, null);
        for (int cycle = 0; cycle < contactList.size(); cycle++) {
            if (contactList.get(cycle).getId().contentEquals(contactID)){
                contact = contactList.get(cycle);
            }
        }
        return contact;
    }

    public void deleteContact(String contactID){
        for (int cycle = 0; cycle < contactList.size(); cycle++) {
            if (contactList.get(cycle).getId().contentEquals(contactID)){
                 contactList.remove(cycle);
                 break;
            }
            if (cycle == contactList.size() - 1){
                System.out.println("Contact Id not Found");
            }
        }
    }

    public void updateFirstName(String newName, String contactID){
        for (int cycle = 0; cycle < contactList.size(); cycle++) {
            if (contactList.get(cycle).getId().contentEquals(contactID)){
                contactList.get(cycle).setFirstName(newName);
                break;
            }
            if (cycle == contactList.size() - 1){
                System.out.println("Contact Id not Found");
            }
        }
    }

    public void updateLastName(String newName, String contactID){
        for (int cycle = 0; cycle < contactList.size(); cycle++) {
            if (contactList.get(cycle).getId().contentEquals(contactID)){
                contactList.get(cycle).setLastName(newName);
                break;
            }
            if (cycle == contactList.size() - 1){
                System.out.println("Contact Id not Found");
            }
        }
    }

    public void updateNumber(String newNumber, String contactID){
        for (int cycle = 0; cycle < contactList.size(); cycle++) {
            if (contactList.get(cycle).getId().contentEquals(contactID)){
                contactList.get(cycle).setNumber(newNumber);;
                break;
            }
            if (cycle == contactList.size() - 1){
                System.out.println("Contact Id not Found");
            }
        }
    }

    public void updateAddress(String newAddress, String contactID){
        for (int cycle = 0; cycle < contactList.size(); cycle++) {
            if (contactList.get(cycle).getId().contentEquals(contactID)){
                contactList.get(cycle).setAddress(newAddress);
                break;
            }
            if (cycle == contactList.size() - 1){
                System.out.println("Contact Id not Found");
            }
        }
    }
}

