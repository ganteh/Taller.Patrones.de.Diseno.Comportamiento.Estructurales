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
    
    public String getTitle() {
        return title;
    }
    
    public String getDescription() {
        return title;
    }

    // Métodos que delegan al estado actual
    public void approve() { state.approve(this); }
    public void reject() { state.reject(this); }
    public void assign() { state.assign(this); }
    public void complete() { state.complete(this); }
}
