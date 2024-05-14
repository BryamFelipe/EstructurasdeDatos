/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bryam
 */
public class EncriptadorModelo {
    private Map<Character, Character> claveEncriptacion;

    public EncriptadorModelo() {
        claveEncriptacion = new HashMap<>();
        // Definición de la clave de encriptación
        claveEncriptacion.put('a', '!');
        claveEncriptacion.put('b', '@');
        claveEncriptacion.put('c', '#');
        claveEncriptacion.put('d', '$');
        claveEncriptacion.put('e', '%');
        // Agrega más caracteres según necesites
    }

    public String encriptarContrasena(String contrasena) {
        StringBuilder contrasenaEncriptada = new StringBuilder();
        for (char caracter : contrasena.toCharArray()) {
            if (claveEncriptacion.containsKey(caracter)) {
                contrasenaEncriptada.append(claveEncriptacion.get(caracter));
            } else {
                contrasenaEncriptada.append(caracter);
            }
        }
        return contrasenaEncriptada.toString();
    }

    public String desencriptarContrasena(String contrasenaEncriptada) {
        Map<Character, Character> claveDesencriptacion = new HashMap<>();
        for (Map.Entry<Character, Character> entry : claveEncriptacion.entrySet()) {
            claveDesencriptacion.put(entry.getValue(), entry.getKey());
        }
        return encriptarContrasena(contrasenaEncriptada, claveDesencriptacion);
    }

    private String encriptarContrasena(String contrasenaEncriptada, Map<Character, Character> claveDesencriptacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
