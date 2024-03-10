import java.util.Comparator;
import java.util.ArrayList;
import java.util.Iterator;

// Класс Студент
class Студент {
    private String имя;
    private int оценка;

    public Студент(String имя, int оценка) {
        this.имя = имя;
        this.оценка = оценка;
    }

    public String getИмя() {
        return имя;
    }

    public int getОценка() {
        return оценка;
    }
}

// Класс УчебнаяГруппа
class УчебнаяГруппа {
    private String название;

    public УчебнаяГруппа(String название) {
        this.название = название;
    }

    public String getНазвание() {
        return название;
    }
}

// Класс Поток
class Поток implements Iterable<УчебнаяГруппа> {
    private ArrayList<УчебнаяГруппа> группы = new ArrayList<>();

    public void добавитьГруппу(УчебнаяГруппа группа) {
        группы.add(группа);
    }

    public int size() {
        return группы.size();
    }

    @Override
    public Iterator<УчебнаяГруппа> iterator() {
        return группы.iterator();
    }
}

// Класс StreamComparator для сравнения количества групп в потоке
class StreamComparator implements Comparator<Поток> {
    @Override
    public int compare(Поток поток1, Поток поток2) {
        return Integer.compare(поток1.size(), поток2.size());
    }
}

// Модифицированный Comparator для сравнения оценок студентов
class ОценкаСтудентаComparator implements Comparator<Студент> {
    @Override
    public int compare(Студент студент1, Студент студент2) {
        return Integer.compare(студент1.getОценка(), студент2.getОценка());
    }
}
