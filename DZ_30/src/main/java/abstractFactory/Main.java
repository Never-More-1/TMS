package abstractFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Windows приложение ===");
        GUIFactory windowsFactory = new WindowsFactory();
        Application windowsApp = new Application(windowsFactory);
        windowsApp.render();
        windowsApp.interact();

        System.out.println();

        System.out.println("=== MacOS приложение ===");
        GUIFactory macFactory = new MacOSFactory();
        Application macApp = new Application(macFactory);
        macApp.render();
        macApp.interact();
    }
}
//Абстрактная фабрика — это порождающий паттерн проектирования,
//который позволяет создавать семейства связанных объектов,
//не привязываясь к конкретным классам создаваемых объектов.