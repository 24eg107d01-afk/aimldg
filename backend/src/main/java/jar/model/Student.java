package jar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private String name;
    private String email;
    private String ip;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.name;
    }

    public String getIp() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setIp(String i) {
        this.ip = i;
    }

}
