package com.dpackage.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "emp")
public class Emp implements Serializable{

    private static final long serialVersionUID = -1L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "leave")
    private String leave;

    protected Emp() {}

    public Emp(String name, String leave) {
        this.name = name;
        this.leave = leave;
    }

    @Override
    public String toString() {
        return String.format(
                "Emp[id=%d, name='%s', leave='%s']",
                id, name, leave);
    }
}
