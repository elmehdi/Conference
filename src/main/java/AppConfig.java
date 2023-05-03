import com.repository.HibernateSpeakerRepositoryImpl;
import com.repository.SpeakerRepository;
import com.service.SpeakerService;
import com.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com"}) // this where I want you to start scanning for beans to autowire
public class AppConfig {
    /*
    @Bean(name = "speakerService")
    // @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService(){
        // SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository()); // this is constructor injection
        // service.setRepository(getSpeakerRepository()); // this is a setter injection
        SpeakerService service = new SpeakerServiceImpl();
        return service;
    }

    // speakerRepository is now created as a bean - The bean is a singleton only one of them will be created
    @Bean("speakerRepository")
    public SpeakerRepository getSpeakerRepository(){
        return new HibernateSpeakerRepositoryImpl();
    }*/
}
