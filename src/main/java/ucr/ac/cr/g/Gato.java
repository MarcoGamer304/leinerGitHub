package ucr.ac.cr.g;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Marco
 */
public class Gato {

    int juegoGato[][];
    int turno = 1;
    int x, y;
    boolean victoria;
    
    public Gato() {
        juegoGato = new int[3][3];
    }

    public void llenarMatriz() {
        //izquierda
        if (x >= 15 && x <= 164 && y >= 37 && y <= 178) {
            if (juegoGato[0][0] == 0) {
                if (turno == 1) {
                    juegoGato[0][0] = 1;

                }
                if (turno == 2) {
                    juegoGato[0][0] = 2;
                }
            }
        }
        if (x >= 15 && x <= 164 && y >= 202 && y <= 346) {
            if (juegoGato[1][0] == 0) {
                if (turno == 1) {
                    juegoGato[1][0] = 1;
                }
                if (turno == 2) {
                    juegoGato[1][0] = 2;
                }
            }

        }
        if (x >= 15 && x <= 164 && y >= 370 && y <= 512) {
            if (juegoGato[2][0] == 0) {
                if (turno == 1) {
                    juegoGato[2][0] = 1;
                }
                if (turno == 2) {
                    juegoGato[2][0] = 2;
                }
            }

        }
        //centro
        if (x >= 182 && x <= 330 && y >= 37 && y <= 178) {
            if (juegoGato[0][1] == 0) {
                if (turno == 1) {
                    juegoGato[0][1] = 1;
                }
                if (turno == 2) {
                    juegoGato[0][1] = 2;
                }
            }

        }
        if (x >= 182 && x <= 330 && y >= 202 && y <= 346) {
            if (juegoGato[1][1] == 0) {
                if (turno == 1) {
                    juegoGato[1][1] = 1;
                }
                if (turno == 2) {
                    juegoGato[1][1] = 2;
                }
            }

        }

        if (x >= 182 && x <= 330 && y >= 370 && y <= 512) {
            if (juegoGato[2][1] == 0) {
                if (turno == 1) {
                    juegoGato[2][1] = 1;
                }
                if (turno == 2) {
                    juegoGato[2][1] = 2;
                }
            }

        }
        //derecha
        if (x >= 347 && x <= 495 && y >= 37 && y <= 178) {
            if (juegoGato[0][2] == 0) {
                if (turno == 1) {
                    juegoGato[0][2] = 1;
                }
                if (turno == 2) {
                    juegoGato[0][2] = 2;
                }
            }

        }
        if (x >= 347 && x <= 495 && y >= 202 && y <= 346) {
            if (juegoGato[1][2] == 0) {
                if (turno == 1) {
                    juegoGato[1][2] = 1;
                }
                if (turno == 2) {
                    juegoGato[1][2] = 2;
                }
            }

        }
        if (x >= 347 && x <= 495 && y >= 370 && y <= 512) {
            if (juegoGato[2][2] == 0) {
                if (turno == 1) {
                    juegoGato[2][2] = 1;
                }
                if (turno == 2) {
                    juegoGato[2][2] = 2;
                }
            }

        }

    }

    public void verificarFila() {

        if (juegoGato[0][0] == turno && juegoGato[0][1] == turno && juegoGato[0][2] == turno) {
            victoria = true;
        }
        if (juegoGato[1][0] == turno && juegoGato[1][1] == turno && juegoGato[1][2] == turno) {
            victoria = true;
        }
        if (juegoGato[2][0] == turno && juegoGato[2][1] == turno && juegoGato[2][2] == turno) {
            victoria = true;
        }

    }

    public void verificarColumna() {

        if (juegoGato[0][0] == turno && juegoGato[1][0] == turno && juegoGato[2][0] == turno) {
            victoria = true;
        }
        if (juegoGato[0][1] == turno && juegoGato[1][1] == turno && juegoGato[2][1] == turno) {
            victoria = true;
        }
        if (juegoGato[0][2] == turno && juegoGato[1][2] == turno && juegoGato[2][2] == turno) {
            victoria = true;
        }

    }

    public void verificarDiagonales() {

        if (juegoGato[0][0] == turno && juegoGato[1][1] == turno && juegoGato[2][2] == turno) {
            victoria = true;
        }
        if (juegoGato[0][2] == turno && juegoGato[1][1] == turno && juegoGato[2][0] == turno) {
            victoria = true;
        }

    }

    public void victoria() {
        if (victoria == true) {
            JOptionPane.showMessageDialog(null,"Victoria del jugador " + turno);
            System.exit(0);
        }
    }

}
