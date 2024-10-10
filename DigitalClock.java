import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DigitalClock{
public static void main(String[] args){
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
while(true){
LocalTime currentTime = LocalTime.now();
String formattedTime = currentTime.format(formatter);
System.out.println("\r current Time: "+formattedTime);
try{
Thread.sleep(1000);
}catch (InterruptedException e){
e.printStackTrace();
}
}
}
}
