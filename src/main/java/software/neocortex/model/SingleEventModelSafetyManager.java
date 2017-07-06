package software.neocortex.model;

import javax.persistence.*;

@Entity
@Table(name = "flightdata")
public class SingleEventModelSafetyManager {

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

    @Column(name = "Tail_number")
    private String tailNumber;

    @Column(name = "Flight_number")
    private String flightNumber;

    @Column(name = "Departure")
    private String departure;

    @Column(name = "Arrival")
    private String arrival;

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

    @Column(name ="Analysis")
    private String analysis;

    @Column(name = "Corrective_action")
    private String correctiveAction;

    @Column(name = "Commander_or_zam_ae")
    private String squadronChief;

    @Column(name = "Analysis_date")
    private String dateOfAnalysis;
}
