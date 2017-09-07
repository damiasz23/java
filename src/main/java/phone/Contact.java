package phone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    private String phoneNumber;
    private String name;

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);

    }
}
