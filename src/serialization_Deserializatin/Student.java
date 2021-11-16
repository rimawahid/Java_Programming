
package serialization_Deserializatin;

import java.io.Serializable;

public class Student implements Serializable{
    int id;
    String name;
    int roll;

    public Student(int id, String name, int roll) {
        this.id = id;
        this.name = name;
        this.roll = roll;
    }
    
}
