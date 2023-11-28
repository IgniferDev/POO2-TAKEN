/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taken;


import javax.swing.JButton;


/**
 *
 * @author USER
 */
public class Logica {
    
    //public String[] lista = new String[16];
    public int movimientos;
    
    public Logica(){
        this.movimientos = 0;
        
    }
    
    public void espiral(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9,JButton b10,JButton b11,JButton b12,JButton b13,JButton b14,JButton b15,JButton b16){
        b1.setText("7");
        b2.setText("8");
        b3.setText("9");
        b4.setText("10");
        b5.setText("6");
        b6.setText("1");
        b7.setText("2");
        b8.setText("11");
        b9.setText("5");
        b10.setText("4");
        b11.setText("3");
        b12.setText("12");
        b13.setText("");
        b14.setText("15");
        b15.setText("14");
        b16.setText("13");
    }
    
    public void imposible(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9,JButton b10,JButton b11,JButton b12,JButton b13,JButton b14,JButton b15,JButton b16){
        b1.setText("15");
        b2.setText("14");
        b3.setText("13");
        b4.setText("12");
        b5.setText("11");
        b6.setText("10");
        b7.setText("9");
        b8.setText("8");
        b9.setText("7");
        b10.setText("6");
        b11.setText("5");
        b12.setText("4");
        b13.setText("3");
        b14.setText("2");
        b15.setText("1");
        b16.setText("");
    }
    
    public void periferico(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9,JButton b10,JButton b11,JButton b12,JButton b13,JButton b14,JButton b15,JButton b16){
        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("12");
        b6.setText("13");
        b7.setText("14");
        b8.setText("5");
        b9.setText("11");
        b10.setText("");
        b11.setText("15");
        b12.setText("6");
        b13.setText("10");
        b14.setText("9");
        b15.setText("8");
        b16.setText("7");
    }
    
    public void vertical(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9,JButton b10,JButton b11,JButton b12,JButton b13,JButton b14,JButton b15,JButton b16){
        b1.setText("1");
        b2.setText("5");
        b3.setText("9");
        b4.setText("13");
        b5.setText("2");
        b6.setText("6");
        b7.setText("10");
        b8.setText("14");
        b9.setText("3");
        b10.setText("7");
        b11.setText("11");
        b12.setText("15");
        b13.setText("4");
        b14.setText("8");
        b15.setText("12");
        b16.setText("");
    }
    
    
    public boolean verificarTablero(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9,JButton b10,JButton b11,JButton b12,JButton b13,JButton b14,JButton b15,JButton b16){
        String s1 = b1.getText();
        String s2 = b2.getText();
        String s3 = b3.getText();
        String s4 = b4.getText();
        String s5 = b5.getText();
        String s6 = b6.getText();
        String s7 = b7.getText();
        String s8 = b8.getText();
        String s9 = b9.getText();
        String s10 = b10.getText();
        String s11 = b11.getText();
        String s12 = b12.getText();
        String s13 = b13.getText();
        String s14 = b14.getText();
        String s15 = b15.getText();
        String s16 = b16.getText();
        
        
        //CLASICO
       // if(s1 =="1" && s2=="2" && s3=="3" && s4=="4" &&
         //       s5=="5" && s6=="6" && s7=="7" && s8=="8" && 
        //        s9=="9" && s10=="10" && s11=="11" && s12=="12" 
         //       && s13=="13" && s14=="14" && s15=="15" && s16==""){
         //   return true;
   // }//ESPIRAL
        if(s1 =="7" && s2=="8" && s3=="9" && s4=="10" &&
                s5=="6" && s6=="1" && s7=="2" && s8=="11" && 
                s9=="5" && s10=="4" && s11=="3" && s12=="12" && 
                 s14=="15" && s15=="14" && s16=="13"){
            return true;
        }//IMPOSIBLE
        if(s1 =="15" && s2=="14" && s3=="13" && s4=="12" &&
                s5=="11" && s6=="10" && s7=="9" && s8=="8" && 
                s9=="7" && s10=="6" && s11=="5" && s12=="4" && 
                s13=="3" && s14=="2" && s15=="1"){
            return true;
        }//PERIFERICO
        if(s1 =="1" && s2=="2" && s3=="3" && s4=="4" &&
                s5=="12" && s6=="13" && s7=="14" && s8=="5" && 
                s9=="11" && s11=="15" && s12=="6" && 
                s13=="10" && s14=="9" && s15=="8" && s16=="7"){
            return true;
        }
        if(s1 =="1" && s2=="5" && s3=="9" && s4=="13" &&
                s5=="2" && s6=="6" && s7=="10" && s8=="14" && 
                s9=="3" && s10=="7" && s11=="11" && s12=="15" && 
                s13=="4" && s14=="8" && s15=="12"){
            return true;
        }
        else{
            return false;
        }
      
    }
    
    public void moverTecla(JButton boton1, JButton boton2){
        String ShuffleNumber = boton2.getText();
        
        if(ShuffleNumber == ""){
            boton2.setText(boton1.getText());
            boton1.setText("");
            movimientos = movimientos+1;
        }
    }
    
    public int obtenerMovimientos(){
        return this.movimientos;
    }
    public void setMovimientos(int n){
        this.movimientos=n;
    }
    
    public void reiniciarTablero(JButton b1,JButton b2,JButton b3,JButton b4,JButton b5,JButton b6,JButton b7,JButton b8,JButton b9,JButton b10,JButton b11,JButton b12,JButton b13,JButton b14,JButton b15,JButton b16){
        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("5");
        b6.setText("6");
        b7.setText("7");
        b8.setText("8");
        b9.setText("9");
        b10.setText("10");
        b11.setText("11");
        b12.setText("12");
        b13.setText("13");
        b14.setText("14");
        b15.setText("15");
        b16.setText("");
        setMovimientos(0);
        
    }
    
    
}
