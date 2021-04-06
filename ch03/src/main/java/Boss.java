import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Boss implements WorkManager{

    @PostConstruct
    public void onCreate() {
        System.out.println("Boss.onCreate");
    }

    @PreDestroy
    public void onDestroy() {
        System.out.println("Boss.onDestroy");
    }

    @Override
    public String doIt() {
        return "Boss doIt";
    }
}
