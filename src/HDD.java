//Класс для жесткого диска
public class HDD extends  AbstractComponentPC{

    public HDD(String name) {
        super(name);
    }

    @Override
    public void startTest() {
        System.out.println("Жесткий диск " + getName() + " запущен");
    }

    @Override
    public void stopTest() {
        System.out.println("Жесткий диск " + getName() + " незапущен");
    }
}
