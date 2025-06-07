
package sistemachamaae;

import view.telaInicial;
public class SistemaChamaAe {

    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new telaInicial().setVisible(true);   
            }
        });
    }

    }
 
