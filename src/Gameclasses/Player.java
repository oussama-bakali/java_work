/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gameclasses;


import java.util.Scanner;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
/**
 *
 * @author pc
 */
//classe compreant le joueur et ses informations respectives(nom sa postion son image son energie 
public class Player {
    private String nom;
    private int px;
    private int py;
    private ImageView Image;
    private ProgressBar pb;
    private int vie;
    private int height;
    public Player(String nomPlayer,int vie,ImageView image,int x,int y,int height,ProgressBar pb ){
      
     this.nom=nomPlayer;
     this.px=x;
     this.py=y;
      this.vie=vie;
      this.Image=image;
      this.height=height;
      this.pb=pb;
      this.pb.setPrefSize(341, 55);
       
    }
    public String Getnom(){
        return this.nom;
    }
    public ProgressBar getHealth(){
        return this.pb;
    }
    public int Getpx(){
        return  this.px;
    }
    public int Getpy(){
        return this.py;
    }
    public ImageView GetplayerImage(){
        return this.Image;
    }
    public int GetVie(){
        return this.vie;
    }
    public void setvie(int x){
        vie=x;
    }
    public int Getheight(){
        return this.height;
    }
   
}
