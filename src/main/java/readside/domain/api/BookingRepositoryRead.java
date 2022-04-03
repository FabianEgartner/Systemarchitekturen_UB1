package readside.domain.api;

import readside.domain.AvailableRoom;
import writeside.domain.Booking;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepositoryRead {

    List<Booking> getBookingsByPeriod(LocalDate fromDate, LocalDate toDate);
    List<Booking> getAllBookings();
}
