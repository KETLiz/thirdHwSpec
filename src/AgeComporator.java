/**
 * Класс сравнивает объекты по увеличению возраста
 */

import java.util.Comparator;
public class AgeComporator implements Comparator<BaseWorker> {
    @Override
    public int compare(BaseWorker o1, BaseWorker o2) {
        return o1.getAge() - o2.getAge();
    }
}
