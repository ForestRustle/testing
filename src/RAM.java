//Класс для оперативной памяти
public class RAM extends AbstractComponentPC{
    public RAM(String name) {
        super(name);
    }

    @Override
    public void startTest() {
        System.out.println("Оперативная память  " + getName() + " запущена");
    }

    @Override
    public void stopTest() {
        System.out.println("Оперативная память " + getName() + " запущена");
    }
}
