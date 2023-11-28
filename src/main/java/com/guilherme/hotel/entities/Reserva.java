package com.guilherme.hotel.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private Integer id;

    @Column(name = "valor_total")
    private Float valorTotal;

    @Column(name = "data_reserva")
    private Date dataReserva;

    @Column(name = "data_checkin")
    private Date dataCheckIn;

    @Column(name = "data_checkout")
    private Date dataCheckOut;

    public Reserva() {}

    public Reserva(Integer id, Float valorTotal, Date dataReserva, Date dataCheckIn, Date dataCheckOut) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.dataReserva = dataReserva;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    public Date getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(Date dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public Date getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(Date dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }
}
