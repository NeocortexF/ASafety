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

    @Column(name = "KVS")
    private String pilotInCommand;

    @Column(name = "VP")
    private String firstAssistant;

    @Column(name = "PF")
    private String pilotFlying;

    @Column(name = "AE")
    private String aviaEsquadron;

    @Column(name = "Event_AirFASE_1")
    private String mainEventNumber;

    @Column(name = "Risk_index")
    private int riskIndex;

    @Column(name = "Cor_act_accepted")
    private String correctiveActionAcceptanceBy;

    @Column(name = "Talon_closure")
    private String talonClosedBy;

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

    public String getPilotInCommand() {
        return pilotInCommand;
    }

    public void setPilotInCommand(String pilotInCommand) {
        this.pilotInCommand = pilotInCommand;
    }

    public String getFirstAssistant() {
        return firstAssistant;
    }

    public void setFirstAssistant(String firstAssistant) {
        this.firstAssistant = firstAssistant;
    }

    public String getPilotFlying() {
        return pilotFlying;
    }

    public void setPilotFlying(String pilotFlying) {
        this.pilotFlying = pilotFlying;
    }

    public String getAviaEsquadron() {
        return aviaEsquadron;
    }

    public void setAviaEsquadron(String aviaEsquadron) {
        this.aviaEsquadron = aviaEsquadron;
    }

    public String getMainEventNumber() {
        return mainEventNumber;
    }

    public void setMainEventNumber(String mainEventNumber) {
        this.mainEventNumber = mainEventNumber;
    }

    public int getRiskIndex() {
        return riskIndex;
    }

    public void setRiskIndex(int riskIndex) {
        this.riskIndex = riskIndex;
    }

    public String getCorrectiveActionAcceptanceBy() {
        return correctiveActionAcceptanceBy;
    }

    public void setCorrectiveActionAcceptanceBy(String correctiveActionAcceptanceBy) {
        this.correctiveActionAcceptanceBy = correctiveActionAcceptanceBy;
    }

    public String getTalonClosedBy() {
        return talonClosedBy;
    }

    public void setTalonClosedBy(String talonClosedBy) {
        this.talonClosedBy = talonClosedBy;
    }

    @Override
    public String toString() {
        return "FlightDepartmentData{" +
                "id=" + id +
                ", incomingNumber='" + incomingNumber + '\'' +
                ", dateOfFlight='" + dateOfFlight + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", tailNumber='" + tailNumber + '\'' +
                ", pilotInCommand='" + pilotInCommand + '\'' +
                ", firstAssistant='" + firstAssistant + '\'' +
                ", pilotFlying='" + pilotFlying + '\'' +
                ", aviaEsquadron='" + aviaEsquadron + '\'' +
                ", mainEventNumber='" + mainEventNumber + '\'' +
                ", riskIndex=" + riskIndex +
                ", correctiveActionAcceptanceBy='" + correctiveActionAcceptanceBy + '\'' +
                ", talonClosedBy='" + talonClosedBy + '\'' +
                '}';
    }
}
