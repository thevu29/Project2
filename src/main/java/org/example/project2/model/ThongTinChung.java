package org.example.project2.model;


import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "ctdt_thongtinchung")
public class ThongTinChung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProgramID")
    private Long programId;

    @Column(name = "ProgramName", nullable = false)
    private String programName;

    @Column(name = "ProgramCode", unique = true)
    private String programCode;

    @Column(name = "Description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "StartYear")
    private Integer startYear;

    @Column(name = "Duration")
    private Integer duration;

    @Column(name = "TotalCredits")
    private Integer totalCredits;

    @OneToMany(mappedBy = "thongTinChung", cascade = CascadeType.ALL)
    private List<KhungChuongTrinh> khungChuongTrinhs;

    @OneToMany(mappedBy = "thongTinChung", cascade = CascadeType.ALL)
    private List<KeHoachDayHoc> keHoachDayHocs;

    // Constructor
    public ThongTinChung() {
    }

    // Getter và Setter
    public Long getProgramId() {
        return programId;
    }

    public void setProgramId(Long programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(Integer totalCredits) {
        this.totalCredits = totalCredits;
    }

    public List<KhungChuongTrinh> getKhungChuongTrinhs() {
        return khungChuongTrinhs;
    }

    public void setKhungChuongTrinhs(List<KhungChuongTrinh> khungChuongTrinhs) {
        this.khungChuongTrinhs = khungChuongTrinhs;
    }

    public List<KeHoachDayHoc> getKeHoachDayHocs() {
        return keHoachDayHocs;
    }

    public void setKeHoachDayHocs(List<KeHoachDayHoc> keHoachDayHocs) {
        this.keHoachDayHocs = keHoachDayHocs;
    }
}