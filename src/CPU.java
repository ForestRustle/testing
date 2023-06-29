//Класс для процессора
public class CPU extends AbstractComponentPC{
    public CPU(String name){
        super(name);
    }

    @Override
    public void startTest() {
        System.out.println("Процессор " + getName() + " запущен");
    }

    @Override
    public void stopTest() {
        System.out.println("Процессор " + getName() + " незапущен");
    }
}
