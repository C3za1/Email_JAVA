/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author cesar
 */
public class Email {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
       String Email;
       
        System.out.println("Ingrese el correo:");
       Email = sc.nextLine();
       Pattern jefe = Pattern.compile("[A-Za-z0-9-_]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
       Matcher comparar = jefe.matcher(Email);
     
       if(comparar.find()){
          System.out.println("Correo Válido");
       }
       else
       {
          System.out.println("Error de correo");
       }
      
   }
}

