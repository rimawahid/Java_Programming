package serialization_Deserializatin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

    String name;
    int id;

    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends Person{
    double salary;
    String address;

    public Employee(int id, String name, double salary, String address) {
        super(id, name);
        this.salary = salary;
        this.address = address;
    }
    
}

public class SerializeISA {
    public static void main(String[] args) {
        //Serialization
        try {
            //Creating the object
            Employee em= new Employee(101,"Amit",2000.12, "Dhaka");
           // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("D:\\IDB\\Module-03\\binaryIO\\Employee.txt");
            ObjectOutputStream Oout= new ObjectOutputStream(fout);
            Oout.writeObject(em);
            Oout.close();
            System.out.println("success..");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        //Deserialization
        try {
            FileInputStream fin = new FileInputStream("D:\\IDB\\Module-03\\binaryIO\\Employee.txt");
            ObjectInputStream oin= new ObjectInputStream(fin);
            Employee s = (Employee)oin.readObject();
            System.out.println("ID : "+s.id);
            System.out.println("Name : " +s.name);
            System.out.println("Salary : "+s.salary);
            System.out.println("Address : "+s.address);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
