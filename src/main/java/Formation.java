public class Formation {
    
    public int id;
    public String nom;
    public int duree;
    
    public int getId(){
        return id;
    }
    
    public String getNom(){
        return nom;
    }
    
    public float getDuree(){
        return duree;
    }
    
    
    public Formation(int id, String nom, int duree){
    
        this.id= id;
        this.nom= nom;
        this.duree= duree;
    
    }
    
    }
