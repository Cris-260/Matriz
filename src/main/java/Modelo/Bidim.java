package Modelo;

import java.util.Random;
import javax.swing.JOptionPane;


public class Bidim {
    int m[][];

    public Bidim() {
        m=new int[3][3];
        Random random=new Random();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=random.nextInt(9+1);
            }
        }
    }
    public Bidim(int p) {
        m=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                m[i][j]=Integer.parseInt(JOptionPane.showInputDialog("m["+i+"]["+j+"]:"));
            }
        }
    }
    public Bidim(Bidim p,Bidim q) {
        m=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    m[i][j]+=p.m[i][k]*q.m[k][j];
                }
                
            }
        }
    }
    public void impri(){
        String salida="los datos del arreglo son\n";
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                salida+=m[i][j]+"   ";
            }
            salida+="\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}

