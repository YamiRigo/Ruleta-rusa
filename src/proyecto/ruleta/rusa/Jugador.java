/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ruleta.rusa;

/**
 *
 * @author yamila
 */
public class Jugador {
    private String nombre;
    private Integer id;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(String nombre, Integer id, boolean mojado) {
        this.nombre = nombre;
        this.id = id;
        this.mojado = mojado;
    }

    public Jugador(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    public boolean disparo(Revolver_de_agua r) {
        Boolean verificacion = r.mojar();
        if (verificacion) {
            mojado = true;
            verificacion = false;
            return mojado;
        } else {
            mojado = false;
            r.siguienteChorro();
            return mojado;
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre = " + nombre + ", id = " + id + ", mojado = " + mojado + '}';
    }


}
