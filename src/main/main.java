/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Vacunatorio.clases.*;
import Vacunatorio.dataClass.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luciano.echevarne
 */
public class main {
    public static void main(String[] args) {
        LaboratorioData labData = null;
        VacunaData vacData = null;
        try {
            Conexion con = new Conexion();
            labData = new LaboratorioData(con);
            vacData = new VacunaData(con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        //PRUEBAS -> Laboratorio LaboratorioData
//        Laboratorio lab, lab2;
//        lab = new Laboratorio ("Ruso","Rusia","Calle falsa 123",true);
//        lab2 = new Laboratorio ("Sarasa","Groenlandia","Calle fria 321",true);
        
//        labData.ingresarLaboratorio(lab);
//        labData.ingresarLaboratorio(lab2);
        
//        System.out.println("lab 1 creado desde main : "+ labData.buscarLaboratorio(lab.getIdLaboratorio()).getNombre());
//        System.out.println("lab 2 creado desde main : "+ labData.buscarLaboratorio(lab2.getIdLaboratorio()).getNombre());

//        System.out.println("lab extraido -> id 1 : "+ labData.buscarLaboratorio(1).getNombre());
//        System.out.println("lab extraido -> id 2 : "+ labData.buscarLaboratorio(2).getNombre());
//        lab2.setNombre("piripi");
//        labData.actualizarLaboratorio(lab2);
//        System.out.println("lab modificado id :" + lab2.getIdLaboratorio()+ " - nombre: "+ labData.buscarLaboratorio(lab2.getIdLaboratorio()).getNombre());
//        List<Laboratorio> listLab = new ArrayList();
//        listLab = labData.obtenerLaboratorios();
//        System.out.println("A continuacion todos los laboratorios dentro de la tabla");
//        for(Laboratorio lab3:listLab){
//            System.out.println("lab: "+lab3.getNombre()+" dir: "+lab3.getDireccion());
//        }

        
//        //PRUEBAS -> Vacuna VacunaData
//        Vacuna vac, vac2,vac3; 
//        vac = new Vacuna(labData.buscarLaboratorio(1),304,true);
//        vac2 = new Vacuna(labData.buscarLaboratorio(2),205,true);
//
//        vacData.ingresarVacuna(vac);
//        vacData.ingresarVacuna(vac2);
//            
//        System.out.println("Vacuna extraida 1: "+ vacData.buscarVacuna(vac.getIdVacuna()).getNroSerie());
//        System.out.println("Vucuna extraida 2: "+ vacData.buscarVacuna(vac2.getIdVacuna()).getNroSerie());
//        
//        System.out.println("Todas las vacunas: ");
//        for(Vacuna v:vacData.obtenerVacunas()){
//            System.out.println("lab: "+v.getLaboratorio().getNombre()+" - Vacuna: "+v.getNroSerie());
//        }
//        Laboratorio labAux = labData.buscarLaboratorio(2);
//        System.out.println("Vacunas filtradas por laboratorio "+labAux.getNombre()+": ");
//        for(Vacuna v:vacData.obtenerVacunasxLaboratorio(labAux.getIdLaboratorio())){
//            System.out.println("lab: "+v.getLaboratorio().getNombre()+" - Vacuna: "+v.getNroSerie());
//        }
//        vac = vacData.buscarVacuna(2);
//        System.out.println("Vacuna extraida, ID: "+vac.getIdVacuna()+" - Numero de serie: "+vac.getNroSerie());
//        vac.setNroSerie(504);
//        vacData.actualizarVacuna(vac);
//        vac2 = vacData.buscarVacuna(2);
//        System.out.println("Vacuna extraida, ID: "+vac2.getIdVacuna()+" - Numero de serie: "+vac2.getNroSerie()+" - estado: "+vac2.isEstado());
//        vacData.modificarEstado(2);
//        vac3 = vacData.buscarVacuna(2);
//        System.out.println("Vacuna extraida, ID: "+vac3.getIdVacuna()+" - Numero de serie: "+vac3.getNroSerie()+" - estado(MODIFICADO): "+vac3.isEstado());
        

    }
}


    
    