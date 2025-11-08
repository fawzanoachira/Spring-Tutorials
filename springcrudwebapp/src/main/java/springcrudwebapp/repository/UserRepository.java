package springcrudwebapp.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import springcrudwebapp.models.User;

@Repository
public class UserRepository {

    public int persist(User user) {
        try {
            Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class);
            Session openSession = cfg.buildSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            openSession.persist(user);
            beginTransaction.commit();

            openSession.close();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int update(User user) {
        try {
            Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class);
            Session openSession = cfg.buildSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            User fetched_user = openSession.find(User.class, user.getUserId());
            fetched_user.setUserName(user.getUserName());
            fetched_user.setUserPassword(user.getUserPassword());
            openSession.merge(fetched_user);
            beginTransaction.commit();

            openSession.close();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    public int delete(User user) {
        try {
            Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class);
            Session openSession = cfg.buildSessionFactory().openSession();
            Transaction beginTransaction = openSession.beginTransaction();
            User fetched_user = openSession.find(User.class, user.getUserId());
            openSession.remove(fetched_user);
            beginTransaction.commit();

            openSession.close();
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

}
