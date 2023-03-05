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
//image comprenant pistolet
public final class pistolet extends accessoire {
    private String nom;
    private ImageView imgP;
    private bullet bullet;

    public pistolet(ImageView imgP, int px, int py,bullet bullet) {
        super(imgP, px, py);
        this.bullet=bullet;
    }
//nom de pistolet
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImgP(ImageView imgP) {
        this.imgP = imgP;
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

    public ImageView getImgP() {
        return imgP;
    }

    public int getPx() {
        return px;
    }

    public int getPy() {
        return py;
    }
}
