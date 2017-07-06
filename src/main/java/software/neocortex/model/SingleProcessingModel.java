package software.neocortex.model;

import javax.persistence.*;

// классификатор буду подгружать из другой сущности (модель-справочник)
@Entity
@Table(name = "flightdata")
public class SingleProcessingModel {

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

    @Column(name = "Event_class_1")
    private String eventOneClassification;

    @Column(name = "Event_class_2")
    private String eventTwoClassification;

    @Column(name = "Event_class_3")
    private String eventThreeClassification;

    @Column(name = "Event_class_4")
    private String eventFourClassification;

    @Column(name = "Event_AirFASE_1")
    private String eventOne;

    @Column(name = "Event_AirFASE_2")
    private String eventTwo;

    @Column(name = "Event_AirFASE_3")
    private String eventThree;

    @Column(name = "Event_AirFASE_4")
    private String eventFour;

    @Column(name = "Risk_ass_1")
    private String eventOneForwardRiskEstimate;

    @Column(name = "Risk_ass_2")
    private String eventTwoForwardRiskEstimate;

    @Column(name = "Risk_ass_3")
    private String eventThreeForwardRiskEstimate;

    @Column(name = "Risk_ass_4")
    private String eventFourForwardRiskEstimate;

    @Column(name = "Primechanie")
    private String remarks;

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

    public String getEventOneClassification() {
        return eventOneClassification;
    }

    public void setEventOneClassification(String eventOneClassification) {
        this.eventOneClassification = eventOneClassification;
    }

    public String getEventTwoClassification() {
        return eventTwoClassification;
    }

    public void setEventTwoClassification(String eventTwoClassification) {
        this.eventTwoClassification = eventTwoClassification;
    }

    public String getEventThreeClassification() {
        return eventThreeClassification;
    }

    public void setEventThreeClassification(String eventThreeClassification) {
        this.eventThreeClassification = eventThreeClassification;
    }

    public String getEventFourClassification() {
        return eventFourClassification;
    }

    public void setEventFourClassification(String eventFourClassification) {
        this.eventFourClassification = eventFourClassification;
    }

    public String getEventOne() {
        return eventOne;
    }

    public void setEventOne(String eventOne) {
        this.eventOne = eventOne;
    }

    public String getEventTwo() {
        return eventTwo;
    }

    public void setEventTwo(String eventTwo) {
        this.eventTwo = eventTwo;
    }

    public String getEventThree() {
        return eventThree;
    }

    public void setEventThree(String eventThree) {
        this.eventThree = eventThree;
    }

    public String getEventFour() {
        return eventFour;
    }

    public void setEventFour(String eventFour) {
        this.eventFour = eventFour;
    }

    public String getEventOneForwardRiskEstimate() {
        return eventOneForwardRiskEstimate;
    }

    public void setEventOneForwardRiskEstimate(String eventOneForwardRiskEstimate) {
        this.eventOneForwardRiskEstimate = eventOneForwardRiskEstimate;
    }

    public String getEventTwoForwardRiskEstimate() {
        return eventTwoForwardRiskEstimate;
    }

    public void setEventTwoForwardRiskEstimate(String eventTwoForwardRiskEstimate) {
        this.eventTwoForwardRiskEstimate = eventTwoForwardRiskEstimate;
    }

    public String getEventThreeForwardRiskEstimate() {
        return eventThreeForwardRiskEstimate;
    }

    public void setEventThreeForwardRiskEstimate(String eventThreeForwardRiskEstimate) {
        this.eventThreeForwardRiskEstimate = eventThreeForwardRiskEstimate;
    }

    public String getEventFourForwardRiskEstimate() {
        return eventFourForwardRiskEstimate;
    }

    public void setEventFourForwardRiskEstimate(String eventFourForwardRiskEstimate) {
        this.eventFourForwardRiskEstimate = eventFourForwardRiskEstimate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
        return "SingleProcessingModel{" +
                "id=" + id +
                ", incomingNumber='" + incomingNumber + '\'' +
                ", dateOfProcessing='" + dateOfProcessing + '\'' +
                ", dateOfFlight='" + dateOfFlight + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", tailNumber='" + tailNumber + '\'' +
                ", eventOneClassification='" + eventOneClassification + '\'' +
                ", eventTwoClassification='" + eventTwoClassification + '\'' +
                ", eventThreeClassification='" + eventThreeClassification + '\'' +
                ", eventFourClassification='" + eventFourClassification + '\'' +
                ", eventOne='" + eventOne + '\'' +
                ", eventTwo='" + eventTwo + '\'' +
                ", eventThree='" + eventThree + '\'' +
                ", eventFour='" + eventFour + '\'' +
                ", eventOneForwardRiskEstimate='" + eventOneForwardRiskEstimate + '\'' +
                ", eventTwoForwardRiskEstimate='" + eventTwoForwardRiskEstimate + '\'' +
                ", eventThreeForwardRiskEstimate='" + eventThreeForwardRiskEstimate + '\'' +
                ", eventFourForwardRiskEstimate='" + eventFourForwardRiskEstimate + '\'' +
                ", remarks='" + remarks + '\'' +
                ", processedBy='" + processedBy + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                '}';
    }
}
