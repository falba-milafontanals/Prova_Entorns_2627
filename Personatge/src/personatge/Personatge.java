/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personatge;

/**
 *
 * @author oriol
 */
public class Personatge {
   
    
        //Atributs
        protected String nom;
        protected int vida;
        protected int atac;
        
        //Consturctor
        Personatge(String nom, int vida, int atac)
        {
          this.nom = nom;
          this.vida = vida;
          this.atac = atac;
        }
        
        //Setters
        public void setNom(String nom)
        {
            this.nom = nom;
        }
        public void setVida(int vida)
        {
            this.vida = vida;
        }        
        public void setAtac(int atac)
        {
            this.atac = atac;
        }        
        
        //Getters
        public String getNom(){return nom;}
        public int getVida(){return vida;}
        public int getAtac(){return atac;}
        
        //Funcions
        public void rebreAtac(int atac)
        {
             vida -=atac;
            if (vida<0){
                vida = 0;
            }
        }
        
        public void Atacar(Personatge p)
        {        
          p.rebreAtac(this.atac);
        }
    
        @Override
        public String toString()
        {
            return "El nom es: " + nom + " .La vida es: " + vida + " .Al atac es: " + atac;        }
}
