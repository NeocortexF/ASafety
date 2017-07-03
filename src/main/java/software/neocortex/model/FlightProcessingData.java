package software.neocortex.model;

import javax.persistence.*;

@Entity
@Table(name = "flightdata")
public class FlightProcessingData {

    @Id
    @Column(name = "flightdata_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Incoming_number")
    private String incomingNumber;

    @Column(name = "Date_processing")
    private String dateOfProcessing;

    @Column(name = "Date_of_flight")
    private String dateOfFlight;

    @Column(name = "Flight_number")
    private String flightNumber;

    @Column(name = "Departure")
    private String departure;

    @Column(name = "Arrival")
    private String arrival;

    @Column(name = "Tail_number")
    private String tailNumber;

    @Column(name = "Event_AirFASE_1")
    private String firstEventCode;

    @Column(name = "Event_AirFASE_2")
    private String secondEventCode;

    @Column(name = "Processed_by_gopi")
    private String processedBy;

    @Column(name = "Accepted_by_gopi")
    private String approvedBy;

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

    public String getDateOfProcessing() {
        return dateOfProcessing;
    }

    public void setDateOfProcessing(String dateOfProcessing) {
        this.dateOfProcessing = dateOfProcessing;
    }

    public String getDateOfFlight() {
        return dateOfFlight;
    }

    public void setDateOfFlight(String dateOfFlight) {
        this.dateOfFlight = dateOfFlight;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String getFirstEventCode() {
        return firstEventCode;
    }

    public void setFirstEventCode(String firstEventCode) {
        this.firstEventCode = firstEventCode;
    }

    public String getSecondEventCode() {
        return secondEventCode;
    }

    public void setSecondEventCode(String secondEventCode) {
        this.secondEventCode = secondEventCode;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    @Override
    public String toString() {
        return "FlightProcessingData{" +
                "id=" + id +
                ", incomingNumber='" + incomingNumber + '\'' +
                ", dateOfProcessing='" + dateOfProcessing + '\'' +
                ", dateOfFlight='" + dateOfFlight + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", tailNumber='" + tailNumber + '\'' +
                ", firstEventCode='" + firstEventCode + '\'' +
                ", secondEventCode='" + secondEventCode + '\'' +
                ", processedBy='" + processedBy + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                '}';
    }
}