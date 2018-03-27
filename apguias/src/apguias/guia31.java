/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apguias;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class guia31{

    int dato = 0, bat = 0, pixP = 0, pixF = 0, dato9 = 0;
    double dato2 = 0, dato4 = 0, dato7 = 0;
    String dato1 = "", dato3 = "", dato5 = "", dato6 = "", dato8 = "", marca;
    int sumapuntaje = 0;
    int puntuacion=0;
            
    
    
    public guia31 () {
        initComponents();
        
        //this.getContentPane().setBackground(Color.orange);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngCamaras = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtCpu = new javax.swing.JTextField();
        jtRam = new javax.swing.JTextField();
        jtTam1 = new javax.swing.JTextField();
        jtGarantia = new javax.swing.JTextField();
        cmbMarca = new javax.swing.JComboBox<>();
        rbtnPrincipal = new javax.swing.JRadioButton();
        rbtnSecundaria = new javax.swing.JRadioButton();
        rbtnFlash = new javax.swing.JRadioButton();
        btnEjecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtCampo = new javax.swing.JTextArea();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMegapixeles = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGpu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtBat = new javax.swing.JTextField();
        txtMegapixeles1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Cpu numero de nucleos");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Light", 2, 18)); // NOI18N
        jLabel2.setText("Puntaje de Moviles");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Tamano de pantallas");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Cantidad de ram");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Tiempo de garantia");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Precio");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Marca");

        jtCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCpuActionPerformed(evt);
            }
        });
        jtCpu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCpuKeyTyped(evt);
            }
        });

        jtRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRamActionPerformed(evt);
            }
        });
        jtRam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRamKeyTyped(evt);
            }
        });

        jtTam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTam1ActionPerformed(evt);
            }
        });
        jtTam1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTam1KeyTyped(evt);
            }
        });

        jtGarantia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtGarantiaActionPerformed(evt);
            }
        });
        jtGarantia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtGarantiaKeyTyped(evt);
            }
        });

        cmbMarca.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        cmbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nexus", "PIixie", "Lenovo", "Huawei", "Sony", "Apple", "Samsung", "Alcatel", "Lg", "Otr" }));
        cmbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMarcaActionPerformed(evt);
            }
        });

        rbtnPrincipal.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnPrincipal.setText("Principal");

        rbtnSecundaria.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnSecundaria.setText("Secundaria");

        rbtnFlash.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        rbtnFlash.setText("Flash");

        btnEjecutar.setBackground(new java.awt.Color(51, 51, 255));
        btnEjecutar.setFont(new java.awt.Font("Traditional Arabic", 1, 12)); // NOI18N
        btnEjecutar.setText("EJECUTAR");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        jtxtCampo.setEditable(false);
        jtxtCampo.setColumns(20);
        jtxtCampo.setRows(5);
        jScrollPane1.setViewportView(jtxtCampo);

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Camaras:");

        txtMegapixeles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMegapixelesActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("MegaPixeles principal :");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("GPU:");

        txtGpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGpuActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("capacidad de batateria  mA.");

        txtBat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatActionPerformed(evt);
            }
        });
        txtBat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBatKeyTyped(evt);
            }
        });

        txtMegapixeles1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMegapixeles1ActionPerformed(evt);
            }
        });
        txtMegapixeles1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMegapixeles1KeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("MegaPixeles frontal :");

        jButton1.setBackground(new java.awt.Color(204, 255, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setText("REGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton2.setText("SALIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(jtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtRam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMegapixeles1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbtnPrincipal)
                                .addGap(51, 51, 51)
                                .addComponent(rbtnSecundaria)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEjecutar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(rbtnFlash)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtBat, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(jtTam1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(jtGarantia, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(txtGpu))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMegapixeles, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jtTam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtCpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jtGarantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtBat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGpu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnPrincipal)
                    .addComponent(rbtnSecundaria)
                    .addComponent(rbtnFlash))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMegapixeles1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMegapixeles, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnEjecutar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(12, 12, 12))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCpuActionPerformed
       
        
    }//GEN-LAST:event_jtCpuActionPerformed

    private void jtRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRamActionPerformed

    private void jtTam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTam1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTam1ActionPerformed

    private void jtGarantiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtGarantiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtGarantiaActionPerformed

    private void cmbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMarcaActionPerformed

    private void jtCpuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCpuKeyTyped
        char k = evt.getKeyChar();

        dato5 = dato5 + k;
        dato = Integer.parseInt(dato5);
        
        if (dato > 12) {
            JOptionPane.showMessageDialog(null, "NO se permite ingreso mayor a 12");
            jtCpu.setText(null);
            evt.consume();
            dato = 0;
            dato5 = "";
        }

        
       
        if(k<'0' || k>'9'){
            
            evt.consume();       
        }
         int limite=2;
        if(jtCpu.getText().length()==limite){
            evt.consume();
        } 
      
        if (dato == 2) {
            puntuacion = 0;
        }
        if (dato == 4) {
            puntuacion = 1;
        }
        if (dato == 6) {
            puntuacion = 2;
        }
        if (dato == 8) {
            puntuacion = 3;
        }
        sumapuntaje = sumapuntaje + puntuacion;    
    }//GEN-LAST:event_jtCpuKeyTyped

    public int getBat() {
        return bat;
    }

    public void setBat(int bat) {
        this.bat = bat;
    }

    public int getDato9() {
        return dato9;
    }

    public void setDato9(int dato9) {
        this.dato9 = dato9;
    }

  

    private void jtTam1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTam1KeyTyped
        char k = evt.getKeyChar();

        dato1 = dato1 + k;
        dato2 = Double.parseDouble(dato1);

        if (dato2 < 3.0 || dato2 > 6.7) {
            JOptionPane.showMessageDialog(null, "NO se permite ingreso mayor a 6.7 ni menor a 3.0");
            jtTam1.setText(null);
            evt.consume();
            dato2 = 0;
            dato1 = "";
        }

        if ((k < '0' || k > '9') && k != '.') {
            evt.consume();

        }
        int limite = 3;
        if (jtTam1.getText().length() == limite) {
            evt.consume();

        }

    }//GEN-LAST:event_jtTam1KeyTyped

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void jtRamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRamKeyTyped
      
        char k = evt.getKeyChar();

        dato3 = dato3 + k;
        dato4 = Double.parseDouble(dato3);

        if (dato4 < 0.5 || dato4 > 6.0) {
            JOptionPane.showMessageDialog(null, "NO se permite ingreso mayor a 6.0 ni menor a 0.5");
            jtRam.setText(null);
            evt.consume();
            dato4 = 0;
            dato3 = "";
        }

        if ((k < '0' || k > '9') && k != '.') {
            evt.consume();

        }
        int limite = 3;
        if (jtRam.getText().length() == limite) {
            evt.consume();
        }
   if (dato4 <= 1) {
            puntuacion = 0;
        }
        if (dato4 > 1 || dato4 <= 2) {
            puntuacion = 2;
        }
        if (dato4 > 2 || dato4 <= 4) {
            puntuacion = 4;
        }
        if (dato4 > 4) {
            puntuacion = 6;
        }
        sumapuntaje = sumapuntaje +puntuacion;
    }//GEN-LAST:event_jtRamKeyTyped

    private void jtGarantiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtGarantiaKeyTyped
      
        char k=evt.getKeyChar();
        
        
        dato6=dato6+k;
        dato9=Integer.parseInt(dato6);
        if(dato9>24){
            JOptionPane.showMessageDialog(null,"NO se permite ingreso mayor a 24");
            jtGarantia.setText(null);
            evt.consume();
            dato9=0;
            dato6="";
        }
        
        
       
        if(k<'0' || k>'9'){
            
            evt.consume();
            
        }
         int limite=2;
        if(jtGarantia.getText().length()==limite){
            evt.consume();
        }
  if (dato9 <= 3) {
            puntuacion = 1;

        }
        if (dato9 > 3 || dato9 < 6) {
            puntuacion = 2;

        }
        if (dato9 > 6) {
            puntuacion = 3;
        }
        sumapuntaje = sumapuntaje + puntuacion;
    }//GEN-LAST:event_jtGarantiaKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
         char k=evt.getKeyChar();
         
         dato8=dato8+k;
        dato7=Double.parseDouble(dato8);
        
        if(dato7<0.01 || dato7>999.99){
            JOptionPane.showMessageDialog(null,"NO se permite ingreso mayor a 999.99 ni menor a 0.01");
            txtPrecio.setText(null);
            evt.consume();
            dato7=0;
            dato8="";
        }
         
         if((k<'0' || k>'9') && k!='.'){
            evt.consume();

        }
         int limite=6;
        if(txtPrecio.getText().length()==limite){
            evt.consume();
        }
         if (dato7 < 100) {
            puntuacion = 2;
        }
        if (dato7 >= 100 || dato7 <= 350) {
            puntuacion = 3;
        }
        if (dato7 > 350) {
            puntuacion= 4;
        }
        sumapuntaje = sumapuntaje + puntuacion;
    }//GEN-LAST:event_txtPrecioKeyTyped

   public int getPixP() {
        return pixP;
    }

    public void setPixP(int pixP) {
        this.pixP = pixP;
    }

    public int getPixF() {
        return pixF;
    }

    public void setPixF(int pixF) {
        this.pixF = pixF;
    }

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
     
        if (marca.equals("Nexus") || marca.equals("Google") || marca.equals("Lenovo") || marca.equals("Huawei") || marca.equals("Sony") || marca.equals("Apple")) {
            puntuacion = 4;
        }

        if (marca.equals("Samsung") || marca.equals("Alcatel") || marca.equals("Lg")) {
            puntuacion = 3;
        }
        if (marca.equals("Otro")) {
            puntuacion = 2;
        }
        
        sumapuntaje = sumapuntaje + puntuacion;
        
        
        String camara="";
       marca=String.valueOf((cmbMarca.getSelectedItem()));
    
       if(rbtnFlash.isSelected()){
           camara=camara+"Flash ";
       }
         if(rbtnPrincipal.isSelected()){
           camara=camara+"Principal ";
       } if(rbtnSecundaria.isSelected()){
           camara=camara+"Secundaria ";
       }
       
       
        jtxtCampo.setText("el numero del cpu es:"+dato+"\n"+"el tamano de la pantalla es:"+dato2+"\n"+
            "la cantidad de ram es:"+dato4+"\n"+"el numero de garantia es:"+dato6+" meses\n"+"el precio es de: $"+txtPrecio.getText()+"\n"+"marca:"+cmbMarca.getSelectedItem()+"\n"+"Posee camara:"+camara+
                        " de"+txtMegapixeles1.getText()+" Megapixeles y una secundaria de "+txtMegapixeles.getText()+" Megapixeles "+"\n"+"el puntaje del movil es "+sumapuntaje);
        
        if (sumapuntaje<8) {
           jtxtCampo.setText("el numero del cpu es:"+dato+"\n"+"el tamano de la pantalla es:"+dato2+"\n"+
            "la cantidad de ram es:"+dato4+"\n"+"el numero de garantia es:"+dato6+" meses\n"+"el precio es de: $"+txtPrecio.getText()+"\n"+"marca:"+cmbMarca.getSelectedItem()+"\n"+"Posee camara:"+camara+
                        " de"+txtMegapixeles1.getText()+" Megapixeles y una secundaria de "+txtMegapixeles.getText()+" Megapixeles "+"\n"+"el puntaje del movil es "+sumapuntaje+"\n"+"NO es buena inversion");
          
        }
        if (sumapuntaje>7 || sumapuntaje<15) {
           jtxtCampo.setText("el numero del cpu es:"+dato+"\n"+"el tamano de la pantalla es:"+dato2+"\n"+
            "la cantidad de ram es:"+dato4+"\n"+"el numero de garantia es:"+dato6+" meses\n"+"el precio es de: $"+txtPrecio.getText()+"\n"+"marca:"+cmbMarca.getSelectedItem()+"\n"+"Posee camara:"+camara+
                        " de"+txtMegapixeles1.getText()+" Megapixeles y una secundaria de "+txtMegapixeles.getText()+" Megapixeles "+"\n"+"el puntaje del movil es "+sumapuntaje+"\n"+"Es inversion de riesgo");
            
        }
        
        if (sumapuntaje>14 || sumapuntaje<22) {
             jtxtCampo.setText("el numero del cpu es:"+dato+"\n"+"el tamano de la pantalla es:"+dato2+"\n"+
            "la cantidad de ram es:"+dato4+"\n"+"el numero de garantia es:"+dato6+" meses\n"+"el precio es de: $"+txtPrecio.getText()+"\n"+"marca:"+cmbMarca.getSelectedItem()+"\n"+"Posee camara:"+camara+
                        " de"+txtMegapixeles1.getText()+" Megapixeles y una secundaria de "+txtMegapixeles.getText()+" Megapixeles "+"\n"+"el puntaje del movil es "+sumapuntaje+"\n"+"Es inversion viable");
            
        }
        if (sumapuntaje>21) {
            jtxtCampo.setText("el numero del cpu es:"+dato+"\n"+"el tamano de la pantalla es:"+dato2+"\n"+
            "la cantidad de ram es:"+dato4+"\n"+"el numero de garantia es:"+dato6+" meses\n"+"el precio es de: $"+txtPrecio.getText()+"\n"+"marca:"+cmbMarca.getSelectedItem()+"\n"+"Posee camara:"+camara+
                        " de"+txtMegapixeles1.getText()+" Megapixeles y una secundaria de "+txtMegapixeles.getText()+" Megapixeles "+"\n"+"el puntaje del movil es "+sumapuntaje+"\n"+"Es buena inversion");
             
        }
    }//GEN-LAST:event_btnEjecutarActionPerformed

   

    

    private void txtGpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGpuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGpuActionPerformed

    private void txtBatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatActionPerformed
     
    }//GEN-LAST:event_txtBatActionPerformed

    private void txtBatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatKeyTyped

    private void txtMegapixelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMegapixelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMegapixelesActionPerformed

    private void txtMegapixeles1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMegapixeles1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMegapixeles1ActionPerformed

    private void txtMegapixeles1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMegapixeles1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMegapixeles1KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guia31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guia31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guia31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guia31.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guia31().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEjecutar;
    private javax.swing.ButtonGroup btngCamaras;
    private javax.swing.JComboBox<String> cmbMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtCpu;
    private javax.swing.JTextField jtGarantia;
    private javax.swing.JTextField jtRam;
    private javax.swing.JTextField jtTam1;
    private javax.swing.JTextArea jtxtCampo;
    private javax.swing.JRadioButton rbtnFlash;
    private javax.swing.JRadioButton rbtnPrincipal;
    private javax.swing.JRadioButton rbtnSecundaria;
    private javax.swing.JTextField txtBat;
    private javax.swing.JTextField txtGpu;
    private javax.swing.JTextField txtMegapixeles;
    private javax.swing.JTextField txtMegapixeles1;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
