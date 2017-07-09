package software.neocortex.model;

import javax.persistence.*;

@Entity
@Table(name = "airports")
public class DirectoryAirportsModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "airport")
    private String airportName;

    @Column(name = "code")
    private String airportIcaoCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportIcaoCode() {
        return airportIcaoCode;
    }

    public void setAirportIcaoCode(String airportIcaoCode) {
        this.airportIcaoCode = airportIcaoCode;
    }

    @Override
    public String toString() {
        return "DirectoryAirportsModel{" +
                "id=" + id +
                ", airportName='" + airportName + '\'' +
                ", airportIcaoCode='" + airportIcaoCode + '\'' +
                '}';
    }
}
