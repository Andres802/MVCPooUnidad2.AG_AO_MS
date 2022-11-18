/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.EmpleadoControlador;
import controlador.EmpresaControlador;
import java.time.LocalDate;
import java.time.Month;
import modelo.*;
import servicio.EmpleadoServiceImpl;
import servicio.EmpresaServiceImpl;

/**
 *
 * @author ochoa
 */
public class Principal {
    public static void main(String[] args) {
        
        System.out.println("-------------------- EMPRESAS Y SUS EMPLEADOS --------------------");
        
        var baseDato = new EmpleadoServiceImpl();
        var baseDato1 = new EmpresaServiceImpl();
        var empresa1 = new Empresa("Bebidas Gaseosas","Jhon Wilson","Coca Cola",1888,12);
        var empresa = new Empresa(700);
         var empleado = new Empleado("Andres",LocalDate.of(2002, 8, 12),"0302592704",180,1,empresa);
        System.out.println("---- Empleados ---");
        
        baseDato.crear(empleado);
        baseDato.eliminar(0);
        System.out.println(baseDato.listar());
        
        System.out.println("---- Empresa ----");
        
        empresa1.setNombreEmpleado(empleado); 
        baseDato1.crear(empresa1);
        System.out.println(baseDato1.listar());
        System.out.println("-------------------- DATOS DEL PRIMER EMPLEADO Y SU PAGO --------------------");
        var empleadoControl = new EmpleadoControlador();
        var data = new String[8];

        data[0] = "10";
        data[1] = "0301234556";
        data[2] = "600";
        data[3] = "Andres O";
        data[4] = "1987";
        data[5] = "06";
        data[6] = "22";
        data[7] = "182";
        
        System.out.println("El primer empleado que recibe el sueldo de "  + empleadoControl.crear(data));
        System.out.println("Al empleado le devuelve el sueldo de " + empleadoControl.devuelveSueldo(data));
        System.out.println(empleadoControl.listar());
        
        System.out.println("-------------------- DATOS DEL SEGUNDO EMPLEADO Y SU PAGO --------------------");
        var empleadoControl1 = new EmpleadoControlador();
        var data1 = new String[8];

        data1[0] = "20";
        data1[1] = "032433922";
        data1[2] = "700";
        data1[3] = "Paul S";
        data1[4] = "1666";
        data1[5] = "07";
        data1[6] = "30";
        data1[7] = "160";
        
        System.out.println( "El segundo empleado que recibe el sueldo de "  + empleadoControl1.crear(data1));
        System.out.println("Al empleado le devuelve el sueldo de " + empleadoControl1.devuelveSueldo(data1));
        System.out.println(empleadoControl1.listar());
        
        System.out.println("-------------------- DATOS DEL TERCERO EMPLEADO Y SU PAGO --------------------");
        var empleadoControl2 = new EmpleadoControlador();
        var data2 = new String[8];

        data2[0] = "30";
        data2[1] = "03589358";
        data2[2] = "900";
        data2[3] = "Carlos G";
        data2[4] = "1988";
        data2[5] = "10";
        data2[6] = "13";
        data2[7] = "110";
        
        System.out.println("El tercer empleado que recibe el sueldo de "  + empleadoControl2.crear(data2));
        System.out.println("Al empleado le devuelve el sueldo de " + empleadoControl2.devuelveSueldo(data2));
        System.out.println(empleadoControl2.listar());
        
         System.out.println("-------------------- DATOS DE LA PRIMERA EMPRESA --------------------");
        var empresaControl = new EmpresaControlador();
        var datas = new String[5];

        datas[0] = "Bebidas Gaeosas";
        datas[1] = "Jhon Whilson";
        datas[2] = "Coca Cola";
        datas[3] = "1865";
        datas[4] = "1";
        
        
        System.out.println(empresaControl.crear(datas));
        System.out.println(empresaControl.listar());
        
        System.out.println("-------------------- DATOS DE LA SEGUNDA EMPRESA --------------------");
        var empresaControl1 = new EmpresaControlador();
        var datas2 = new String[5];

        datas2[0] = "Telefonos, computadoras y TV";
        datas2[1] = "Rick Gamser";
        datas2[2] = "Samsung";
        datas2[3] = "1806";
        datas2[4] = "3";
        
        
        System.out.println(empresaControl1.crear(datas2));
        System.out.println(empresaControl1.listar());
        
        System.out.println("-------------------- DATOS DE LA TERCERA EMPRESA --------------------");
        var empresaControl2 = new EmpresaControlador();
        var datas3 = new String[5];

        datas3[0] = "Ropas y Zapatos";
        datas3[1] = "Ana Isabel";
        datas3[2] = "Vans";
        datas3[3] = "1950";
        datas3[4] = "6";
        
        
        System.out.println(empresaControl2.crear(datas3));
        System.out.println(empresaControl2.listar());
        
        
    }
}
