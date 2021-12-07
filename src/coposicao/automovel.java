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
public class automovel {
     motor motor;
    private direcao direcao;
            
    
    public void LigarPelaPrimeiraVez(){
        motor = new motor();
        direcao = new direcao();
    }
    public void LigarPelaPrimeiraVez(int potencia, String cor){
        motor = new motor(potencia);
        direcao=new direcao(cor);
    }
    
            
    public automovel(){
        motor = new motor();
        
    }
    public automovel(int potencia){
         motor = new motor(potencia);
       
    }
     public void imprimirDadosDoCarro(){
         System.out.println("potencia do motor: " +motor.getPotencia());
         System.out.println("cor da direção: " + direcao.getCor());
     }
   
}
