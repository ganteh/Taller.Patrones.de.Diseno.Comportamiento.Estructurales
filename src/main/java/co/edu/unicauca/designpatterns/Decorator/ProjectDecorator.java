package co.edu.unicauca.designpatterns.Decorator;

import co.edu.unicauca.designpatterns.domain.entities.Project;

/**
 *
 * @author Jhonatan
 */
public class ProjectDecorator extends Project{
    protected Project project;
    
    public ProjectDecorator(Project project){
        super(project.getTitle());
        this.project = project;
    }
    
    @Override
    public String getTitle() {
        return project.getTitle();
    }
    
    @Override
    public String getDescription() {
        return project.getDescription();
    }
    
}
