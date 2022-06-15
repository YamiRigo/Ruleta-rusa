/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ruleta.rusa;

import java.util.ArrayList;
/**
 *
 * @author yamila
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver_de_agua revolver;

    public Juego() {
        this.jugadores = new ArrayList();
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver_de_agua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
    
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver_de_agua getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver_de_agua revolver) {
        this.revolver = revolver;
    }

    public void llenarJuego(ArrayList<Jugador> jg, Revolver_de_agua r) {
        jugadores = jg;
        revolver = r;
    }

    public void ronda(Revolver_de_agua r) {
        int cont = 0;
        for (Jugador aux : jugadores) {
            System.out.print("[Posicion_actual: "+r.getPosicion_actual()+"]");
            System.out.print("El " + aux.getNombre() + " " + aux.getId() + " se apunta y dispara");
            if (aux.disparo(revolver) == true) {
                System.out.print(" ...Mojado\n");
                break;
            } else {
                System.out.print(" ...se Salvo\n");
                cont++;
            }
        }
        if (cont == jugadores.size()) {
            ronda(r);
        }
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores = " + jugadores + ", revolver = " + revolver + '}';
    }


}
