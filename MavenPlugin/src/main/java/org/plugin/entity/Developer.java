package org.plugin.entity;

import java.util.List;

public class Developer {

    private String name;
    private String id;
    private String email;
    private String organization;
    private List<Role> roles;

    public Developer() {

    }
     public Developer(String name, String id, String email, String organization, List<Role> roles) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.organization = organization;
        this.roles = roles;
     }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
