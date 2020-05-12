
package gestion_ressources_humains;
import java.util.ArrayList;
import java.util.Iterator;
public class congé {
     private int nbr_jours;
    private ArrayList<Employées> Employees;
       

     //constructeur
    public congé(){
        
    }

    public congé(int nbr_jours) {
        this.nbr_jours = nbr_jours;
        this.Employees= new ArrayList<>();
        
    }
     //getters and setters

    public int getNbr_jours() {
        return nbr_jours;
    }

    public void setNbr_jours(int nbr_jours) {
        this.nbr_jours = nbr_jours;
    }

    public ArrayList<Employées> getEmployees() {
        return Employees;
    }

    public void setEmployees(ArrayList<Employées> Employees) {
        this.Employees = Employees;
    }
    //méthodes
    
    public void calculeNbr_Jours(int nbr_d,int id){
        for (int i=0; i<Employees.size(); i++)
        {
            if (Employees.get(i).getEmployées_id()== id)
                this.Employees.get(i).setNbr_congé(Employees.get(i).getNbr_congé()-nbr_d);
            
        }
        
        
    }
    
}
