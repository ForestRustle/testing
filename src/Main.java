import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU("AMD Ryzen 5 3600x");
        RAM ram = new RAM("16GB");
        HDD hdd =new HDD("2TB");
        GraphicsCard graphicsCard = new GraphicsCard("NVIDIA RTX 2060");

        SystemUnit systemUnit =new SystemUnit(cpu,ram,hdd,graphicsCard);

        //Проверка совместимости
        if (CompatibilityChecker.checkCompatibility(systemUnit)){
            systemUnit.startTest();
            systemUnit.stopTest();
        }
        else {
            System.out.println("Компоненты не совместимы");
        }
    }
}