import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private final String personalId;
    
    public String getName() {
        return name;
    }
    
    public String getPersonalId() {
        return personalId;
    }
    
    public Person(String name, String personalId) {
        this.name = name;
        this.personalId = personalId;
    }
}
