/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Empresa;

/**
 *
 * @author ochoa
 */
public interface EmpresaService {
     public abstract void crear(Empresa empresa);
    public abstract void modificar(int codigo,Empresa empresadoModificado);
    public abstract void eliminar(int codigo);
    public abstract List<Empresa> listar();
}
