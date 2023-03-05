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
//classe comportant l accessoire sa position relative par rapport a  x et y
public sealed class accessoire permits pistolet,couteau {
int px,py;


    public accessoire(ImageView image, int px, int py) {
        this.px = px;
        this.py = py;
       
    }

    public int getPx() {
        return px;
    }

    public int getPy() {
        return py;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public void setPy(int py) {
        this.py = py;
    }




}