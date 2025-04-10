package co.edu.unicauca.designpatterns.Decorator;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Jhonatan
 */
public class PriorityProject extends ProjectDecorator {
    
    public PriorityProject(Project project) {
        super(project);
    }
    
    @Override
    public String getDescription(){
        return project.getTitle() + "[Prioridad Alta]";
    }
    
}
