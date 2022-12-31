import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Estudiantes extends JFrame {



    private JPanel panel;
    private JTextField txtId;
    private JTextField txtApellido;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtCelular;
    private JTextField txtCarrera;
    private JButton btIngresar;
    private JList lista;


    public Estudiantes() {
        btIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("agregar a la lista a Estudiante ID: " + txtId.getText()+ "  " + txtNombre.getText() + " ");
            }
        });
    }

    public static void main(String[] args) {
        Estudiantes f = new Estudiantes();
        f.setContentPane(new Estudiantes().panel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.pack();

    }
}



