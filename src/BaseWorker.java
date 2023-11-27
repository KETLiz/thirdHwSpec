public abstract class BaseWorker implements Comparable<BaseWorker> {

    protected String name;
    protected int age;
    protected double salary;

    public BaseWorker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Метод расчёта заработной платы сотрудника
     * @return зарплата
     */
    public abstract double salaryCalculation();

    @Override
    public String toString() {
        return "Name: " + getName() + ", age: " + getAge() + ", salary: " + salaryCalculation();
    }

    /**
     * Сравнение объектов по увеличению зп
     * @param o the object to be compared.
     */
    @Override
    public int compareTo(BaseWorker o) {
        return (int) (this.salaryCalculation() - o.salaryCalculation());
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
