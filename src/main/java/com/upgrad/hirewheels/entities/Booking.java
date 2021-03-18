package com.upgrad.hirewheels.entities;
import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int booking_id;
    private LocalDateTime pickup_date;
    private LocalDateTime dropoff_date;
    private LocalDateTime booking_date;
    private float amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Location location_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Vehicle vehicle_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private  Users user_id;

    public Booking(int booking_id, LocalDateTime pickup_date, LocalDateTime dropoff_date, LocalDateTime booking_date, float amount, Location location_id, Vehicle vehicle_id, Users user_id) {
        this.booking_id = booking_id;
        this.pickup_date = pickup_date;
        this.dropoff_date = dropoff_date;
        this.booking_date = booking_date;
        this.amount = amount;
        this.location_id = location_id;
        this.vehicle_id = vehicle_id;
        this.user_id = user_id;
    }

    public Booking() {
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public LocalDateTime getPickup_date() {
        return pickup_date;
    }

    public void setPickup_date(LocalDateTime pickup_date) {
        this.pickup_date = pickup_date;
    }

    public LocalDateTime getDropoff_date() {
        return dropoff_date;
    }

    public void setDropoff_date(LocalDateTime dropoff_date) {
        this.dropoff_date = dropoff_date;
    }

    public LocalDateTime getBooking_date() {
        return booking_date;
    }

    public void setBooking_date(LocalDateTime booking_date) {
        this.booking_date = booking_date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Location getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Location location_id) {
        this.location_id = location_id;
    }

    public Vehicle getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Vehicle vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "booking_id=" + booking_id +
                ", pickup_date=" + pickup_date +
                ", dropoff_date=" + dropoff_date +
                ", booking_date=" + booking_date +
                ", amount=" + amount +
                ", location_id=" + location_id +
                ", vehicle_id=" + vehicle_id +
                ", user_id=" + user_id +
                '}';
    }
}

