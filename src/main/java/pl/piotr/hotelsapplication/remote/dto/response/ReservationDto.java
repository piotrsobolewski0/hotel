package pl.piotr.hotelsapplication.remote.dto.response;

import pl.piotr.hotelsapplication.domain.model.ReservationType;
import pl.piotr.hotelsapplication.remote.dto.request.HotelReservationDto;
import pl.piotr.hotelsapplication.remote.dto.request.PersonReservationDto;

import java.util.List;

public class ReservationDto {
    private Integer id;
    private ReservationType status;
    private List<HotelReservationDto> room;
    private PersonReservationDto person;

    public ReservationDto() {
    }

    public ReservationDto(Integer id, ReservationType status, List<HotelReservationDto> room, PersonReservationDto person) {
        this.id = id;
        this.status = status;
        this.room = room;
        this.person = person;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ReservationType getStatus() {
        return status;
    }

    public void setStatus(ReservationType status) {
        this.status = status;
    }

    public List<HotelReservationDto> getRoom() {
        return room;
    }

    public void setRoom(List<HotelReservationDto> room) {
        this.room = room;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}