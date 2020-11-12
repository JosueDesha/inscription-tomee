import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named("manager")
public class ManagerBean {

    private String version = "1.0-SNAPSHOT";
   

    public String getVersion() {
        return version;
    }
    public int id;
    public String lastName;
    public String firstName;
    public String birthDate;
    public String phoneNumber;

    public ArrayList<student> getStudentList() 
    {
        ArrayList<student> studentList = new ArrayList<student>(
                Arrays.asList(new student(1, "desha", "josue", "12/09/2003", "0696123456"),
                        new student(2, "JHONSON", "Derick", "12/09/2000", "0696123456")));

        return studentList;
    }
}