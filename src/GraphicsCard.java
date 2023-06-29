public class GraphicsCard extends AbstractComponentPC{

    public GraphicsCard(String name) {
        super(name);
    }

    @Override
    public void startTest() {
        System.out.println("Видеокарта " + getName() + " запущена");
    }

    @Override
    public void stopTest() {
        System.out.println("Видеокарта " + getName() + " незапущена");
    }
}
