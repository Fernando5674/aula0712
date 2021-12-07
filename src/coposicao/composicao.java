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
public class composicao {
    public static void main(String[] args) {
        //primeira forma
       automovel uno = new automovel();
        automovel Golf = new automovel (2000);
        
        //segunda forma 
        automovel carro = new automovel();
        carro.LigarPelaPrimeiraVez();
        carro.LigarPelaPrimeiraVez(1600);
        
       // terceira forma
        automovel moto = new automovel();
        motor motor = new motor();
        motor motor2 = new motor(1600);
     
         automovel carro = new automovel();
          automovel carro = new automovel(1500,"verde");
          
          carro2.imprimirDadosDosCarros();
          
          
    }
     
}
