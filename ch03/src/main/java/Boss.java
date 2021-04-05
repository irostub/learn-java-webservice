public class Boss implements WorkManager{

    public void onCreate() {
        System.out.println("Boss.onCreate");
    }

    public void onDestroy() {
        System.out.println("Boss.onDestroy");
    }

    @Override
    public String doIt() {
        return "Boss doIt";
    }
}
