import com.tcc.designpatern.model.Manager;
import com.tcc.designpatern.model.Stock;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {

        int quantity = 12;

        Manager manager = new Manager("José");
        Stock stock = new Stock("bonés", quantity);
        stock.attach(manager);
        stock.setQuantity(quantity);

        Stock stock3 = new Stock("Camisas", quantity);
        stock3.attach(manager);
        stock3.setQuantity(22);

        Stock stock2 = new Stock("Cuecas", quantity);
        stock2.attach(manager);
        stock2.setQuantity(20);

        Stock stock1 = new Stock("Camisetas", quantity);
        stock1.attach(manager);
        stock1.setQuantity(20);

        Stock stock4 = new Stock("calças", quantity);
        stock4.attach(manager);
        stock4.setQuantity(1);

        Stock stock5 = new Stock("tenis", quantity);
        stock5.attach(manager);
        stock5.setQuantity(17);


        long start = System.nanoTime();
        long elapsedTime = System.nanoTime() - start;

        double seconds = TimeUnit.SECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        double secondDecimalPrecision = (double)elapsedTime / 1000000000.0;
        double ms = TimeUnit.MILLISECONDS.convert(elapsedTime, TimeUnit.NANOSECONDS);
        double minutes = TimeUnit.MINUTES.convert(elapsedTime, TimeUnit.NANOSECONDS);

        System.out.printf("Nanoseconds: %d ms\n", elapsedTime );
        System.out.printf("Miliseconds: %f ms\n", ms );
        System.out.printf("Seconds: %f ms\n", seconds);
        System.out.printf("Seconds2: %f ms\n", secondDecimalPrecision);
        System.out.printf("MInutes: %f ms\n", minutes);
    }
}
