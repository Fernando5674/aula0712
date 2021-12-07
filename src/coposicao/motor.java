/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coposicao;

/**
 *
 * @author IFSC
 */
public class motor {
     int potencia; 
     
     
    
    public motor(){
        potencia=1000;//valor padrão
    }
     public motor(int potencia){
         this.potencia=potencia;//valor definido por você
         
     }       

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
