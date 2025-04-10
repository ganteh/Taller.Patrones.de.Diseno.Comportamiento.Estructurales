package co.edu.unicauca.designpatterns.Facade;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Jhonatan
 */
public class AssignmentSystem {
    
    public boolean assign(Project project){
        System.out.println("Asignando estudiantes a un proyecto " + project.getTitle());
        return Math.random() > 0.4; //60% de asignacion exitosa
    }
    
}
