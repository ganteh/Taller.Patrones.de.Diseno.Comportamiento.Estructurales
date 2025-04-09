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
public class ApprovedState implements ProjectState {

    @Override
    public void approve(Project project) {
        System.out.println("Project is already approved.");
    }

    @Override
    public void reject(Project project) {
        System.out.println("Approved project cannot be rejected.");
    }

    @Override
    public void assign(Project project) {
        project.setState(new AssignedState());
        System.out.println("Project assigned to a student.");
    }

    @Override
    public void complete(Project project) {
        System.out.println("Project must be assigned before completion.");
    }

    @Override
    public String toString() {
        return "ApprovedState";
    }
}
