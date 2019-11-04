/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Editor;

import Memento.Memento;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Gabriel
 */
public class Archivo {
    private String text;
    private StyledDocument doc;
    
    
    public Archivo(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    
    
    public void guardar(){
        
    }
    
    
    public void guardarComo(){
        
    }
    
    public void adherirCaracter(){
        
    }
    
    public void cambiarColor(){
        
    }
    
    public void resaltarLetra(){
        
    }
    
    public void undo(){
        
    }
    
    public void redo(){
        
    }
    
    public void copiar(){
        
    }
    
    public void pegar(){
        
    }
    
     public Memento createMemento(){
        return new Memento(this);
    }

    public StyledDocument getDoc() {
        return doc;
    }

    public void setDoc(StyledDocument doc) {
        this.doc = doc;
    }
    
    
    
}
