package pl.piotr.hotelsapplication.remote.dto.response;

import java.util.List;

public class ReservationCollectionDto {
    private List<ReservationDto> reservations;

    public ReservationCollectionDto() {
    }

    public ReservationCollectionDto(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }

    public List<ReservationDto> getReservations() {
        return reservations;
    }

    public void setReservations(List<ReservationDto> reservations) {
        this.reservations = reservations;
    }
}