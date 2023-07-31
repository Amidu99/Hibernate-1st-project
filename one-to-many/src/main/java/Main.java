import entity.Mobile;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");

        Mobile mobile1 = new Mobile();
        mobile1.setId("M001");
        mobile1.setBrand("Samsung");
        mobile1.setModel("S23 ultra");

        Mobile mobile2 = new Mobile();
        mobile2.setId("M002");
        mobile2.setBrand("Apple");
        mobile2.setModel("14 pro max");

        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(mobile1);
        mobiles.add(mobile2);

        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("Amal");
        customer.setAddress("Aluthgama");
        customer.setLaptops(mobiles);

        mobile1.setCustomer(customer);
        mobile2.setCustomer(customer);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(customer);
        session.persist(mobile1);
        session.persist(mobile2);

        transaction.commit();
        session.close();
    }
}