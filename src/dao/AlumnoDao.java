/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import entity.Alumno;
import java.util.ArrayList;
/**
 *
 * @author Alumno
 */
public class AlumnoDao {
    private List<Alumno> lista;
    
    public AlumnoDao(){
        lista = new ArrayList<>(); 
    }
    
    public void add(Alumno alum){
        lista.add(alum);
    }

    public List<Alumno> getLista() {
        return lista;
    }
    
    public void actualizar(int index, Alumno alum) {
        lista.get(index).setNombre(alum.getNombre());
        lista.get(index).setApellidos(alum.getApellidos());
        lista.get(index).setCarrera(alum.getCarrera());
        lista.get(index).setCiclo(alum.getCiclo());
        lista.get(index).setTurno(alum.getTurno());
        lista.get(index).setFecha(alum.getFecha());
        lista.get(index).setModalidad(alum.getModalidad());
    }
    
    public void eliminar(int index){
        lista.remove(index);
    }
    

}