/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Empresa;
import servicio.EmpresaServiceImpl;


/**
 *
 * @author ochoa
 */
public class EmpresaControlador {
     private final EmpresaServiceImpl empresaServi;

    public EmpresaControlador() {
        this.empresaServi = new EmpresaServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "";
        var productoCreado = data[0];
        var creadorEmpresa = data[1];
        var nombreEmpresa = data[2];
        var yearCreado = Integer.valueOf(data[3]).intValue();
        var codigo = Integer.valueOf(data[4]).intValue();
        
        
        if(codigo<0){
            retorno = "ingreso del codigo empresa es incorrecto";
        }else{
            var empresa = new Empresa(productoCreado, creadorEmpresa, nombreEmpresa, yearCreado, codigo);
            retorno += "La empresa " + empresa.getNombreEmpresa() + " fue creado correctamente";
            this.empresaServi.crear(empresa);
        }
        
        
                return retorno;
    }

    
    public List<Empresa> listar() {

        return this.empresaServi.listar();

    }
    
}
