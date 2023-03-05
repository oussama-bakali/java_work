/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Gameclasses;

import java.util.Timer;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import javafx.event.EventHandler;
/**
 *
 * @author hilen
 */
//classe Comportant le jeu les joueurs et la scene
public class Jeu {
private String nom= "Age of glory" ;
private Thread temps ;
private ImageView scene; 
  private Player p1;
   private Player p2;

    public Jeu(Thread temps, ImageView scene,Player p1,Player p2) {
        this.temps = temps;
        this.scene = scene;
        this.p1=p1;
        this.p2=p2;
    }
   public Player GetPlayer1(){
        return p1;
    }
   public Player GetPlayer2(){
        return p2;
    }
   //methode pour avoir l image de scene
    public ImageView Getscene(){
        return this.scene;
    }
    //methode pour avoir le nom de jeu 
    public String nomjeu(){
        return this.nom;
    }
   //methode pour arreter le timer
    public void stop(){
        temps.stop();
    }
   public Thread Returntemps(){
       return this.temps;
   }
}
