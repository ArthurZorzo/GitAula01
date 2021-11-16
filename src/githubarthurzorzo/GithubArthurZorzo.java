/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubarthurzorzo;

import java.util.Scanner;

/**
 *
 * @author IFSC
 */
public class GithubArthurZorzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome;
        
        System.out.println("Digite seu nome");
        nome = leia.nextLine();
        
        System.out.println("Bem vindo ao GitHub "+nome);
    }
}
