import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class ConfigImportSpringApp {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(BeanConfig.class);
        Map<String, Object> beansOfType = ac.getBeansOfType(Object.class);
        for (String key : beansOfType.keySet()) {
            System.out.println("key = " + key + ", value = "+ beansOfType.get(key));
        }
    }
}
