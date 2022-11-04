package com.codecool.CodeCoolProjectGrande.event;

import java.time.LocalDate;
import java.util.*;

public interface EventRepository {
    List<Event> EVENTS_IN_MEMORY = new ArrayList<>(Arrays.asList(
            new Event(UUID.randomUUID(), "Tomorrowland", "Biggest festival in the world, you must be here",
                    "url", "url", 400, "Belgium", false, LocalDate.of(2010,10,10), true, EventType.FESTIVAL, UUID.randomUUID()),
            new Event(UUID.randomUUID(), "TechnoParty", "Sample data lorem ipsum",
                    "url", "url", 50, "Sopot", false, LocalDate.of(2000,5,5), true, EventType.PARTY, UUID.randomUUID()),
            new Event(UUID.randomUUID(), "Goodwood Festival", "Sample data lorem ipsum",
                    "url", "url", 100, "UK", false, LocalDate.now(), true, EventType.FESTIVAL, UUID.randomUUID())));
}