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
public class BusinessEvaluator extends ProjectEvaluator {

    @Override
    protected void reviewDocumentation(Project project) {
        System.out.println("Business feasibility review of project: " + project.getTitle());
    }

    @Override
    protected void validateRequirements(Project project) {
        System.out.println("Analyzing business impact and feasibility.");
    }

    @Override
    protected void makeDecision(Project project) {
        System.out.println("Project approved based on business analysis.");
    }
}
