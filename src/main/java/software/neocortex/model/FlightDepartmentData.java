package software.neocortex.model;

import javax.persistence.*;

@Entity
@Table(name = "flightdata")
public class FlightDepartmentData {

    @Id
    @Column(name = "flightdata_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Incoming_number")
    private String incomingNumber;

    @Column(name = "Flight_number")
    private String flightNumber;

    @Column(name = "Tail_number")
    private String tailNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIncomingNumber() {
        return incomingNumber;
    }

    public void setIncomingNumber(String incomingNumber) {
        this.incomingNumber = incomingNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    @Override
    public String toString() {
        return "FlightDepartmentData{" +
                "id=" + id +
                ", incomingNumber='" + incomingNumber + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", tailNumber='" + tailNumber + '\'' +
                '}';
    }
}
