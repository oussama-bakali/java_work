/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gameclasses;

import javafx.scene.image.ImageView;

/**
 *
 * @author hilen
 */
//classe comportant le bullet de l accessoire 
public class bullet {
   ImageView imgbullet;

    public ImageView getImgbullet() {
        return this.imgbullet;
    }
    public bullet(ImageView imgbullet){
        this.imgbullet=imgbullet;
    }

    public void setImgbullet(ImageView imgbullet) {
        this.imgbullet = imgbullet;
    }
   
}
