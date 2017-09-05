package factory.simplefactory;


import factory.JsonPersonFileReader;
import factory.PersonFileReader;
import factory.TxtPersonFileReader;
import factory.XmlPersonFileReader;

import java.util.List;

public class SimplePersonReaderFactory {

    public PersonFileReader createReader(String path){
        if(path.endsWith(".txt")){
            return new TxtPersonFileReader();
        }
        else if(path.endsWith(".json")){
            return new JsonPersonFileReader();
        }
        else if(path.endsWith(".xml")){
            return new XmlPersonFileReader();
        }
        return null;
    }
}
