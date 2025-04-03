package org.example.project2.model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "ctdt_giangvien")
public class GiangVien {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "InstructorID")
    private Long instructorId;

    @OneToOne
    @JoinColumn(name = "UserID", nullable = false)
    private User user;

    @Column(name = "InstructorType")
    private String instructorType;

    @Column(name = "Department")
    private String department;

    @Column(name = "Specialization")
    private String specialization;

    @OneToMany(mappedBy = "giangVien", cascade = CascadeType.ALL)
    private List<PhanCongGiangDay> phanCongGiangDays;

    // Constructor
    public GiangVien() {
    }

    // Getter và Setter
    public Long getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(Long instructorId) {
        this.instructorId = instructorId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getInstructorType() {
        return instructorType;
    }

    public void setInstructorType(String instructorType) {
        this.instructorType = instructorType;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<PhanCongGiangDay> getPhanCongGiangDays() {
        return phanCongGiangDays;
    }

    public void setPhanCongGiangDays(List<PhanCongGiangDay> phanCongGiangDays) {
        this.phanCongGiangDays = phanCongGiangDays;
    }
}