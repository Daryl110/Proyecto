/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.DAO;
import Modelo.Juego;
import Modelo.Puntuacion;
import Vista.Login.pnlIniciarSesion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PCSHOP
 */
public class CtlJuego {

    private final DAO dao;
    private final CtlDAO controladorDAO;
    ArrayList<Puntuacion> listaPuntuacio = new ArrayList<>();
    Puntuacion punta = new Puntuacion();

    public CtlJuego() {
        dao = new DAO();
        controladorDAO = new CtlDAO();
    }
    
    public boolean validarJugador(String cedula,String idJuego){
        ResultSet rb = dao.traerListar("resultado");
        try {
            while (rb.next()) {
                if (rb.getString("cedula").equalsIgnoreCase(cedula) && rb.getString("idJuego").equalsIgnoreCase(idJuego)) {
                    return false;
                }
            }
        } catch (SQLException e) {
            return false;
        }
        return true;
    }

    public void eliminarUltimoJuego(){
        String ultimoId = controladorDAO.getUltimoId("juego", "idJuego");
        dao.eliminar("juego", "idJuego", ultimoId);
    }
    
    public DefaultTableModel listarPuntuacion(int cedula) {

        String[] nombreColumnas = {"Nombre del juego", "Puntuación", "Fecha de juego"};

        ArrayList<String> puntua = new ArrayList<>();

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        ResultSet resultado = dao.traerBuscar("resultado", "cedula", cedula + "");

        try {
            while (resultado.next()) {
                puntua.add(traerNombreJuego(resultado.getString("idJuego")));
                puntua.add(resultado.getString("puntaje"));
                puntua.add(traerDato(resultado.getString("idJuego"), "fechaJuego"));
            }
        } catch (SQLException e) {
            
        }

        int gdeveinte = 0, contador = 0;
        for (String puntua1 : puntua) {
            if (contador == 29) {
                gdeveinte++;
                contador = -1;
            }
            contador++;
        }

        int suma = 0;
        contador = 0;
        int contador1 = 30;
        int aux = 0;

        for (int i = 0; i < gdeveinte; i++) {
            for (int j = contador; j < contador1; j++) {
                if (j == 1 || aux == j - 3) {
                    aux = j;
                    suma += Integer.parseInt(puntua.get(j));
                }
                if (j == contador1 - 2) {
                    model.addRow(new Object[]{puntua.get(contador1 - 3), suma, puntua.get(contador1 - 1)});
                }
            }
            contador += 30;
            contador1 += 30;
        }

        return model;
    }

    public boolean solicitudRegistro(int numeroJugadores, String nombreJuego, String fecha) {

        if (dao.validarCampo(nombreJuego, "nombreJuego", "juego")) {
            return false;
        }

        Juego juego = new Juego(numeroJugadores, nombreJuego, fecha);

        return controladorDAO.solicitudRegistro(juego, "juego");
    }

    public String traerIdJuego(String nombreJuego) {
        return dao.traerDato("juego", "idJuego", "nombreJuego", nombreJuego);
    }

    public String traerNombreJuego(String idJuego) {
        return dao.traerDato("juego", "nombreJuego", "idJuego", idJuego);
    }

    public String traerDato(String idJuego, String columna) {
        return dao.traerDato("juego", columna, "idJuego", idJuego);
    }

    public boolean registrarPreguntasJuego(int[] idPreguntas, int[] puntajes, int idJuego, int cedula) {
        for (int i = 0; i < 10; i++) {
            String sentenciaSQL = "INSERT INTO resultado(idPregunta,puntaje,cedula,idJuego) VALUES(" + idPreguntas[i] + "," + puntajes[i] + "," + cedula + "," + idJuego + ");";

            if (!dao.registrarYModificar(sentenciaSQL)) {
                return false;
            }
        }
        return true;

    }

    public DefaultTableModel listarPuntuacion(String nombreJuego) {

        String[] nombreColumnas = {"Cedula", "Nombre Usuario", "Puntaje"};

        DefaultTableModel model = new DefaultTableModel(new Object[][]{}, nombreColumnas);

        for (int i = 0; i < pnlIniciarSesion.listaCedulas.size(); i++) {
            ResultSet resultado = dao.traerBuscarAvanzado("resultado", "idJuego", dao.traerDato("juego", "idJuego", "nombreJuego", nombreJuego), "cedula", pnlIniciarSesion.listaCedulas.get(i));
            int suma = 0;
            try {
                while (resultado.next()) {
                    suma = suma + resultado.getInt("puntaje");
                }
            } catch (SQLException e) {
            }
            punta = new Puntuacion(pnlIniciarSesion.listaCedulas.get(i), suma, dao.traerDato("usuario", "nombreUsu", "cedula", pnlIniciarSesion.listaCedulas.get(i) + ""));
            listaPuntuacio.add(punta);
        }

        for (int x = 0; x < listaPuntuacio.size(); x++) {
            model.addRow(new Object[]{listaPuntuacio.get(x).getCedula(), listaPuntuacio.get(x).getNombreUsuario(), listaPuntuacio.get(x).getPuntuacion()});
        }
        pnlIniciarSesion.listaCedulas = new ArrayList<>();
        return model;

    }
}
