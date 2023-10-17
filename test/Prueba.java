/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejerciciocontraseña.EjercicioContraseña;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Scanner;

/**
 *
 * @author Yo
 */
public class Prueba {
    private EjercicioContraseña ejercicio;
    public Prueba() {
    }
    
    @Before
    public void setUp() {
        ejercicio = new EjercicioContraseña();
    }
 @Test public void num8Digitos() throws Exception{
     try {
         ejercicio.validarContrasena("short");
         
     } catch (Exception e) {
         assertEquals("La contraseña debe tener al menos 8 caracteres.", e.getMessage());
     }
}
@Test public void errorCaracter() throws Exception{
     try {
         ejercicio.validarContrasena("1234567H");
         
     } catch (Exception e) {
         assertEquals("La contraseña debe contener al menos un carácter, una mayúscula, un número y un carácter especial.", e.getMessage());
     }
} 
 @Test public void errorMayus() throws Exception{
     try {
         ejercicio.validarContrasena("1234567*");
         
     } catch (Exception e) {
         assertEquals("La contraseña debe contener al menos un carácter, una mayúscula, un número y un carácter especial.", e.getMessage());
     }
} 
  @Test public void errorCampoVacio() throws Exception{
     try {
         ejercicio.validarContrasena("12345678 9");
         
     } catch (Exception e) {
         assertEquals("La contraseña no debe contener espacios en blanco.", e.getMessage());
     }
}
  @Test public void contrasenaNoCoinciden() throws Exception{
     try {
         ejercicio.coincidenContrasena("12345678","23456789");
         
     } catch (Exception e) {
         assertEquals("Las contraseñas no coinciden.", e.getMessage());
     } 
  }
   @Test public void contrasenaCoinciden() throws Exception{
     try {
         ejercicio.validarContrasena("123456H*");
         ejercicio.coincidenContrasena("123456H*","123456H*");
         System.out.println("Contraseña válida y confirmada con éxito.");
     } catch (Exception e) {
         assertEquals("Contraseña confirmada con éxito.", e.getMessage());
     } 
  }
   @Test public void contrasenaValida() throws Exception{
     try {
         ejercicio.validarContrasena("123456H*");
         
     } catch (Exception e) {
         assertEquals("Contraseña válida.", e.getMessage());
     } 
  }
}