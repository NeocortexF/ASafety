package software.neocortex.model;

import javax.persistence.*;

@Entity
@Table(name = "flightdata")
public class StatisticModel {

    @Id
    @Column(name = "flightdata_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Date_of_flight")
    private String dateOfFlight;

    @Column(name = "Risk_index")
    private int riskIndex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public int getRiskIndex() {
        return riskIndex;
    }

    public void setRiskIndex(int riskIndex) {
        this.riskIndex = riskIndex;
    }

    @Override
    public String toString() {
        return "StatisticModel{" +
                "id=" + id +
                ", dateOfFlight='" + dateOfFlight + '\'' +
                ", riskIndex=" + riskIndex +
                '}';
    }
}
