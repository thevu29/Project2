package org.example.project2.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "ctdt_kehoachdayhoc")
public class KeHoachDayHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TeachingPlanID")
    private Long teachingPlanId;

    @ManyToOne
    @JoinColumn(name = "ProgramID", nullable = false)
    private ThongTinChung thongTinChung;

    @Column(name = "Semester")
    private Integer semester;

    @Column(name = "AcademicYear")
    private String academicYear;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @OneToMany(mappedBy = "keHoachDayHoc", cascade = CascadeType.ALL)
    private List<KeHoachMoNhom> keHoachMonNhoms;

    // Constructor
    public KeHoachDayHoc() {
    }

    // Getter và Setter
    public Long getTeachingPlanId() {
        return teachingPlanId;
    }

    public void setTeachingPlanId(Long teachingPlanId) {
        this.teachingPlanId = teachingPlanId;
    }

    public ThongTinChung getThongTinChung() {
        return thongTinChung;
    }

    public void setThongTinChung(ThongTinChung thongTinChung) {
        this.thongTinChung = thongTinChung;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<KeHoachMoNhom> getKeHoachMonNhoms() {
        return keHoachMonNhoms;
    }

    public void setKeHoachMonNhoms(List<KeHoachMoNhom> keHoachMoNhoms) {
        this.keHoachMonNhoms = keHoachMoNhoms;
    }
}