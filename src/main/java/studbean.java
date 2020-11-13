import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Named;

@Named("stud")
@RequestScoped
public class studbean {
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
