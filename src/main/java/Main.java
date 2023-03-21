import ru.netology.service.Vacation;

public class Main {
    public static void main(String[] args) {

        Vacation service = new Vacation();

        int a = service.calculate(10000, 3000, 20000);
        System.out.println(a);

    }
}
