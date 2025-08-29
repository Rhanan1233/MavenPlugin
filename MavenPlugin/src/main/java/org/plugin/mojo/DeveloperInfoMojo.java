package org.plugin.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Component;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.plugin.entity.Developer;

import java.util.List;

@Mojo(name = "show-developers")
public class DeveloperInfoMojo extends AbstractMojo {

    @Parameter
    private List<Developer> developers;

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (developers == null || developers.isEmpty()) {
            getLog().info("No developers found");
        } else {
            for (Developer developer : developers) {
                getLog().info("--------------------------------");
                getLog().info("Name: " + developer.getName());
                getLog().info("ID: " + developer.getId());
                getLog().info("Email: " + developer.getEmail());
                getLog().info("Organization: " + developer.getOrganization());
                getLog().info("--------------------------------");
            }
        }

    }
}
