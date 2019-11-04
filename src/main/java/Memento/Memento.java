/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Editor.Archivo;

/**
 *
 * @author Gabriel
 */
public class Memento {
    private Archivo archivo;
    
    public Archivo getArchivo(){
        return this.archivo;
    }
    
    public Memento(Archivo ar){
        this.archivo = ar;
    }
}
