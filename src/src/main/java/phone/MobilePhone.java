package phone;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MobilePhone {

    private String number;
    private ArrayList<Contact> myContacts = new ArrayList<>();





    public boolean addNewContact(Contact contact){
        if(hasContact(contact)){
            log.info("Contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public void printListOfContacts(){
        System.out.println("Lista kontaktów");
        for(int i =0; i< myContacts.size();i++){
            System.out.println(this.myContacts.get(i).getName() + this.myContacts.get(i).getPhoneNumber());

        }
    }
    public boolean hasContact(Contact contact){
        return myContacts.indexOf(contact) >= 0;

    }

    public boolean removeContact(Contact contact){
        if(hasContact(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }


    public Contact findContact(String name){
        for(Contact c: myContacts){
            if(c.getName().equals(name)){
                return c;
            }

        }
        return null;
    }

    public boolean editContact(Contact oldContact, Contact newContact){
        if(hasContact(oldContact)){
            int indexOfOldContact = myContacts.indexOf(oldContact);
            myContacts.add(indexOfOldContact, newContact);
            return true;
        }
        log.info("Nie udalo się znaleśc podanego kontaktu. Nie dokonano aktualizacji");
        return false;
    }




}
