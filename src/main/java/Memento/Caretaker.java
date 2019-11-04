/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Memento;

import Editor.Archivo;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Caretaker {
    private ArrayList<Memento> mementos = new ArrayList<>();
    private ArrayList<Memento> mementosFuturos = new ArrayList<>();
    
    public void  addMemento(Memento memento){
        this.mementos.add(memento);
    }
    
    public Memento previousMemento(String actual){
        if(this.mementos.isEmpty()){
            return null;
        }
        Memento recuperar  = this.mementos.get(this.mementos.size()-1);
        this.mementos.remove(recuperar);
        this.mementosFuturos.add(new Memento(new Archivo(actual)));
        return recuperar;
    }
    
    public Memento nextMemento(){
        if(this.mementosFuturos.size()==0){
            return null;
        }
        else{
            Memento recuperar = this.mementosFuturos.get(0);
            this.mementosFuturos.remove(recuperar);
            return recuperar;
        }
        
    }
    
}
