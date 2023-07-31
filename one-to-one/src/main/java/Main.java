import entity.Mobile;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Mobile mobile = new Mobile();
        mobile.setId("M001");
        mobile.setBrand("Samsung");
        mobile.setModel("S23 ultra");

        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("Amal");
        customer.setAddress("Aluthgama");
        customer.setMobile(mobile);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(mobile);
        session.persist(customer);

        transaction.commit();
        session.close();

        System.out.println("End");
    }
}