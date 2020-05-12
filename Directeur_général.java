/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_ressources_humains;

import java.util.Iterator;


public class Directeur_général extends Poste{

    public Directeur_général(int num_poste, String Nom, float nbr_heure) {
        super(num_poste, Nom, nbr_heure);
    }
       //méthodes
 //******Ajouter
    
    public void ajouter4(Employées e){ 
        this.Employees.add(e);
    }
    //********Supprimer
    public void supprimer4(int id ){
      for (int i = 0 ; i <Employees.size();i++){
          if(Employees.get(i).getEmployées_id()==id)
          { this.Employees.remove(id);
          }
          else
              System.out.println("l'employée n'existe pas");
              }  }
    //******modifier
    public Employées modifier4(int id,Employées p){
      for(int i=0; i<Employees.size();i++)
      { if(Employees.get(i).getEmployées_id()==i)
          this.Employees.set(i, p);
          
      }
      
    return p;}
//*****Calculerprime
 public void CalculerPrime4( int Nbr){
     // A la fin de chaque mois on calculera les primes convients
      for(int i =0; i<Employees.size();i++){
        if(Employees.get(i).getNbr_Absence()<5){
 this.Employees.get(i).setSalaire_brut(Employees.get(i).getSalaire_brut()+Employees.get(i).getSalaire_brut()*0.1);
 } 
        else  if(Employees.get(i).getNbr_Absence()>3 && Employees.get(i).getNbr_Absence()<5 ){
 this.Employees.get(i).setSalaire_brut(Employees.get(i).getSalaire_brut()+Employees.get(i).getSalaire_brut()*0.2);
 } else if(Employees.get(i).getNbr_Absence()<3){
 this.Employees.get(i).setSalaire_brut(Employees.get(i).getSalaire_brut()+Employees.get(i).getSalaire_brut()*0.3);
} else System.out.println("l'employé est privé du prime");
      
      } 
 }
    //******bulettin des salaires
  public void Afficherbulletin4(){
    Iterator<Employées> iter=this.Employees.iterator();
    while(iter.hasNext())
    { iter.next().toString();
    }
  }
    
}
