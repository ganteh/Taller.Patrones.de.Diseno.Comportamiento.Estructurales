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
public class RejectedState implements ProjectState {

    @Override
    public void approve(Project project) {
        System.out.println("Rejected project cannot be approved.");
    }

    @Override
    public void reject(Project project) {
        System.out.println("Project is already rejected.");
    }

    @Override
    public void assign(Project project) {
        System.out.println("Rejected project cannot be assigned.");
    }

    @Override
    public void complete(Project project) {
        System.out.println("Rejected project cannot be completed.");
    }

    @Override
    public String toString() {
        return "RejectedState";
    }
}
