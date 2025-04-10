package co.edu.unicauca.designpatterns;

import co.edu.unicauca.designpatterns.Decorator.PriorityProject;
import co.edu.unicauca.designpatterns.TemplateMethod.BusinessEvaluator;
import co.edu.unicauca.designpatterns.TemplateMethod.TechnicalEvaluator;
import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Lenovo pc
 */
public class Main {

    public static void main(String[] args) {
        Project project = new Project("Academic Management System"); //Patron State
        System.out.println("STATE PATTERN");
        System.out.println("Initial state: " + project.getState().toString()); 
        
        project.approve();
        System.out.println("Current Status: " + project.getState().toString()); 
        
        project.assign();
        System.out.println("Current Status: " + project.getState().toString()); 
        
        project.complete();
        System.out.println("Current Status: " + project.getState().toString()); 
        
        project.complete();
        
        //Patrón Template Method
        System.out.println("TEMPLAE METHOD PATTERN");
        TechnicalEvaluator technicalEvaluator = new TechnicalEvaluator(); technicalEvaluator.evaluate(project);

        BusinessEvaluator businessEvaluator = new BusinessEvaluator();
        businessEvaluator.evaluate(project);
        
        //Prueba Patron Decorator
        System.out.println("\n");
        Project project2 = new Project("Sistema de Gestion de Equipos de Futbol");
        
        System.out.println("===== PROBANDO EL PATRON DECORADOR =====");
        // Aplicar el decorador PriorityProject al objeto project2
        PriorityProject priorityProject = new PriorityProject(project2);
        System.out.println("- Descripcion inicial/original del proyecto: " + project2.getDescription());
        System.out.println("- Descripcion del proyecto despues del patron Decorator: " + priorityProject.getDescription());
        
        
    }
}
