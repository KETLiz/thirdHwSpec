import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        BaseWorker worker1 = new Worker("Alex", 30, 50000);
        BaseWorker freelancer1 = new Freelancer("Liya", 25, 3000);
        BaseWorker worker2 = new Worker("Nika", 34, 150000);
        BaseWorker freelancer2 = new Freelancer("Nick", 49, 5000);

        List<BaseWorker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(freelancer1);
        workers.add(worker2);
        workers.add(freelancer2);

        Collections.sort(workers); // сортировка по зарплате

        Comparator ageComparator = new AgeComporator();
        Collections.sort(workers, ageComparator); // сортировка по возрасту

        for(BaseWorker worker : workers) {
            System.out.println(worker);
        }
    }
}