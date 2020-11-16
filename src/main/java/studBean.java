import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Named;

@Named("stud")
@RequestScoped
public class studBean {

    private String version = "1.0-SNAPSHOT";
   

    public String getVersion() {
        return version;
    }
    @ManagedProperty(value="#{manager}")
    private Student StudentList;
    private ManagerBean managerBean;

    public Student getStudentList()
    {
        return StudentList;

    }
    public void StudentList(Student Studentlist)
    {
        this.StudentList = Studentlist;
    }
    public void ManagerBean(ManagerBean ManagerBean) {
        this.managerBean = ManagerBean;
    }
    public ManagerBean getManagerBean()
        {
            return managerBean;

        }
    
}