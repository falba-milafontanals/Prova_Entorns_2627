/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personatge;

/**
 *
 * @author oriol
 */
public class Main {
    public static void main(String[] args) {
        Guerrers g = new Guerrers("Cots",500,100,10);
        Mags g2 = new Mags("Oriol", 500, 100, 100, 100);
        MagsApranents g3 = new MagsApranents("Ramiro", 200, 100, 100,100);
        MagSuprem g4 = new MagSuprem("Albert", 200, 50, 50, 50);
        
        g2.Atacar(g);
        g3.Atacar(g4);
        g4.Atacar(g3);
        System.out.println(g);
        System.out.println(g2);
        
        
        
        
     }
  }
