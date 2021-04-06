import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee implements WorkManager{

    @PostConstruct
    public void onCreate() {
        System.out.println("Employee.onCreate");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Employee.onDestroy");
    }

    @Override
    public String doIt() {
        return "Employee doIt";
    }
}
