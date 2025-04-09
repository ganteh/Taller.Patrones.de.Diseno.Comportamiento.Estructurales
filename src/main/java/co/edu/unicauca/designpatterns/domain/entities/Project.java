/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.designpatterns.domain.entities;

import co.edu.unicauca.designpatterns.domain.state.PendingState;
import co.edu.unicauca.designpatterns.domain.state.ProjectState;

/**
 *
 * @author Lenovo pc
 */
public class Project {
    private ProjectState state;
    private String title;

    public Project(String title) {
        this.title = title;
        this.state = new PendingState(); // Estado inicial
    }

    public void setState(ProjectState state) {
        this.state = state;
    }

    public ProjectState getState() {
        return state;
    }

    // Métodos que delegan al estado actual
    public void approve() { state.approve(this); }
    public void reject() { state.reject(this); }
    public void assign() { state.assign(this); }
    public void complete() { state.complete(this); }

    public String getTitle() {
        return title;
    }
}
