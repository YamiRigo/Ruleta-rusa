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
public class Revolver_de_agua {
    private Integer posicion_actual;
    private Integer posicion_agua;

    public Revolver_de_agua() {
    }
    
    public Revolver_de_agua(Integer posicion_actual, Integer posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }

    public Integer getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(Integer posicion_actual) {
        this.posicion_actual = posicion_actual;
    }
    
     public Integer getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agus(Integer posicion_agua) {
        this.posicion_agua = posicion_agua;
    }


    public Revolver_de_agua llenarRevolver() {
        posicion_actual= (int)(Math.random()*6+1);
        posicion_agua=  (int)(Math.random()*6+1);
        return new Revolver_de_agua(posicion_actual, posicion_agua);
    }
    
    public boolean mojar(){
        if(posicion_actual == posicion_agua)
        {
            return true;
        }
        return false;
    }
    
    public void siguienteChorro(){
       if(this.posicion_actual == 6){
           this.posicion_actual = 1;
       }else{
           this.posicion_actual = posicion_actual+1;
       }
    }
    
     @Override
    public String toString() {
        return "Revolver_de_agua{" + "posicion_actual=" + posicion_actual + ", posicion_agua=" + posicion_agua + '}';
    }


}
