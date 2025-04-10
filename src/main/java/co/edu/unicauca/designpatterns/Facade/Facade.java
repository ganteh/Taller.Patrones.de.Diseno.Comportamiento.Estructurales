package co.edu.unicauca.designpatterns.Facade;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Jhonatan
 */
public class Facade {
    
    private EvaluationSystem evaluation;
    private AssignmentSystem assigmanet;

    public Facade() {
        this.evaluation = new EvaluationSystem();
        this.assigmanet = new AssignmentSystem();
    }
    
    public void manageProject(Project project){
        if(evaluation.evaluate(project)){
            if(assigmanet.assign(project)){
                System.out.println("Proyecto [APROVADO] y estudiante [ASIGNADO] con exito");
            }else{
                System.out.println("Proyecto [APROVADO], sin estudiante [ASIGNADO]");
            }
        }else{
            System.out.println("Evaluacion de proyecto Fallida --> [NO APROVADO]");
        }
    }
    
}
