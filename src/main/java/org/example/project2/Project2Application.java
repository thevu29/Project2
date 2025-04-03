    package org.example.project2;

    import jakarta.persistence.*;
    import org.example.project2.model.KhungChuongTrinh;
    import org.example.project2.model.ThongTinChung;
    import org.example.project2.repository.KhungChuongTrinhRepository;
    import org.example.project2.repository.ThongTinChungRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.CommandLineRunner;
    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    import org.springframework.boot.autoconfigure.domain.EntityScan;
    import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

    @SpringBootApplication(scanBasePackages = "org.example.project2")
    @EntityScan("org.example.project2.model")
    @EnableJpaRepositories("org.example.project2.repository")

    public class Project2Application implements CommandLineRunner {
        @Autowired
        private ThongTinChungRepository thongTinChungRepository;

        @Autowired
        private KhungChuongTrinhRepository khungChuongTrinhRepository;

        public static void main(String[] args) {
            SpringApplication.run(Project2Application.class, args);
        }


        @Override
        public void run(String... args) throws Exception {
            ThongTinChung thongTinChung = new ThongTinChung();
            thongTinChung.setProgramName("Công nghệ Thông tin");
            thongTinChung.setProgramCode("CNTT2023");
            thongTinChung.setDescription("Chương trình đào tạo ngành CNTT");
            thongTinChung.setStartYear(2023);
            thongTinChung.setDuration(4);
            thongTinChung.setTotalCredits(120);

            thongTinChungRepository.save(thongTinChung);

            KhungChuongTrinh khungChuongTrinh = new KhungChuongTrinh();
            khungChuongTrinh.setThongTinChung(thongTinChung);
            khungChuongTrinh.setBlockName("Kiến thức đại cương");
            khungChuongTrinh.setSemester(1);
            khungChuongTrinh.setCredits(30);

            khungChuongTrinhRepository.save(khungChuongTrinh);

            System.out.println("Dữ liệu đã được lưu vào database!");
        }
    }
