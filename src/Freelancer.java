public class Freelancer extends BaseWorker{

    private int hourlyRate; // почасовая ставка

    public Freelancer(String name, int age) {
        super(name, age);
    }

    public Freelancer(String name, int age, int hourlyRate) {
        super(name, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double salaryCalculation() {
        salary = 20.8*8*hourlyRate;
        return salary;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }


}
