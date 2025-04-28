import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    void testaddContactSuccess(){
        ContactService service = new ContactService();
        service.addContact("0123", "John", "Doe", "1112223333", "123 1st Ave");
        assertNotNull(service.getContact("0123"));
    }


}