/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personatge;


public class Mags extends Personatge{

    //Atributs
    protected int atacMagic;
    protected int energiaMagica;
    
    //Constructor
    public Mags(String nom, int vida, int atac, int atacMagic, int energiaMagica)
    {
        super(nom, vida, atac);
        this.atacMagic = atacMagic;
        this.energiaMagica = energiaMagica;
    }    

    //Setters
     public void setAtacMagic(int atacMagic)
    {
        this.atacMagic = atacMagic;
    }
    public void setEnergiaMagica( int energiaMagica)
    {
        this.energiaMagica = energiaMagica;
    }
    
    //Getters
    public int getAtacMagic(){return atacMagic;}
    public int getEnergiaMagica(){return energiaMagica;}
    
    @Override
    public void Atacar(Personatge p)
    {
        
        if(energiaMagica>=10){
       int danyMagic = atac * 2;
        energiaMagica  -= 10;
         p.rebreAtac(danyMagic);
        }else{
        
        p.rebreAtac(atac);
    }
       } 
    
    @Override
    public String toString()
    {
        return super.toString() + " .Energia Magica es:" + energiaMagica;
    }
    
}
