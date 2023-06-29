//класс для комплектующих для ПК
abstract class AbstractComponentPC implements ComponentPC{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AbstractComponentPC(String name) {
        this.name = name;
    }
}
