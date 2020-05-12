
package gestion_ressources_humains;
import java.util.ArrayList;
//import java.util.HashMap;

public class departement {
    
    private  int id_departement;
    private String Nom;
    private double budget;
    private float nbr_heure;
    private ArrayList<Employées> Employees;

    // constructeur;

    public departement(String Nom, double budget, float nbr_heure) {
        this.Nom = Nom;
        this.budget = budget;
        this.nbr_heure = nbr_heure;
         this.Employees = new ArrayList<>();
    }

    public departement() {
    }

    
    
    //getters and setters

    public int getId_departement() {
        return id_departement;
    }

    public void setId_departement(int id_departement) {
        this.id_departement = id_departement;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public float getNbr_heure() {
        return nbr_heure;
    }

    public void setNbr_heure(float nbr_heure) {
        this.nbr_heure = nbr_heure;
    }

    public ArrayList<Employées> getEmployees() {
        return Employees;
    }

    public void setEmployees(ArrayList<Employées> Employees) {
        this.Employees = Employees;
    }
    
    //méthodes
    //******Ajouter
    
    public void ajouter(Employées e){ 
        this.Employees.add( e);
    }
    //********Supprimer
    public void supprimer(int id ){
      for (int i = 0 ; i <Employees.size();i++){
          if(Employees.get(i).getEmployées_id()==id)
          { this.Employees.remove(id);
          }
          else
              System.out.println("l'employée n'existe pas");
              }  }
    //******modifier
    public Employées modifier(int id,Employées p){
      for(int i=0; i<Employees.size();i++)
      { if(Employees.get(i).getEmployées_id()==id)
          this.Employees.set(i, p);
          
      }
      
    return p;}

    @Override
    public String toString() {
        return "("   + Nom + ", " + budget +  ", Employees=" + Employees + ')';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}