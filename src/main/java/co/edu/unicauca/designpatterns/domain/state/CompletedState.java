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
public class CompletedState implements ProjectState {

    @Override
    public void approve(Project project) {
        System.out.println("Project has already been completed.");
    }

    @Override
    public void reject(Project project) {
        System.out.println("Project has already been completed.");
    }

    @Override
    public void assign(Project project) {
        System.out.println("Project has already been completed.");
    }

    @Override
    public void complete(Project project) {
        System.out.println("Project has already been completed.");
    }

    @Override
    public String toString() {
        return "CompletedState";
    }
}
