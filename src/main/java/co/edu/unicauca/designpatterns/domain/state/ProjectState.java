/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.designpatterns.domain.state;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Lenovo pc
 */
/** *
* Interface que maneja el ciclo de vida del proyecto */
public interface ProjectState { 
    void approve(Project project); 
    void reject(Project project); 
    void assign(Project project); 
    void complete(Project project);
}
