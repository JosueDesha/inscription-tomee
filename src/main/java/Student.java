import javax.annotation.PostConstruct;
import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;

public class Student 
    {@Inject
        @ManagedProperty(value="#{manager}")
        public int id;
        
        public String lastName;
        public String firstName;
        public String birthDate;
        public String phoneNumber;
    
        public int getId() {
            return this.id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getLastName() {
            return this.lastName;
        }
        
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public String getFirstName() {
            return this.firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getBirthDate() {
            return this.birthDate;
        }
    
        public void setBirthDate(String birthDate) {
            this.birthDate = birthDate;
        }
    
        public String getPhoneNumber() {
            return this.phoneNumber;
        }
    
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    
         public Student(int id, String lastName, String firstName, String birthDate, String phoneNumber) {
    
          this.id =id;
            this.lastName=lastName;
            this.firstName=firstName;
            this.birthDate=birthDate;
            this.phoneNumber=phoneNumber;
    
            
        }
    
}