/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextu.buscador;

/**
 *
 * @author Fernandito
 */
public class Busqueda {
    
    private String texto;
    private String TipoDeContenidos="NoDefinidos";
    
    public Busqueda(String texto){
        
        this.texto=texto;
        
    }
    public Busqueda(String texto, String TipoDeContenidos){
        
        this.texto=texto;
        this.TipoDeContenidos=TipoDeContenidos;
        
    }
    public ResultadoDeBusqueda buscar(){
        
        return  new ResultadoDeBusqueda();
        
    }
    
}
