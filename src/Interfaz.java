import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JTabbedPane tabbedPane1;
    private JPanel Ejercicio;
    private JButton btnIniciar;
    private JTextArea txtArea1;

    private Busqueda b1;

    public Interfaz(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Ejercicio);
        this.pack();
        b1=new Busqueda();


        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txtArea1.setText(b1.TiempoBusqueda());

            }
        });
    }

}
