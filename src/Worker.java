public class Worker extends BaseWorker{

    private int fixSalary; // фиксированная месячная оплата

    public Worker(String name, int age) {
        super(name, age);
    }

    public Worker(String name, int age, int fixSalary) {
        super(name, age);
        this.fixSalary = fixSalary;
    }

    @Override
    public double salaryCalculation() {
        salary = fixSalary;
        return salary;
    }


}
