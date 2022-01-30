package homeWork3;

public class computerDemo {

    public static void main(String[] args) {

        Computer windowsPc = new Computer();
        Computer macbook = new Computer();

        windowsPc.buildYear = 2018;
        windowsPc.sellPrice = 2000.58;
        windowsPc.freeMemory = 4000;
        windowsPc.operatingSystem = "Windows 10";
        windowsPc.hardDiskMemory = 512;
        windowsPc.isNotebook = false;

        macbook.buildYear = 2019;
        macbook.sellPrice = 3000.20;
        macbook.freeMemory = 8000;
        macbook.operatingSystem = "Mac Os 15.5";
        macbook.hardDiskMemory = 1000;
        macbook.isNotebook = true;

        windowsPc.useMemory(500);
        macbook.changeOperatingSystem("Mac Os 16.0");

        System.out.println("Windows pc was build  : " + windowsPc.buildYear +
                "year " + " and " + "had a price of " + windowsPc.sellPrice + "," +
                "memory of: " + windowsPc.freeMemory + ", OS: " + windowsPc.operatingSystem +
                " hard drive memory of :" + windowsPc.hardDiskMemory + "GB's" + " Is notebook : " +
                windowsPc.isNotebook
                 );
        System.out.println("-------------------------");

        System.out.println("Macbook was build  : " + macbook.buildYear +
                "year " + " and " + "had a price of " + macbook.sellPrice + "," +
                "memory of: " + macbook.freeMemory + ", OS: " + macbook.operatingSystem +
                " hard drive memory of :" + macbook.hardDiskMemory + "GB's" + " Is notebook : " +
                macbook.isNotebook);

        System.out.println("-------------------------");


        //Homework 4 Task1(Extend class with constructors)

        Computer workstation = new Computer(2020,4000,false,5000,16000,"Ubuntu");
        Computer server = new Computer(2017,3600,false,40000,12000,"Red Hat");

        System.out.println(workstation.comparePrice(server));

    }
}
