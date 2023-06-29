//это представление блока компьютера
public class SystemUnit {
    private CPU cpu;
    private RAM ram;
    private HDD hdd;
    private GraphicsCard graphicsCard;

    public SystemUnit(CPU cpu, RAM ram, HDD hdd, GraphicsCard graphicsCard) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.graphicsCard = graphicsCard;
    }

    public void startTest(){
        cpu.startTest();
        ram.startTest();
        hdd.startTest();
        graphicsCard.startTest();
    }

    public void stopTest(){
        cpu.stopTest();
        ram.stopTest();
        hdd.stopTest();
        graphicsCard.stopTest();
    }

}
