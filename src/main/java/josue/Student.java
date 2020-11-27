package josue;

import javax.faces.annotation.ManagedProperty;
import javax.inject.Inject;

/**
 * Classe etudiant permettant de stocker tout les etudiants Dans une arraylist
 */
public class Student {

    @ManagedProperty(value = "#{manager}")
    @Inject

    /** identifiant d'un etudiant */
    public int id;

    /** le nom dun etudiant */
    public String lastName;

    /**  le prenom dun etudiant */
    public String firstName;

    /**  la date de naissance d'un etudiant */
    public String birthDate;

    /**  le numero de telephone dun etudiant */
    public String phoneNumber;

    /**
     * accesseur  de la propriete id 
     * 
     * @return
     */
    public int getId() {

        return this.id;
    }

    /**
     * mutateur permettant l'affectation de l'id de l'etudiant
     * 
     * @param id
     */
    public void setId(int id) 
    {
        this.id = id;
    }

    /**
     * accesseur permettant de recuperer le nom de l'etudiant
     * 
     * @return
     */
    public String getLastName() 
    {
        return this.lastName;
    }

    /**
     * mutateur permettant l'affectation du nom de l'etudiant
     * 
     * @param lastName
     */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    /**
     * accesseur permettant de recuperer le prenom de l'etudiant
     * 
     * @return
     */
    public String getFirstName() 
    {
        return this.firstName;
    }

    /**
     * mutateur permettant l'affectation du prenom de l'etudiant
     * 
     * @param
     */
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    /**
     * accesseur permettant de recuperer la date de naissance de l'etudiant
     * 
     * @return
     */
    public String getBirthDate() {

        return this.birthDate;
    }

    /**
     * mutateur permettant l'affectation de la date de naissance de l'etudiant
     * 
     * @param birthDate
     */
    public void setBirthDate(String birthDate) 
    {
        this.birthDate = birthDate;
    }

    /**
     * accesseur permettant de recuperer le numero de tel de l'etudiant
     * 
     * @return
     */
    public String getPhoneNumber() 
    {
        return this.phoneNumber;
    }

    /**
     * mutateur permettant l'affectation du numero de tel de l'etudiant
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    /**
     * constucteur de la classe student permettant de d'initialiser les attributs de
     * la classe student
     * 
     * identifiant d'un etudiant
     * @param id
     * nom d'un etudiant
     * @param lastName
     * prenom d'un etudiant
     * @param firstName
     * date de naissance  d'un etudiant
     * @param birthDate
     * telephone  d'un etudiant
     * @param phoneNumber
     */
    public Student(int id, String lastName, String firstName, String birthDate, String phoneNumber) {

        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;

    }

}