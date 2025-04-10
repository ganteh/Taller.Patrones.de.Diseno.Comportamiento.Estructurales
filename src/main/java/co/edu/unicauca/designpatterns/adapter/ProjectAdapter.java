/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.designpatterns.adapter;

/**
 *
 * @author Lenovo pc
 */
import co.edu.unicauca.designpatterns.domain.entities.Project;
import org.json.JSONObject;

public class ProjectAdapter implements ProjectDataProvider {

    private ExternalProjectService externalService;

    public ProjectAdapter(ExternalProjectService externalService) {
        this.externalService = externalService;
    }

    @Override
    public Project getProject() {
        String jsonData = externalService.getProjectData();
        JSONObject jsonObject = new JSONObject(jsonData);
        String title = jsonObject.getString("title");
        return new Project(title);  // Usa el constructor de tu clase Project
    }
}