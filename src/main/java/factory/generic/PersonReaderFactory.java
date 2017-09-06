package factory.generic;

import factory.*;
import factory.enumexample.PersonReaderFileType;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PersonReaderFactory implements Factory<PersonReaderFileType, PersonFileReader> {

    private Map<PersonReaderFileType, Supplier<PersonFileReader>> map;

    public PersonReaderFactory() {

        map = new HashMap<>();

        map.put(PersonReaderFileType.TXT, () -> new TxtPersonFileReader());
//        lambda jak wyzej albo referencje do metody jak niżej
        map.put(PersonReaderFileType.JSON, JsonPersonFileReader::new);
        map.put(PersonReaderFileType.XML, () -> new XmlPersonFileReader());
    }

    @Override
    public PersonFileReader create(PersonReaderFileType key) {
//        if(map.containsKey(key)){
//            Supplier<PersonFileReader> supplier = map.get(key);
//            return supplier.get();
//        }
//        return null;
//        wyrazenie trojargumentowe: to samo co wyżej
        return map.containsKey(key) ? map.get(key).get() : null;
    }
}
