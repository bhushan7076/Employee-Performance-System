package com.emper.employee.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    @Column(nullable = false)
    private String uname;

    @Column(nullable = false, unique = true)
    private String uemail;

    @Column(nullable = false)
    private String umobile;

    @Column(nullable = false)
    private String upass;

    @Column(nullable = false)
    private int role;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Constructors
    public Employee() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUmobile() {
        return umobile;
    }

    public void setUmobile(String umobile) {
        this.umobile = umobile;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
