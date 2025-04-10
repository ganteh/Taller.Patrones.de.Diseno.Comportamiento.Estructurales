/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.designpatterns.TemplateMethod;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Lenovo pc
 */
public abstract class ProjectEvaluator {

    public final void evaluate(Project project) {
        reviewDocumentation(project);
        validateRequirements(project);
        makeDecision(project);
    }

    protected abstract void reviewDocumentation(Project project);
    protected abstract void validateRequirements(Project project);
    protected abstract void makeDecision(Project project);
}