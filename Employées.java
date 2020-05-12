
package gestion_ressources_humains;
import java.util.Date;

public class Employées {
    private int employée_id;
    private String Nom;
    private String prénom;
    private String Email;
    private String Tel;
    private String Adresse;
    private double Salaire_brut;
    private float date;
    private double num_compte;
    private String Echllon;
    private String diplome;
    private int Nbr_congé;//le nombre des jours de repos à pris
    private int Nbr_Absence;
    private Poste post;
    private departement departement; 
    
    // constructeur;

    public Employées(int employée_id, String Nom, String prénom, double Salaire_brut) {
        this.employée_id = employée_id;
        this.Nom = Nom;
        this.prénom = prénom;
        this.Salaire_brut = Salaire_brut;
        this.Nbr_congé=30;
        this.Nbr_Absence=0;
    }

    public Employées(int employée_id, String Nom) {
        this.employée_id = employée_id;
        this.Nom = Nom;
    }
    

    public Employées(int employée_id, int Nbr_Absence) {
        this.employée_id = employée_id;
        this.Nbr_Absence = Nbr_Absence;
    }
    
public void calculer (int i){
    Nbr_congé-=i;
}
 
    //getters et setters

    public int getEmployées_id() {
        return employée_id;
    }

    public Employées(int employée_id) {
        this.employée_id = employée_id;
    }
    

    public void setEmployées_id(int employées_id) {
        this.employée_id = employées_id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String Tel) {
        this.Tel = Tel;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public double getSalaire_brut() {
        return Salaire_brut;
    }

    public void setSalaire_brut(double Salaire_brut) {
        this.Salaire_brut = Salaire_brut;
    }

    public float getdate() {
        return date;
    }

    public void setdate(float date) {
        this.date = date;
    }

    public double getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(double num_compte) {
        this.num_compte = num_compte;
    }

    public String getEchllon() {
        return Echllon;
    }

    public void setEchllon(String Echllon) {
        this.Echllon = Echllon;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public int getNbr_congé() {
        return Nbr_congé;
    }

    public void setNbr_congé(int Nbr_congé) {
        this.Nbr_congé = Nbr_congé;
    }

    public int getNbr_Absence() {
        return Nbr_Absence;
    }

    public void setNbr_Absence(int Nbr_Absence) {
        this.Nbr_Absence = Nbr_Absence;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public Poste getPost() {
        return post;
    }

    public void setPost(Poste post) {
        this.post = post;
    }

    public departement getDepartement() {
        return departement;
    }

    public void setDepartement(departement departement) {
        this.departement = departement;
    }

  
    
    
    //methodes:
     public void calcule_duré(int k, String r){
        
            
             if(date<6)
             { if(k==1)//réussi le concours
               {
                 System.out.println("le nouveau échellon est:"+r);
                 this.setEchllon(r);
              
             
            }
             else if(date>=6)
               {
                System.out.println("le nouveau échellon est:"+r);
                 this.setEchllon(r);
                 
               }
             }
     }

    @Override
    public String toString() {
        return "Employ\u00e9e{" + "employ\u00e9e_id=" + employée_id + ", Nom=" + Nom + ", pr\u00e9nom=" + prénom + ", Tel=" + Tel + ", Salaire_brut=" + Salaire_brut + ", Echllon=" + Echllon + ", post=" + post + ", departement=" + departement + '}';
    }

   
    
    
}
