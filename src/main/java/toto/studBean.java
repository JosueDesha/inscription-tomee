package toto;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Named;
import javax.inject.Inject;

@Named("stud")
@RequestScoped
public class studBean {

    private String version = "2.0-SNAPSHOT";

    public String getVersion() {
        return version;
    }

    @Inject
    @ManagedProperty("#{param.id}")

    private int id;
    private String name;
    private String surname;
    private String telephone;
    private String datenaiss;

    @Inject
    ManagerBean manager;

    @PostConstruct
    void DetailEtu() {

        for (Student student : manager.getStudentList()) {
            if (student.id == id) {

                name = student.lastName;
                surname = student.firstName;
                telephone = student.phoneNumber;
                datenaiss = student.birthDate;
            }
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getDatenaiss() {
        return datenaiss;
    }

}
