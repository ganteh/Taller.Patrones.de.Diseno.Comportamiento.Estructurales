package co.edu.unicauca.designpatterns.Facade;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Jhonatan
 */
public class EvaluationSystem {
    
    public boolean evaluate(Project project){
        System.out.println("Evaluando projecto: " + project.getTitle());
        return Math.random() > 0.5; //Hay un 50% de probabilidad de aprobacion aleatorio
    }
    
}
