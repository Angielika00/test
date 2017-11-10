/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author angie
 */
public class PruebaSlack {
    
    private String descripcion;
    private String nombreCanal;
    private int invitados;
    private String mensajes;

    public PruebaSlack() {
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreCanal() {
        return nombreCanal;
    }

    public void setNombreCanal(String nombreCanal) {
        this.nombreCanal = nombreCanal;
    }

    public int getInvitados() {
        return invitados;
    }

    public void setInvitados(int invitados) {
        this.invitados = invitados;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }
    
    public imprimir (String mensajes) {
        System.out.println(mensajes);  // esto fue lo que agregue para verrificar el commit
    }
    
    public mensajesImportantes (String msj) {
        System.out.println(msj);  // esto fue lo que agregue para verrificar el commit
    }
    
    
    
    Error
    
    
    
    
}
