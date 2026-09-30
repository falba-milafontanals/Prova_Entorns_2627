/* a mi me gusta tumadre
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personatge;

/**
 *
 * @author oriol
 */
public class Guerrers  extends Personatge{

    //Atributs
    protected int armadura;
    
    //Constructor
    
    Guerrers(String nom, int vida, int atac, int armadura)
    {
        super(nom, vida, atac);
        this.armadura = armadura;
    }        
    
    //Setters
    public void setArmadura(int armadura)
    {
        this.armadura = armadura;
    }
    
    //Getters
    public int getArmadura(){return armadura;}

    //Funcions
    @Override
    public void rebreAtac(int atac)
    {
       int atacReal = atac - armadura;
       vida -= atacReal;
       if(vida<0){
           vida = 0;
           
       }}





    
}
