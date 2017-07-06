package software.neocortex.model;

import javax.persistence.*;

@Entity
@Table(name = "flightdata")
public class SingleSquadronModel {

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

    @Column(name = "Necessary_things")
    private String necessaryActions;

    @Column(name = "Deadline_cor_act")
    private String deadlineOfCorrectiveAction;

    @Column(name = "Cor_act_accepted")
    private String correctiveActionAcceptanceBy;

    @Column(name = "Talon_closure")
    private String talonClosedBy;

    @Column(name = "Event_AirFASE_1")
    private String eventOne;

    @Column(name = "Event_AirFASE_2")
    private String eventTwo;

    @Column(name = "Event_AirFASE_3")
    private String eventThree;

    @Column(name = "Event_AirFASE_4")
    private String eventFour;

    @Column(name = "Event_class_1")
    private String eventOneClassification;

    @Column(name = "Event_class_2")
    private String eventTwoClassification;

    @Column(name = "Event_class_3")
    private String eventThreeClassification;

    @Column(name = "Event_class_4")
    private String eventFourClassification;

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

    @Column(name = "Glazkov")
    private String feedbackFromFlightDepartment;

    @Column(name ="Analysis")
    private String analysis;

    @Column(name = "Corrective_action")
    private String correctiveAction;

    @Column(name = "Commander_or_zam_ae")
    private String squadronChief;

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

    public String getNecessaryActions() {
        return necessaryActions;
    }

    public void setNecessaryActions(String necessaryActions) {
        this.necessaryActions = necessaryActions;
    }

    public String getDeadlineOfCorrectiveAction() {
        return deadlineOfCorrectiveAction;
    }

    public void setDeadlineOfCorrectiveAction(String deadlineOfCorrectiveAction) {
        this.deadlineOfCorrectiveAction = deadlineOfCorrectiveAction;
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

    public String getFeedbackFromFlightDepartment() {
        return feedbackFromFlightDepartment;
    }

    public void setFeedbackFromFlightDepartment(String feedbackFromFlightDepartment) {
        this.feedbackFromFlightDepartment = feedbackFromFlightDepartment;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getCorrectiveAction() {
        return correctiveAction;
    }

    public void setCorrectiveAction(String correctiveAction) {
        this.correctiveAction = correctiveAction;
    }

    public String getSquadronChief() {
        return squadronChief;
    }

    public void setSquadronChief(String squadronChief) {
        this.squadronChief = squadronChief;
    }

    @Override
    public String toString() {
        return "SingleSquadronModel{" +
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
                ", necessaryActions='" + necessaryActions + '\'' +
                ", deadlineOfCorrectiveAction='" + deadlineOfCorrectiveAction + '\'' +
                ", correctiveActionAcceptanceBy='" + correctiveActionAcceptanceBy + '\'' +
                ", talonClosedBy='" + talonClosedBy + '\'' +
                ", eventOne='" + eventOne + '\'' +
                ", eventTwo='" + eventTwo + '\'' +
                ", eventThree='" + eventThree + '\'' +
                ", eventFour='" + eventFour + '\'' +
                ", eventOneClassification='" + eventOneClassification + '\'' +
                ", eventTwoClassification='" + eventTwoClassification + '\'' +
                ", eventThreeClassification='" + eventThreeClassification + '\'' +
                ", eventFourClassification='" + eventFourClassification + '\'' +
                ", eventOneForwardRiskEstimate='" + eventOneForwardRiskEstimate + '\'' +
                ", eventTwoForwardRiskEstimate='" + eventTwoForwardRiskEstimate + '\'' +
                ", eventThreeForwardRiskEstimate='" + eventThreeForwardRiskEstimate + '\'' +
                ", eventFourForwardRiskEstimate='" + eventFourForwardRiskEstimate + '\'' +
                ", remarks='" + remarks + '\'' +
                ", feedbackFromFlightDepartment='" + feedbackFromFlightDepartment + '\'' +
                ", analysis='" + analysis + '\'' +
                ", correctiveAction='" + correctiveAction + '\'' +
                ", squadronChief='" + squadronChief + '\'' +
                '}';
    }
}
