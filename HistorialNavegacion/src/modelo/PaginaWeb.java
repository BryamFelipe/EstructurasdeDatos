/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bryam
 */
public class PaginaWeb {
    String pagina;
    PaginaWeb atras;
    PaginaWeb siguiente;
    public PaginaWeb(String pagina) {
        this.pagina = pagina;
        this.atras = null;
        this.siguiente = null;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }
    
}
