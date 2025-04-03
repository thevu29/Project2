package org.example.project2.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ctdt_khungchuongtrinh")
public class KhungChuongTrinh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FrameworkID")
    private Long frameworkId;

    @ManyToOne
    @JoinColumn(name = "ProgramID", nullable = false)
    private ThongTinChung thongTinChung;

    @Column(name = "BlockName")
    private String blockName;

    @Column(name = "Semester")
    private Integer semester;

    @Column(name = "Credits")
    private Integer credits;

    @OneToMany(mappedBy = "khungChuongTrinh", cascade = CascadeType.ALL)
    private List<HocPhan> hocPhans;

    // Constructor
    public KhungChuongTrinh() {
    }

    // Getter và Setter
    public Long getFrameworkId() {
        return frameworkId;
    }

    public void setFrameworkId(Long frameworkId) {
        this.frameworkId = frameworkId;
    }

    public ThongTinChung getThongTinChung() {
        return thongTinChung;
    }

    public void setThongTinChung(ThongTinChung thongTinChung) {
        this.thongTinChung = thongTinChung;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public List<HocPhan> getHocPhans() {
        return hocPhans;
    }

    public void setHocPhans(List<HocPhan> hocPhans) {
        this.hocPhans = hocPhans;
    }
}