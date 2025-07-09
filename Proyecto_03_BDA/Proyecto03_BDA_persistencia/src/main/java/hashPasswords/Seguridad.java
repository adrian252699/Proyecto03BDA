/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashPasswords;

import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author jalt2
 */
public class Seguridad {
    public static String hashPassword(String passwordPlano) {
        return BCrypt.hashpw(passwordPlano, BCrypt.gensalt());
    }
    
    public static boolean verificarPassword(String passwordPlano, String passwordHash) {
        return BCrypt.checkpw(passwordPlano, passwordHash);
    }
}
