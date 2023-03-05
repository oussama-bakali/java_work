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
//classecomprenant l instance de couteau
public final class couteau extends accessoire {
      private String nom;
    private ImageView imgcou;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImgcou(ImageView imgcou) {
        this.imgcou = imgcou;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public String getNom() {
        return nom;
    }

    public ImageView getImgcou() {
        return imgcou;
    }

    public int getPx() {
        return px;
    }

    public int getPy() {
        return py;
    }

    public couteau(String nom, ImageView imgcou, ImageView image, int px, int py) {
        super(image, px, py);
        this.nom = nom;
        this.imgcou = imgcou;
    }

}
