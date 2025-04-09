/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.designpatterns.domain.state;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Lenovo pc
 */
public class PendingState implements ProjectState {

    public PendingState() {
        
    }
    
    @Override
    public void approve(Project project) {
        project.setState(new ApprovedState());
        System.out.println("Project approved.");
    }

    @Override
    public void reject(Project project) {
        project.setState(new RejectedState());
        System.out.println("Project rejected.");
    }

    @Override
    public void assign(Project project) {
        System.out.println("Project cannot be assigned while pending.");
    }

    @Override
    public void complete(Project project) {
        System.out.println("Project cannot be completed while pending.");
    }
    
    @Override
    public String toString() {
        return "PendingState";
    }
}
