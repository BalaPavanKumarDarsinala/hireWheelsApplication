package com.upgrad.hirewheels.entities;
import javax.persistence.*;
@Entity
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int role_id;
    String role_name;

    public Roles(int role_id, String role_name) {
        this.role_id = role_id;
        this.role_name = role_name;
    }

    public Roles() {
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}

