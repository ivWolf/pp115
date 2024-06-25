package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        Util.getSessionFactory();

        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Света", "Иванова", (byte) 18);
        userDao.saveUser("Уля", "Иванова", (byte) 16);
        userDao.saveUser("Гриша", "Колин", (byte) 19);
        userDao.saveUser("Андрей", "Пучков", (byte) 20);

        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
        // реализуйте алгоритм здесь
    }
}
