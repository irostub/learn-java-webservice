public class BasicApp {
    public static void main(String[] args) {
        WorkService workService = new WorkService(new Employee());
        workService.askWork();
        workService.setWorkManager(new Boss());
        workService.askWork();
    }
}
