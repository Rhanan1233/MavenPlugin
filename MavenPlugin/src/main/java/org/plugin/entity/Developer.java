package org.plugin.entity;

public class Developer {

    private String name;
    private String id;
    private String email;
    private String organization;

    public Developer() {

    }
     public Developer(String name, String id, String email, String organization) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.organization = organization;
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
}
