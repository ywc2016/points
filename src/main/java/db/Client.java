package db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import po.GiftNs;

public enum Client {
    ;
    private static Configuration cfg = new Configuration().configure();
    private static SessionFactory sessionFactory = cfg.buildSessionFactory();

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void main(String[] args) {
        //读取配置文件
        Configuration cfg = new Configuration().configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = null;
        try {
            session = factory.openSession();
            //开启事务
            session.beginTransaction();
            GiftNs giftNs = new GiftNs();

            session.save(giftNs);
            //提交事务
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            //回滚事务
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                if (session.isOpen()) {
                    //关闭session
                    session.close();
                }
            }
        }
    }


}