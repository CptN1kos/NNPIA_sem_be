package org.example.enums;

import java.util.List;

public class Constants {

    public static final List<ReservationStatus> allStatuses = List.of(ReservationStatus.CREATED, ReservationStatus.CONFIRMED,
            ReservationStatus.DONE, ReservationStatus.CANCELED, ReservationStatus.LOCKED);

    public static final List<ReservationStatus> bookedStatuses = List.of(ReservationStatus.CONFIRMED,
            ReservationStatus.CREATED, ReservationStatus.LOCKED);

}
