/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.designpatterns.TemplateMethod;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Lenovo pc
 */
public class TechnicalEvaluator extends ProjectEvaluator {

    @Override
    protected void reviewDocumentation(Project project) {
        System.out.println("Technical review of project: " + project.getTitle());
    }

    @Override
    protected void validateRequirements(Project project) {
        System.out.println("Validating requirements.");
    }

    @Override
    protected void makeDecision(Project project) {
        System.out.println("Project approved.");
    }
}
