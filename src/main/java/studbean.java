import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Named;

@Named("stud")
@RequestScoped
public class studbean {

    private String version = "1.0-SNAPSHOT";
   

    public String getVersion() {
        return version;
    }
    @ManagedProperty(value = "#{manager.studentList}")
    private Student StudentList;

    public Student getStudentList()
    {
        return StudentList;

    }
    public void StudentList(Student Studentlist)
    {
        this.StudentList = Studentlist;
    }
}
