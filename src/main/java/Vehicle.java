import java.sql.Time;
import java.time.LocalTime;

public class Vehicle {
    String modelname;
    String numberplate;
    LocalTime intime;
    LocalTime outtime;
    int charge;


    public Vehicle(String modelname, String  numberplate, LocalTime intime, LocalTime outtime, int charge) {
        this.modelname = modelname;
        this.numberplate = numberplate;
        this.intime = intime;
        this.outtime = outtime;
        this.charge = charge;
    }
}
