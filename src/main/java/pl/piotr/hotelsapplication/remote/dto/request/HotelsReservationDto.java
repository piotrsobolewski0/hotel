package pl.piotr.hotelsapplication.remote.dto.request;

import java.util.List;

public class HotelsReservationDto {
    private List<HotelReservationDto> hotels;
    private  PersonReservationDto person;

    public HotelsReservationDto() {
    }

    public HotelsReservationDto(List<HotelReservationDto> hotels, PersonReservationDto person) {
        this.hotels = hotels;
        this.person = person;
    }

    public List<HotelReservationDto> getHotels() {
        return hotels;
    }

    public void setHotels(List<HotelReservationDto> hotels) {
        this.hotels = hotels;
    }

    public PersonReservationDto getPerson() {
        return person;
    }

    public void setPerson(PersonReservationDto person) {
        this.person = person;
    }
}
