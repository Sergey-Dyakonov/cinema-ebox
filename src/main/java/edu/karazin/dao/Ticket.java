package edu.karazin.dao;

import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@Data
@FieldDefaults(level = PRIVATE)
public class Ticket {
    long id;
    long sessionId;
    long placeId;
    long userId;
    long priceId;
    LocalDateTime createdAt;
}
