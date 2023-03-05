/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FightScene;
import Gameclasses.*;
import java.util.Timer;
import java.util.TimerTask;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.util.ArrayList;
/**
 *
 * @author pc
 */
//classe contenant la scene les joueurs et le temps
public class FightScene extends Application  implements EventHandler<KeyEvent>  {
    private final int timestart=30;
    Jeu game;
    score score;
    private Integer seconds=timestart;
    private Label lx;
    private Label ScoreLabel;
    private Timeline Time;
   private bullet cartouche;
   private bullet cartouche2;
private ArrayList<bullet> gun = new ArrayList<bullet>();
   private VBox gunshot;
   private BorderPane Bp;
   private Label resultLabel;
    @Override
    
    public void start (Stage s) {
        
        resultLabel=new Label();
           lx=new Label();
            score=new score(0);
           gunshot =new VBox();
            ScoreLabel=new Label();
           ScoreLabel.setText("Score :"+Integer.toString(score.getScore()));
            ScoreLabel.setFont(Font.font ("arial", 50));
            ScoreLabel.setTextFill(Color.GREEN);
            ScoreLabel.setTranslateX(690);
            ScoreLabel.setTranslateY(-620);
           
              
            Player p1=new Player("oussama",100,new ImageView(new Image("Images//perso7.png")),10,10,10,new ProgressBar(1));
            
       Player p2=new Player("ahmed",100,new ImageView(new Image("Images//perso4.png")),10,10,10,new ProgressBar(1));
       Thread timer=new Thread();
        game=new Jeu (timer,new ImageView(new Image("Images//arena.png")),p1,p2);
        
      p1.GetplayerImage().setFitWidth(200);
      p1.GetplayerImage().setFitHeight(700);
      p2.GetplayerImage().setFitWidth(200);
      p2.GetplayerImage().setFitHeight(700);
      p1.GetplayerImage().setLayoutY(70);
      p2.GetplayerImage().setLayoutY(70);
      p2.GetplayerImage().setLayoutX(1300);
      
       Label lp1=new Label();
       Label lp11=new Label();
       Label lp2=new Label();
       Label lp22=new Label();
       HBox mainhb=new HBox(900);
      lp1.setText(p1.Getnom());
      lp1.setTextFill(Color.CHOCOLATE);
      
      VBox v1=new VBox();
      VBox v2=new VBox();
      lp2.setText(p2.Getnom());
      lp2.setTextFill(Color.CHOCOLATE);
      
    v1.getChildren().addAll(lp1,game.GetPlayer1().getHealth());
     v2.getChildren().addAll(lp2,game.GetPlayer2().getHealth());
     mainhb.getChildren().addAll(v1,v2);
         Bp=new BorderPane();
       cartouche =new bullet (new ImageView(new Image("Images//bullet2.png")));
       cartouche2=new bullet (new ImageView(new Image("Images//bullet2.png")));
       cartouche2.getImgbullet().setLayoutX(1200);
       //cartouche.run();
       VBox v3=new VBox();
       v3.getChildren().addAll(resultLabel,this.ScoreLabel);
       Bp.getChildren().addAll(this.cartouche.getImgbullet(),this.cartouche2.getImgbullet());
       
       
      resultLabel.setFont(Font.font ("arial", 80));
      resultLabel.setTranslateX(700);
      resultLabel.setTranslateY(-500);
        
        resultLabel.setText("NOOB");
        resultLabel.setTextFill(Color.RED);
        
        //Bp.setBottom(ScoreLabel);
        Bp.getChildren().add(game.GetPlayer1().GetplayerImage());
        Bp.getChildren().add(game.GetPlayer2().GetplayerImage());
        //ScoreLabel.setLayoutY(-474);
     Bp.setBottom(v3);
    
      lx.setTranslateY(-300);
    
       lx.setFont(Font.font ("arial", 80));
       //VBox scoretemps=new VBox(20);
       //scoretemps.getChildren().addAll(lx,ScoreLabel);
       //Bp.setCenter(scoretemps);
        Bp.setCenter(lx);
       // Bp.setCenter(ScoreLabel);
        lx.setTextFill(Color.web("#0076a3"));
        
       
        Bp.setTop(mainhb);
        
        
    
          
      
        Bp.setStyle("-fx-background-image:url('Images//arena.png');"+"-fx-background-repeat:no-repeat;"+"-fx-background-size:1700 900;");
        Scene sc=new Scene(Bp,100,200);
        
      sc.setOnKeyPressed(this);
        s.setScene(sc);
        decrementer();
        
        
        //run();
        //shot();
   //Threadgame t=new Threadgame();
   //t.start();
        s.show();
        
    }
    @Override 
public void handle (KeyEvent e){
    int x=0;
    if (this.seconds>=0){
        
        if (this.game.GetPlayer1().getHealth().getProgress()>0&& this.game.GetPlayer1().getHealth().getProgress()<0.2){
              this.resultLabel.setText("player 2 wins");
            System.out.println("player2 wins");
            this.Bp.getChildren().remove(this.game.GetPlayer1().GetplayerImage());
            Time.stop();
        }
         if (this.game.GetPlayer2().getHealth().getProgress()>0&& this.game.GetPlayer2().getHealth().getProgress()<0.2){
            System.out.println("player1 wins");
             this.resultLabel.setText("player 1wins");
            this.Bp.getChildren().remove(this.game.GetPlayer2().GetplayerImage());
            Time.stop();
        }
  //game.Returntemps().start();
      if (this.game.GetPlayer1().GetplayerImage().getBoundsInParent().intersects(this.cartouche2.getImgbullet().getBoundsInParent())){
                     this.game.GetPlayer1().getHealth().setProgress(this.game.GetPlayer1().getHealth().getProgress()-0.1);
                      ScoreLabel.setText("score:"+Integer.toString(score.getScore()+1));
                      
                     System.out.println(this.game.GetPlayer1().getHealth().getProgress()+"/"+this.game.GetPlayer2().getHealth().getProgress());
                     
                 
                    
                
                       
                    
      }
      if (this.game.GetPlayer2().GetplayerImage().getBoundsInParent().intersects(this.cartouche.getImgbullet().getBoundsInParent())){
          this.game.GetPlayer2().getHealth().setProgress(this.game.GetPlayer2().getHealth().getProgress()-0.1);
      }
     
  
    if (e.getCode()==KeyCode.SPACE){
        run();
        //shot();
        
    }
    if (e.getCode()==KeyCode.M){
        run1();
    }
    if (e.getCode()==KeyCode.RIGHT){
       this.game.GetPlayer1().GetplayerImage().relocate(20+this.game.GetPlayer1().GetplayerImage().getLayoutX(), this.game.GetPlayer1().GetplayerImage().getLayoutY());
       //System.out.println("hello");
        
       
    }
      if (e.getCode()==KeyCode.UP){
       this.game.GetPlayer1().GetplayerImage().relocate(this.game.GetPlayer1().GetplayerImage().getLayoutX(), -200+this.game.GetPlayer1().GetplayerImage().getLayoutY());
       //System.out.println("hello2");
        
       
    }
      
       if (e.getCode()==KeyCode.DOWN){
       this.game.GetPlayer1().GetplayerImage().relocate(this.game.GetPlayer1().GetplayerImage().getLayoutX(), 200+this.game.GetPlayer1().GetplayerImage().getLayoutY());
      // System.out.println("hello2");
        
       
    } 
       if (e.getCode()==KeyCode.LEFT){
       this.game.GetPlayer1().GetplayerImage().relocate(-20+this.game.GetPlayer1().GetplayerImage().getLayoutX(), this.game.GetPlayer1().GetplayerImage().getLayoutY());
       //System.out.println("hello2");
        
       
    } 
        if (e.getCode()==KeyCode.D){
       this.game.GetPlayer2().GetplayerImage().relocate(20+this.game.GetPlayer2().GetplayerImage().getLayoutX(), this.game.GetPlayer2().GetplayerImage().getLayoutY());
       //System.out.println("hello");
        
       
    }
        if (e.getCode()==KeyCode.S){
       this.game.GetPlayer2().GetplayerImage().relocate(this.game.GetPlayer2().GetplayerImage().getLayoutX(), 200+this.game.GetPlayer2().GetplayerImage().getLayoutY());
      // System.out.println("hello2");
        
       
    } 
          if (e.getCode()==KeyCode.Z){
       this.game.GetPlayer2().GetplayerImage().relocate(this.game.GetPlayer2().GetplayerImage().getLayoutX(), -200+this.game.GetPlayer2().GetplayerImage().getLayoutY());
       //System.out.println("hello2");
        
       
    }
          if (e.getCode()==KeyCode.A){
       this.game.GetPlayer2().GetplayerImage().relocate(-20+this.game.GetPlayer2().GetplayerImage().getLayoutX(), this.game.GetPlayer2().GetplayerImage().getLayoutY());
       //System.out.println("hello2");
        
       
    } 
          if (this.seconds==0){
              this.Time.stop();
          }
    }
       
}
   
public void run(){
    
       
           cartouche.getImgbullet().setLayoutX(this.cartouche.getImgbullet().getLayoutX()+20); 
          
          
          if (this.cartouche.getImgbullet().getLayoutX()>1400){
              this.cartouche.getImgbullet().setLayoutX(0);
          
       }
         
       
   }
public void run1(){
    
       
           cartouche2.getImgbullet().setLayoutX(this.cartouche2.getImgbullet().getLayoutX()-20); 
          
          
          if (this.cartouche.getImgbullet().getLayoutX()<0){
              this.cartouche.getImgbullet().setLayoutX(1400);
          
       }
         
       
   }
public void shot(){
    for (int i=0;i<10;i++){
        
    
   bullet b=new bullet(new ImageView(new Image("Images//bullet2.png")));
        b.getImgbullet().setLayoutX(b.getImgbullet().getLayoutX()+i);
        this.Bp.getChildren().add(b.getImgbullet());
    
   }
}
public void drawbullets(){
    for (int i=0;i<gun.size();i++){
        gun.get(i).getImgbullet().relocate(gun.get(i).getImgbullet().getLayoutX()+40, 0);
        this.Bp.getChildren().add(gun.get(i).getImgbullet());
    }
}

    
     public void decrementer() {
       Time=new Timeline();
      Time.setCycleCount(Timeline.INDEFINITE);
      if (Time!=null){
          Time.stop();
      }
      KeyFrame frame =new KeyFrame(Duration.seconds(1),new EventHandler<ActionEvent>(){
          @Override
          public void handle(ActionEvent e){
             seconds--;
              lx.setText(Integer.toString(seconds));
               
              
              if (seconds<=0){
                 if (game.GetPlayer1().getHealth().getProgress()==game.GetPlayer2().getHealth().getProgress()){
                       resultLabel.setText("Draw");
                     System.out.println("DRAW");
                       Time.stop();
                       
                 }
                 
                 
                 
                
                 if (game.GetPlayer1().getHealth().getProgress()>game.GetPlayer2().getHealth().getProgress()){
                      resultLabel.setText("Player1 wins");
                     System.out.println("Player1 wins ");
                       Time.stop();
                       
                 }
                 if (game.GetPlayer1().getHealth().getProgress()<game.GetPlayer2().getHealth().getProgress()){
                     resultLabel.setText("Player2 wins");
                     System.out.println("Player2 wins");
                       Time.stop();
                       
                 }
                
              }
              
              
          }
      });
            
        Time.getKeyFrames().add(frame);
              Time.playFromStart();
        
        
      
    }
     
    
         
       
     
}
 
