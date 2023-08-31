package com.example.StudentApplication.model;

import java.util.Objects;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="Admin_table")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String contact;
    String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin that = (Admin) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(contact, that.contact) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, contact);
    }

    @Override
    public String toString() {
        return "UsersModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}