package co.edu.unicauca.designpatterns;

import co.edu.unicauca.designpatterns.Decorator.PriorityProject;
import co.edu.unicauca.designpatterns.Facade.Facade;
import co.edu.unicauca.designpatterns.TemplateMethod.BusinessEvaluator;
import co.edu.unicauca.designpatterns.TemplateMethod.TechnicalEvaluator;
import co.edu.unicauca.designpatterns.adapter.*;
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
        
        //Patrón adapter
        System.out.println("ADAPTER PATTERN");
        ExternalProjectService externalService = new ExternalProjectService();
        ProjectDataProvider adapter = new ProjectAdapter(externalService);
        Project adaptedProject = adapter.getProject();

        System.out.println("Project created from external service: " + adaptedProject.getTitle());
        
        //Prueba Patron DECORATOR
        System.out.println("\n");
        Project project2 = new Project("Sistema de Gestion de Equipos de Futbol");
        
        System.out.println("===== PROBANDO EL PATRON DECORADOR =====");
        // Aplicar el decorador PriorityProject al objeto project2
        PriorityProject priorityProject = new PriorityProject(project2);
        System.out.println("- Descripcion inicial/original del proyecto: " + project2.getDescription());
        System.out.println("- Descripcion del proyecto despues del patron Decorator: " + priorityProject.getDescription());
        
        //Prueba Patron FACADE
        System.out.println("\n");
        System.out.println("===== PROBANDO EL PATRON FACADE =====");
        // Crear una instancia de la fachada
        Facade platform = new Facade();
        
        //Se utiliza la fachada para gestionar el proyecto
        System.out.println("- Gestion del proyecto base/original:");
        platform.manageProject(project2);
        
        System.out.println("\n- Gestion de proyectos prioritarios:");
        platform.manageProject(priorityProject);
        
    }
}
