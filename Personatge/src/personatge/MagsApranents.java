/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personatge;
import java.util.Random;

public class MagsApranents extends Mags {
    
    //Atributs
    private Random random;
 
    //Constructor 
    public MagsApranents(String nom, int vida, int atac, int atacMagic, int energiaMagica, Random random)
    {
    super(nom, vida, atac, atacMagic, energiaMagica);
    this.random = random;
    }
    
    @Override
    public void Atacar(Personatge p)
    {
        boolean faMagic = random.nextBoolean();
        int danyMagic;
        
        if(faMagic && energiaMagica>=10){
        danyMagic = atac * 2;
        p.rebreAtac(danyMagic);
        System.out.println("El mag aprenent Ha Encertat");
        
        }else{
            p.rebreAtac(atac);
            System.out.println("El mag aprenent HA FALLAT");
        }
    }
        
    }