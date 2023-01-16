import com.coder.Car;
import com.coder.Phone;
import com.coder.Robot;
import com.inter.sim;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {












    
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");

        Robot robot=(Robot)context.getBean("robot");
        robot.job();
        Phone phone=context.getBean("phone",Phone.class);
        phone.job();
        Car car=(Car)context.getBean("car");
        car.walking();

        sim s=context.getBean("operator",sim.class);
        s.browse();
        s.call();



    }
}
