package josue;
public class Promotion {

    public int annee;
    public int idEtu;
    public int idForm;
    
    
    public int getAnnee(){
        return annee;
    }
    
    public int getIdEtu(){
        return idEtu;
    }
    
    public int getIdForm(){
        return idForm;
    }
    
    
    public Promotion(int annee, int idEtu, int idForm){
    
        this.annee = annee;
        this.idEtu = idEtu;
        this.idForm = idForm;
    }
        
    }