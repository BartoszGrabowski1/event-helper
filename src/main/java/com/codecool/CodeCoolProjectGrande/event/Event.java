package com.codecool.CodeCoolProjectGrande.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue
    private UUID eventId;
    private String name;
    private String description;
    private String logo;
    private String linkToEventPage;
    private int price;
    private String location;
    private boolean verification;
    private LocalDate date;
    private boolean toVerification;
    @Enumerated
    private EventType eventType;
    private UUID userId;


}
