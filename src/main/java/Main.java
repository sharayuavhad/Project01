import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime start = LocalTime.of(9, 30);
        LocalTime end = LocalTime.of(12, 45);
        Vehicle vehicle1 = new Vehicle("Activa5g", "MH43CF6849", start,end,15);
        System.out.println(vehicle1);
        System.out.println(vehicle1.modelname);
        System.out.println(vehicle1.numberplate);
        System.out.println(vehicle1.intime);
        System.out.println(vehicle1.outtime);
        System.out.println(vehicle1.charge);

        int totalfare = calculatefare(vehicle1);
        System.out.println(totalfare);
    }

    private static int calculatefare(Vehicle vehicle1) {
        Duration duration = Duration.between(vehicle1.intime, vehicle1.outtime);
        System.out.println(duration.toHours());
        return  (int) (vehicle1.charge * duration.toHours());

    }


}
