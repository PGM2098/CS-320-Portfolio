import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {


    @Test
    void testContactSuccess() {
        Contact contact = new Contact("1A", "John", "Doe", "1112223333", "123 1st Ave");

        assertNotNull(contact);
        assertTrue(contact.getId().equals("1A"));
        assertTrue(contact.getFirstName().equals("John"));
        assertTrue(contact.getLastName().equals("Doe"));
        assertTrue(contact.getNumber().equals("1112223333"));
        assertTrue(contact.getAddress().equals("123 1st Ave"));
    }

    @Test
    void testContactIdFail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("0123456789A", "John", "Doe", "1112223333", "123 1st Ave");
        });
    }

    @Test
    void testContactFirstNameFail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1A", null, "Doe", "1112223333", "123 1st Ave");
        });
    }

    @Test
    void testContactLastNameFail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1A", "John", null, "1112223333", "123 1st Ave");
        });
    }

    @Test
    void testContactAddressFail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1A", "John", "Doe", "1112223333", null);
        });
    }

    @Test
    void testContactNumberLongFail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1A", "John", "Doe", "11122233334", null);
        });
    }

    @Test
    void testContactNumberShortFail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1A", "John", "Doe", "111222333", null);
        });
    }

}

