/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personatge;

/**
 *
 * @author oriol
 */
public class MagSuprem  extends Mags {
    
 //Constructor
    
    public MagSuprem(String nom, int vida, int atac, int atacMagic, int energiaMagica)
    {
    super(nom, vida, atac, atacMagic, energiaMagica);
    }
    
    @Override
    public void Atacar(Personatge p)
    {
        
    int danyMagic;    
     if(energiaMagica >= 10)
     {
        danyMagic = atac *3;
        p.rebreAtac(danyMagic);
    }else{
         p.rebreAtac(atac);
     }        
    
}}
    
