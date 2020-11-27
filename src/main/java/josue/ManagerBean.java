package josue;
import java.util.ArrayList;
import java.util.Arrays;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/** */
@Named("manager")
@RequestScoped
public class ManagerBean {

    private String version = "1.0-SNAPSHOT";
   

    public String getVersion() {
        return version;
    }
    //public int id;
    //public String lastName;
    //public String firstName;
    //public String birthDate;
    //public String phoneNumber;

    public ArrayList<Student> getStudentList() 
    {
    
        ArrayList<Student> studentList = new ArrayList<>(
                Arrays.asList(new Student(1, "desha", "josue", "12/09/2003", "0696123456"),
                        new Student(2, "JHONSON", "Derick", "12/09/2000", "0696123456")));

        return studentList;
    }public ArrayList<Formation> getFormationList() 
    {
        ArrayList<Formation> formationList = new ArrayList<>(
                Arrays.asList(new Formation(3,"lettre",2),
                        new Formation(5,"batiment",1 )));

        return formationList;
    }


    public ArrayList<Promotion> getPromotionList() 
    {
        ArrayList<Promotion> promotionList = new ArrayList<>(
                Arrays.asList(new Promotion(2013,0,3),
                        new Promotion(2019,2,5)));

        return promotionList;
    }
    
}

