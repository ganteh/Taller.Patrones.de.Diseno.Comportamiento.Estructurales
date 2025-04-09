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
public class AssignedState implements ProjectState {

    @Override
    public void approve(Project project) {
        System.out.println("Project is already approved and assigned.");
    }

    @Override
    public void reject(Project project) {
        System.out.println("Assigned project cannot be rejected.");
    }

    @Override
    public void assign(Project project) {
        System.out.println("Project is already assigned.");
    }

    @Override
    public void complete(Project project) {
        project.setState(new CompletedState());
        System.out.println("Project completed!");
    }

    @Override
    public String toString() {
        return "AssignedState";
    }
}

