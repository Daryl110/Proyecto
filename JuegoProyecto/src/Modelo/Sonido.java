/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.FrmPrincipal;
import java.applet.AudioClip;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Nicolas Davila
 */
public class Sonido extends Thread {

    public void ponerMusica(FrmPrincipal ventana) {
        if (ventana.isActive()) {
            try {
                FileInputStream fis;
                Player player;
                fis = new FileInputStream("C:\\Users\\Nicolas Davila\\Documents\\GitHub\\Proyecto\\JuegoProyecto\\src\\Recursos\\Sonidos\\Música de League of Legends Bit Rush.mp3");
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            ponerMusica(ventana);
        } else {
            return;
        }

    }
    public void pararMusica(Player player){
        
    }

}
