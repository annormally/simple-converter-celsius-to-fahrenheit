import java.util.Scanner;
import java.util.logging.Logger;

public class ConverterCelsiusToFahrenheit {

    private final static Logger LOGGER = Logger.getLogger(ConverterCelsiusToFahrenheit.class.getName());

    public void convert() {

        LOGGER.info("Started converter .");
        double celsius;
        double fahrenheit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write in Celsius grades: ");

        celsius = scanner.nextInt();
        fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Degrees in fahrenheit are: " + Math.round(fahrenheit));

        LOGGER.info("Stopped converter.");
    }

}
