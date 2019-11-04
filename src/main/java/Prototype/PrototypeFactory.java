/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

import java.util.HashMap;

/**
 *
 * @author Gabriel
 */
public class PrototypeFactory {
    private static HashMap<String,IPrototype> prototipos = new HashMap<>();
    
    public static IPrototype obtenerPrototipo(String nombre){
        
        return prototipos.get(nombre).clone();
    }
    
    public static  void  anadirPrototipo(String nombre,IPrototype prototype){
        prototipos.put(nombre,prototype);
    }
}
