public class Employee implements WorkManager{

    public void onCreate() {
        System.out.println("Employee.onCreate");
    }

    public void onDestroy() {
        System.out.println("Employee.onDestroy");
    }

    @Override
    public String doIt() {
        return "Employee doIt";
    }
}
