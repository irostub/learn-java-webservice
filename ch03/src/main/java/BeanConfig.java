import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public WorkManager employeeManager() {
        return new Employee();
    }

    @Bean
    public WorkManager bossManager() {
        return new Boss();
    }

    @Bean
    public WorkService yourWorkService(WorkManager employeeManager) {
        return new WorkService(employeeManager);
    }

    @Bean
    public WorkService myWorkService(WorkManager bossManager) {
        return new WorkService(bossManager);
    }
}
