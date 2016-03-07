/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.*;

/**
 *
 * @author Estudiante
 */
public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    //Arreglo que crece ilimitadamente    
    ArrayList<Student> students = new ArrayList<Student> ();
    
    Student a = new Student("1", "F");
    Student b = new Student("2", "I");
    Student c = new Student("3", "V");
    
    students.add(a);
    students.add(b);
    students.add(c); 
    
    
    students.remove(2); // Eliminar un elemento de la lista
    
    for(Student s : students){       //Ciclo que recorre los elementos de la lista
        
        
        System.out.println(s.getName());
        
        
    }
    
    
    
    /*Hacen completamente lo mismo
    
    for(int i = 0; i<students.size(); i++){
        
        
        Student s = students.get(i);
        System.out.println(s.getName());
        
        
    }
    
            */
    
    

    }
    
}
