/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocontraseña;

import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class EjercicioContraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        try {
            System.out.println("Ingrese la contraseña: ");
            String contrasena = scanner.nextLine();

            validarContrasena(contrasena);

            System.out.println("Ingrese la contraseña nuevamente para confirmar: ");
            String confirmacion = scanner.nextLine();

            coincidenContrasena(contrasena, confirmacion);

            System.out.println("Contraseña válida y confirmada con éxito.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void validarContrasena(String contrasena) throws Exception {
        if (contrasena.length() < 8) {
            throw new Exception("La contraseña debe tener al menos 8 caracteres.");
        }else if (contrasena.contains(" ")) {
            throw new Exception("La contraseña no debe contener espacios en blanco.");
        }else if (!contrasena.matches(".*[a-zA-Z].*") || !contrasena.matches(".*[A-Z].*") ||
                !contrasena.matches(".*\\d.*") || !contrasena.matches(".*[!@#$%^&*()-_=+\\[\\]{};:'\",.<>/?].*")) {
            throw new Exception("La contraseña debe contener al menos un carácter, una mayúscula, un número y un carácter especial.");
        }else{
            System.out.println("Contraseña válida.");
        }
    }
    public static void coincidenContrasena(String contrasena,String confirmacion) throws Exception {
     if (!contrasena.equals(confirmacion)) {
                throw new Exception("Las contraseñas no coinciden.");
            }else{
         System.out.println("Contraseña confirmada con éxito.");
     }
}
}

    
