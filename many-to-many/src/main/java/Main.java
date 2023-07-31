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

        Customer customer1 = new Customer();
        customer1.setId("C001");
        customer1.setName("Amal");
        customer1.setAddress("Aluthgama");

        Customer customer2 = new Customer();
        customer2.setId("C002");
        customer2.setName("Kamal");
        customer2.setAddress("Kalutara");

        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);

        List<Mobile> mobiles = new ArrayList<>();
        mobiles.add(mobile1);
        mobiles.add(mobile2);

        customer1.setLaptops(mobiles);
        customer2.setLaptops(mobiles);

        mobile1.setStudents(customers);
        mobile2.setStudents(customers);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.persist(customer1);
        session.persist(customer2);
        session.persist(mobile1);
        session.persist(mobile2);

        transaction.commit();
        session.close();

        System.out.println("End");
    }
}