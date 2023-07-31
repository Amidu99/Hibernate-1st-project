package lk.ijse.hibernate;

import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("Kamal");
        customer.setAddress("Kalutara");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(customer);
        transaction.commit();
        session.close();

        System.out.println("End");
    }
}
