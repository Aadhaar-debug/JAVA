package com.example.unmarshalling;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class JaxbUnmarshallingCarMain {
    public static void main(String[] args){
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = jaxbContext.newInstance(Car.class);
            File file = new File("E://Softwares//JavaPrograms//JAXB_Learning//car.xml");
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Car car = (Car) unmarshaller.unmarshal(file);
            System.out.println(car);
        }catch (JAXBException e){
            e.printStackTrace();
        }
    }
}
