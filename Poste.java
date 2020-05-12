/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_ressources_humains;

import java.util.ArrayList;
import java.util.Iterator;

public class Poste {
    
    protected int num_poste;
    protected String Nom;
    protected float nbr_heure;
    protected ArrayList<Employées> Employees;
    
// constructeur
    public Poste(int num_poste, String Nom, float nbr_heure) {
        this.num_poste = num_poste;
        this.Nom = Nom;
        this.nbr_heure = nbr_heure;
        this.Employees= new ArrayList<>();
    }

    //getters and setters
    public int getNum_poste() {
        return num_poste;
    }

    public void setNum_poste(int num_poste) {
        this.num_poste = num_poste;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
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
    
    public void ajouterp(Employées e){ 
        this.Employees.add( e);
    }
    //********Supprimer
    public void supprimerp(int id ){
      for (int i = 0 ; i <Employees.size();i++){
          if(Employees.get(i).getEmployées_id()==id)
          { this.Employees.remove(id);
          }
          else
              System.out.println("l'employée n'existe pas");
              }  }
    //******modifier
    public Employées modifierp(int id,Employées p){
      for(int i=0; i<Employees.size();i++)
      { if(Employees.get(i).getEmployées_id()==i)
          this.Employees.set(i, p);
          
      }
      
    return p;}
//*****Calculerprime
 public void CalculerPrime( int id,int nbr){
     // A la fin de chaque mois on calculera les primes convients
      for(int i =0; i<Employees.size();i++){
          if(Employees.get(i).getEmployées_id()==id){//modification a été faite 
        if(Employees.get(i).getNbr_Absence()<5){
 this.Employees.get(i).setSalaire_brut(Employees.get(i).getSalaire_brut()+Employees.get(i).getSalaire_brut()*0.1);
 } 
        else  if(Employees.get(i).getNbr_Absence()>3 && Employees.get(i).getNbr_Absence()<5 ){
 this.Employees.get(i).setSalaire_brut(Employees.get(i).getSalaire_brut()+Employees.get(i).getSalaire_brut()*0.2);
 } else if(Employees.get(i).getNbr_Absence()<3){
 this.Employees.get(i).setSalaire_brut(Employees.get(i).getSalaire_brut()+Employees.get(i).getSalaire_brut()*0.3);
} else System.out.println("l'employé est privé du prime");
      
      } 
      }}
    //******bulettin des salaires
  public void Afficherbulletin(){
    Iterator<Employées> iter=this.Employees.iterator();
    while(iter.hasNext())
    { iter.next().toString();
    }
  }
    
  //*****affichage des postes

    @Override
    public String toString() {
        return "Poste{" + "num_poste=" + num_poste + ", Nom=" + Nom  + ", Employees=" + Employees + '}';
    }

  
}
