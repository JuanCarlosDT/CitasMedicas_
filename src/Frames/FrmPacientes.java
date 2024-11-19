package Frames;

import static citasmedicas.CItasMedicas.nombreUsuario;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.bson.Document;

public class FrmPacientes extends javax.swing.JFrame {

    public FrmPacientes() {
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Recursos/paciente.png")).getImage();
        this.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btnGencita = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmbDoctores = new javax.swing.JComboBox<>();
        cmbHoras = new javax.swing.JComboBox<>();
        cmbConsultorio = new javax.swing.JComboBox<>();
        lblConsultorio = new javax.swing.JLabel();
        lblConsultorio1 = new javax.swing.JLabel();
        lblConsultorio2 = new javax.swing.JLabel();
        lblConsultorio3 = new javax.swing.JLabel();
        cmbFecha = new com.toedter.calendar.JDateChooser();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cita Paciente");
        setResizable(false);

        bg.setBackground(new java.awt.Color(0, 153, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGencita.setBackground(new java.awt.Color(79, 175, 203));

        btnRegistrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrar.setText("REGISTRAR CITA");
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnGencitaLayout = new javax.swing.GroupLayout(btnGencita);
        btnGencita.setLayout(btnGencitaLayout);
        btnGencitaLayout.setHorizontalGroup(
            btnGencitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGencitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnGencitaLayout.setVerticalGroup(
            btnGencitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(btnGencita, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 220, 50));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        cmbDoctores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Martin Duarte", "Juan Borbon" }));
        cmbDoctores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctoresActionPerformed(evt);
            }
        });

        cmbHoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 AM", "10:00 AM", "12:00 PM", "2:00 PM" }));

        cmbConsultorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", " " }));

        lblConsultorio.setBackground(new java.awt.Color(0, 0, 0));
        lblConsultorio.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblConsultorio.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultorio.setText("Consultorio: ");

        lblConsultorio1.setBackground(new java.awt.Color(0, 0, 0));
        lblConsultorio1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblConsultorio1.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultorio1.setText("Fecha: ");

        lblConsultorio2.setBackground(new java.awt.Color(0, 0, 0));
        lblConsultorio2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblConsultorio2.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultorio2.setText("Hora: ");

        lblConsultorio3.setBackground(new java.awt.Color(0, 0, 0));
        lblConsultorio3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblConsultorio3.setForeground(new java.awt.Color(255, 255, 255));
        lblConsultorio3.setText("Doctor: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblConsultorio2)
                        .addComponent(lblConsultorio3)
                        .addComponent(lblConsultorio1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblConsultorio)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbDoctores, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbHoras, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cmbConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConsultorio)
                    .addComponent(cmbConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsultorio1)
                    .addComponent(cmbFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsultorio2)
                    .addComponent(cmbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsultorio3)
                    .addComponent(cmbDoctores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 350, 150));

        lblfondo.setBackground(new java.awt.Color(204, 255, 255));
        bg.add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        String consultorio = cmbConsultorio.getSelectedItem().toString();

        String hora = cmbHoras.getSelectedItem().toString();
        String doctor = cmbDoctores.getSelectedItem().toString();

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase database = mongoClient.getDatabase("consultorio");

        MongoCollection<Document> citas = database.getCollection("citas");

        Document cita = new Document();

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        cita.append("consultorio", consultorio);
        cita.append("hora", hora);
        cita.append("fecha", formatter.format(cmbFecha.getDate()));
        cita.append("doctor", doctor);
        cita.append("paciente", nombreUsuario);

        citas.insertOne(cita);

        mongoClient.close();

        JOptionPane.showMessageDialog(this, "Se registro correctamente");
    }//GEN-LAST:event_btnRegistrarMouseClicked

    private void cmbDoctoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDoctoresActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btnGencita;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JComboBox<String> cmbConsultorio;
    public javax.swing.JComboBox<String> cmbDoctores;
    private com.toedter.calendar.JDateChooser cmbFecha;
    private javax.swing.JComboBox<String> cmbHoras;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConsultorio;
    private javax.swing.JLabel lblConsultorio1;
    private javax.swing.JLabel lblConsultorio2;
    private javax.swing.JLabel lblConsultorio3;
    private javax.swing.JLabel lblfondo;
    // End of variables declaration//GEN-END:variables
}
