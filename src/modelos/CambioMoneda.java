package modelos;

import java.time.LocalDate;

public class CambioMoneda {
    private String moneda;
    private LocalDate fecha;
    private double valor;

    public CambioMoneda(String moneda, LocalDate fecha, double valor) {
        this.moneda = moneda;
        this.fecha = fecha;
        this.valor = valor;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
