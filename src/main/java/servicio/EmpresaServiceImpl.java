/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Empresa;

/**
 *
 * @author ochoa
 */
public class EmpresaServiceImpl implements EmpresaService{

    private List<Empresa> empresaList;
    
    public EmpresaServiceImpl() {

        this.empresaList = new ArrayList<>();

    }
    
    @Override
    public void crear(Empresa empresa) {
        this.empresaList.add(empresa);
    }

    @Override
    public void modificar(int codigo, Empresa empresadoModificado) {
        
         var indice = 0;
        this.empresaList.set(indice, empresadoModificado);
       
    }

    @Override
    public void eliminar(int codigo) {  
               this.empresaList.remove(codigo);           
        }
    

    @Override
    public List<Empresa> listar() {

        return this.empresaList;
    }
    
}
