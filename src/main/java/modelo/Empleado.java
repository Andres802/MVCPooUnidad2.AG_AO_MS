/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author ochoa
 */
public class Empleado {

    private String nombre;
    private LocalDate fechaNacimiento;
    private String cedula;
    private Empresa empresa;
    private int codigoEmpleado;
    private int horasTrabajadas;

    public Empleado(String nombre, LocalDate fechaNacimiento, String cedula, int horasTrabajadas, int codigoEmpleado , Empresa empresa) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.horasTrabajadas = horasTrabajadas;
        this.codigoEmpleado =codigoEmpleado;
        this.empresa = empresa;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Empresa getSueldoEmpresa() {
        return empresa;
    }

    public void setSueldoEmpresa(Empresa sueldoEmpresa) {
        this.empresa = sueldoEmpresa;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", Fecha de Nacimiento=" + fechaNacimiento + ", cedula=" + cedula  + ", horasTrabajadas=" + horasTrabajadas + '}';
    }

}
