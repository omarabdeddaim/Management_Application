/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_ressources_humains;
import javax.swing.JOptionPane;

public class Gestion_Ressources_Humains {

    
    public static void main(String[] args) {
        Employées e1=new Employées(0,"omar","ahmed",2000);
        Employées e2=new Employées(1,"khald","aanas",5000);
        Employées e3=new Employées(2,"ali","yousseef",6000);
        Employées e4=new Employées(3,"mohammed","yousseef",6000);
        departement production=new departement();
        production.ajouter( e3);
        production.ajouter( e2);
        production.ajouter( e1);
        e1.getDepartement();
        
        production.ajouter( e4);
        System.out.println("les employees qui qppqrtient"+production.toString());
       // production.supprimer(0);
         production.modifier(2, e4);
       System.out.println("les employees qui qppqrtient"+production.toString());
    }
    
}
