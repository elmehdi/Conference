import com.service.SpeakerService;
import com.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // SpeakerService service = new SpeakerServiceImpl();

        SpeakerService service = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service.findAll().get(0).getFirstName());
        // testing Singleton - test also made for Prototype
        // I first print the address of the object [bean] and will create another one and see if they'll have the same address
        System.out.println(service);
        SpeakerService service2 = applicationContext.getBean("speakerService", SpeakerService.class);
        System.out.println(service2); // and yes it's the same bean returned - no state is stored | the test of prototype gave 2 different addresses
    }
}
