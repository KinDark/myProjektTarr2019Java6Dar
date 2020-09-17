import api.IOrder;
import api.IPizza;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import config.Config;
import impl.InnaPizza;
import impl.MyOrder;
import impl.MyPizza;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("mojeZamowienie")
public class Pizzeria {
    public static void main(String[] args) {

        // Podejście klasyczne
        // To jest konfiguracja programu
       // IPizza pizza = new InnaPizza();
      //  IOrder order = new MyOrder(pizza);

        // Logika biznesowa

       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ( "konfiguracja.xml" );
      //  MyOrder order =(MyOrder) context.getBean ( "myOrder");
       // MyOrder order2 = context.getBean("innyOrder", MyOrder.class);

        // Rozwiązania na stringu z klasą konfiguracyjną

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext ( Config.class );
        MyOrder order = context.getBean ( "mojeZamowienie", MyOrder.class );

        order.printOrder();

    }
}
