package dao.util;

import dao.CrudDao;
import dao.MentorDao;
import dao.impl.MentorDaoImpl;

public abstract class DaoContext {

    static {
        try {
            System.out.println("Loading driver...");
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded.");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver loading failed");
            e.printStackTrace();
        }
    }

    private static MentorDao mentorDao;

    public static CrudDao<?> autowired(String qualifier, String scope) {
        if (!scope.equals("singleton")) {
            throw new RuntimeException("Invalid scope of bean " + scope);
        }
        if ("MentorDao".equals(qualifier)) {
            return getMentorDaoSQL();
        }
        throw new RuntimeException("Can not find bean for autowiring: " + qualifier);
    }


    private static MentorDao getMentorDaoSQL() {
        if (mentorDao == null) {
            mentorDao = new MentorDaoImpl();
        }
        return mentorDao;
    }


}
