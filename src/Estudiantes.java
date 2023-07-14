import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeListener;
import java.io.*;

public class Estudiantes extends JFrame{
    String codigo="", cedula="", nombres=""
            , apellidos="" ,casadosi="",casadono=""
            ,rojo="" ,verde="" , ninguno="",
            anio="", mes="", dia="" ,signo="";
    private JCheckBox checkBox1, checkBox2, checkBox3;

    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JPanel pantalla;
    private JTextField TCodigo;
    private JTextField TCedula;
    private JTextField TNombres;
    private JComboBox TSigno;
    private JComboBox TAnio;
    private JComboBox TMes;
    private JComboBox TDia;
    private JButton BCargar;
    private JButton BGuardar;
    private JButton BSiguiente;
    private JButton BAnterior;
    private JLabel Colortexto;
    private JLabel casdaotexto;
    private JLabel codigotexto;
    private JLabel cedulatexto;
    private JLabel nombrestexto;
    private JLabel signotexto;
    private JLabel textoregistro1;
    private JLabel textoregistro2;
    private JTextField TApellidos;
    private JLabel apellidostexto;

    public Estudiantes() {
        BCargar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //CAMBIAR LA DIRECCION PARA QUE funcione
                    File archivo = new File("C://Users//POO//Desktop//xd.dat");
                    FileInputStream fis = new FileInputStream(archivo);
                    DataInputStream dis = new DataInputStream(fis);
                    // Lee datos del archivo
                    String linea;
                    while ((linea = dis.readLine()) != null) {
                        System.out.println(linea);
                    }
                    dis.close();
                } catch (IOException x) {
                    System.out.println("Error al leer el archivo .dat");
                }
            }
        });
        BGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    //CAMBIAR LA DIRECCION PARA QUE funcione
                    File archivo = new File("C://Users//POO//Desktop//xd.dat");
                    FileWriter fw = new FileWriter(archivo);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter salida = new PrintWriter(bw);
                    // Escribe los datos al archivo
                    salida.println("Codigo: "+ codigo +"\n");
                    salida.println("Cedula: "+ cedula +"\n");
                    salida.println("Nombres: "+ nombres +"\n");
                    salida.println("Apellido: "+ apellidos +"\n");
                    salida.println("Signo: "+ signo +"\n");
                    salida.println("Fecha de nacimiento: "+ anio +" "+mes+" "+ dia+"\n");
                    salida.println("Color favorito: "+ rojo + verde + ninguno +"\n");
                    salida.println("Casado: "+ casadosi + casadono +"\n");
                    salida.close();
                } catch (IOException x) {
                    System.out.println("Error al crear el archivo .dat");
                }
            }
        });
        BSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        BAnterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        TAnio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anio = TAnio.getName();
            }
        });
        TMes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mes = TMes.getName();
            }
        });
        TDia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dia=TDia.getName();
            }
        });
        TCodigo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codigo = TCodigo.getText();
            }
        });
        TCedula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cedula = TCedula.getText();
            }
        });
        TNombres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombres=TNombres.getText();
            }
        });
        TApellidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apellidos=TApellidos.getText();
            }
        });
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                casadosi = "si esta casado";
            }
        });
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                casadono = "no esta casado";
            }
        });
        checkBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rojo="color favorito rojo";
            }
        });
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verde="color favorito verde";
            }
        });
        checkBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ninguno="no tiene color favorito";
            }
        });


        TSigno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signo = TSigno.getName();
            }
        });
    }

    public static void main(String[] args){
        JFrame Panel = new JFrame("Estudiantes");
        Panel.setContentPane(new Estudiantes().pantalla);
        Panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel.pack();
        Panel.setVisible(true);
    }
}
