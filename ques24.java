
    class TooHotException extends Exception {
        public TooHotException(String message) {
        super(message);
        }
       }
       class TooColdException extends Exception {
        public TooColdException(String message) {
        super(message);
    }
}
public class ques24 {
 public static void main(String[] args) {
 if (args.length == 0) {
 System.out.println("Please provide the temperature in Celsius.");
 return;
 }
 double temperature = Double.parseDouble(args[0]);
 try {
 checkTemperature(temperature);
 } catch (TooHotException | TooColdException e) {
 System.out.println(e.getMessage());
 }
 }
 static void checkTemperature(double temperature) throws TooHotException, TooColdException {
 if (temperature > 35) {
 throw new TooHotException("Temperature is too hot: " + temperature + "°C");
 } else if (temperature < 5) {
 throw new TooColdException("Temperature is too cold: " + temperature + "°C");
 } else {
 System.out.println("Normal temperature: " + temperature + "°C");
 double fahrenheit = (temperature * 9/5) + 32;
 System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
 }
 }
}


