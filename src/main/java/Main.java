

import dao.MentorDao;
import dao.util.DaoContext;
import model.Mentor;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws SQLException {


        MentorDao mentorDao = (MentorDao) DaoContext.autowired("MentorDao", "singleton");

        Mentor mentor = Mentor.builder()
                .firstName("Nargiza")
                .lastName("Tashieva")
                .dob(LocalDate.of(1996, 12, 12))
                .email("tash@gmail.com")
                .salary(10000.0)
                .phoneNumber("999999999999")
                .build();
        System.out.println( mentorDao.save(mentor));


    }
}