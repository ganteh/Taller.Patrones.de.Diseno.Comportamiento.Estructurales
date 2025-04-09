/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package co.edu.unicauca.designpatterns;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Lenovo pc
 */
public class Main {

    public static void main(String[] args) {
        Project project = new Project("Academic Management System"); //Patron State
        System.out.println("STATE PATTERN");
        System.out.println("Initial state: " + project.getState().toString()); 
        
        project.approve();
        System.out.println("Current Status: " + project.getState().toString()); 
        
        project.assign();
        System.out.println("Current Status: " + project.getState().toString()); 
        
        project.complete();
        System.out.println("Current Status: " + project.getState().toString()); 
        
        project.complete();
        
    }
}
