
package gestion_ressources_humains;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;
public class promotion {
    private float date;
    private ArrayList<Employées> Employees;
    
    //constructeur

    public promotion(float date) {
        this.date= date;//la date cité l'hors du jour
        this.Employees = new ArrayList<>();
    }
    //getters and setters

    public float getdate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public ArrayList<Employées> getEmployees() {
        return Employees;
    }

    public void setEmployees(ArrayList<Employées> Employees) {
        this.Employees = Employees;
    }
    
 
    //affichage

    @Override
    public String toString() {
        return "promotion{" + "date=" + date + ", Employees=" + Employees + '}';
    }
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
