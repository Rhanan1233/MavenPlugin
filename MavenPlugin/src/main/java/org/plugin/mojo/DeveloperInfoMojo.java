package org.plugin.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.plugin.entity.Developer;

import java.util.List;

@Mojo(name = "show-developers")
public class DeveloperInfoMojo extends AbstractMojo {

    @Parameter(defaultValue = "developer", readonly = false, required = false)
    private List<Developer> developers;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (developers == null || developers.isEmpty()) {
            getLog().warn("No developers found");
        } else {
            for (Developer developer : developers) {
                getLog().info("--------------------------------");
                getLog().info("Name: " + developer.getName() != null ? developer.getName() : "Name");
                getLog().info("ID: " + developer.getId() != null ? developer.getId() : "ID");
                getLog().info("Email: " + developer.getEmail() != null ? developer.getEmail() : "Email");
                getLog().info("Organization: " + developer.getOrganization() != null ? developer.getOrganization() : "Organization");
                getLog().info("Roles: " + developer.getRoles() != null ? developer.getRoles().toString() : "Developer");
                getLog().info("--------------------------------");
            }
        }

    }
}
