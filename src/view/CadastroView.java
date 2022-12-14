package view;

import beans.Cadastro;
//import DAOprof.MySQL;
import DAO.ConexaoDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import view.util.LimitaCaracteres;

public class CadastroView extends javax.swing.JFrame {

    private Cadastro cadastro;
    private ConexaoDAO conexao;

    public CadastroView() {
        initComponents();
//        cadastro = new Cadastro();
//        conexao = new ConexaoDAO();

        txtNome.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        //txtNascimento.setDocument(new LimitaCaracteres(10, LimitaCaracteres.TipoEntrada.DATA)); //o txtFormatedField
        txtCidade.setDocument(new LimitaCaracteres(30, LimitaCaracteres.TipoEntrada.NOME));
        txtFaculdade.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.NOME));
        txtEmail.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.EMAIL));
        txtConfirmarEmail.setDocument(new LimitaCaracteres(60, LimitaCaracteres.TipoEntrada.EMAIL));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbErrado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmarEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btnAvancar = new javax.swing.JButton();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        txtNascimento = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtFaculdade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CbSangue = new javax.swing.JComboBox<>();
        btnVoltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        CbEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CbSexo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastre-se para ser um doador(a)");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(163, 178, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbErrado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbErrado.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Email:");

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Confirmar Email:");

        txtConfirmarEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmarEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmarEmailFocusLost(evt);
            }
        });
        txtConfirmarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarEmailActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Senha:");

        txtSenha.setMinimumSize(new java.awt.Dimension(15, 24));
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });
        txtSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSenhaMouseClicked(evt);
            }
        });
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Confirmar Senha:");

        btnAvancar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salvar.png"))); // NOI18N
        btnAvancar.setText("Avan??ar");
        btnAvancar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAvancarMouseClicked(evt);
            }
        });
        btnAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancarActionPerformed(evt);
            }
        });

        txtConfirmarSenha.setMinimumSize(new java.awt.Dimension(15, 24));
        txtConfirmarSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtConfirmarSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmarSenhaFocusLost(evt);
            }
        });
        txtConfirmarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtConfirmarSenhaMouseClicked(evt);
            }
        });
        txtConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConfirmarEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAvancar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbErrado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(lbErrado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(btnAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 390, 620));

        jPanel2.setBackground(new java.awt.Color(163, 178, 205));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.setMinimumSize(new java.awt.Dimension(15, 24));
        txtNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNascimentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Nome completo:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Data de Nascimento:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Cidade:");

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Institui????o de Ensino:");

        txtFaculdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaculdadeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Qual seu tipo sangu??neo?:");

        CbSangue.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CbSangue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "A+", "B+", "AB+", "O+", "A-", "B-", "AB-", "O-" }));

        btnVoltar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVoltarMouseClicked(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Estado:");

        CbEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Acre", "Alagoas", "Amap??", "Amazonas", "Bahia", "Cear??", "Distrito Federal", "Esp??rito Santo", "Goi??s", "Maranh??o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Par??", "Para??ba", "Paran??", "Pernambuco", "Piau??", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond??nia", "Roraima", "Santa Catarina", "S??o Paulo", "Sergipe", "Tocantins" }));
        CbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbEstadoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Sexo:");

        CbSexo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        CbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(txtFaculdade)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CbSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CbEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE))
                    .addComponent(CbSangue, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFaculdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CbSangue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 390, 620));
        jPanel2.getAccessibleContext().setAccessibleName("");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundocadastro.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSenhaMouseClicked

    }//GEN-LAST:event_txtSenhaMouseClicked

    private void btnAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvancarActionPerformed

    private void btnAvancarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAvancarMouseClicked
        Verificar(); // METODO CRIADO PARA VERIFICAR SE TODOS OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE (EST?? NA PARTE IFNERIOR DESTE C??DIGO)
    }//GEN-LAST:event_btnAvancarMouseClicked


    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtFaculdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaculdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaculdadeActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
        setVisible(false);
        new LoginView().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarMouseClicked

    private void txtConfirmarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarEmailActionPerformed

    private void CbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbSexoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtConfirmarEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarEmailFocusLost

        if (!txtEmail.getText().equals(txtConfirmarEmail.getText())) {
            lbErrado.setText("Os emails digitados n??o s??o iguais!");
            lbErrado.setVisible(true);
        } else {
            lbErrado.setVisible(false);
        }
    }//GEN-LAST:event_txtConfirmarEmailFocusLost

    private void txtConfirmarEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarEmailFocusGained
        lbErrado.setVisible(false);
    }//GEN-LAST:event_txtConfirmarEmailFocusGained

    private void CbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbEstadoActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
//        lbErrado.setVisible(false);

    }//GEN-LAST:event_txtEmailFocusGained

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost

        if (txtEmail.getText().equals(txtConfirmarEmail.getText())) {
            lbErrado.setVisible(false);
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNascimentoActionPerformed

    private void txtConfirmarSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaFocusGained
        lbErrado.setVisible(false);
    }//GEN-LAST:event_txtConfirmarSenhaFocusGained

    private void txtConfirmarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarSenhaMouseClicked

    private void txtConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmarSenhaActionPerformed

    private void txtConfirmarSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaFocusLost
        if (!txtSenha.getText().equals(txtConfirmarSenha.getText())) {
            lbErrado.setText("As senhas digitadas n??o s??o iguais!");
            lbErrado.setVisible(true);
        } else {
            lbErrado.setVisible(false);
        }
    }//GEN-LAST:event_txtConfirmarSenhaFocusLost

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if (txtSenha.getText().equals(txtConfirmarSenha.getText())) {
            lbErrado.setVisible(false);
        }
    }//GEN-LAST:event_txtSenhaFocusLost

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
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbEstado;
    private javax.swing.JComboBox<String> CbSangue;
    private javax.swing.JComboBox<String> CbSexo;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnVoltar;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbErrado;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtConfirmarEmail;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFaculdade;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void Verificar() {

        if (txtNome.getText().isEmpty() || txtNascimento.getText().isEmpty() || txtCidade.getText().isEmpty() || txtFaculdade.getText().isEmpty()
                || CbEstado.getSelectedItem().toString() == "Selecione" || CbSexo.getSelectedItem().toString() == "Selecione" || CbSangue.getSelectedItem().toString() == "Selecione"
                || txtEmail.getText().isEmpty() || txtConfirmarEmail.getText().isEmpty() || txtSenha.getText().isEmpty() || txtConfirmarSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos de cadastro corretamente!");

        } else if (!txtSenha.getText().equals(txtConfirmarSenha.getText()) || (!txtEmail.getText().equals(txtConfirmarEmail.getText()))) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos de cadastro corretamente!");

        } else {
            Avancar(); // OUTRO METODO CRIADO

        }
    } // METODO CRIADO PARA VERIFICAR SE TODOS OS CAMPOS FORAM PREENCHIDOS CORRETAMENTE

    private void Avancar() {
        cadastro.setNome(txtNome.getText());
        cadastro.setNascimento(txtNascimento.getText());
        cadastro.setCidade(txtCidade.getText());
        cadastro.setFaculdade(txtFaculdade.getText());
        String estadoSelecionado = CbEstado.getSelectedItem().toString();
        String sexoSelecionado = CbSexo.getSelectedItem().toString();
        String tipoSangueSelecionado = CbSangue.getSelectedItem().toString();
        cadastro.setEmail(txtEmail.getText());
        cadastro.setSenha(txtSenha.getText());
        conexao.conectaBD();
        String query
                = "INSERT INTO cadastro("
                + "nome,nascimento,cidade,faculdade,estado,sexo,tipoSangue,email,senha)"
                + "VALUES("
                + "'" + cadastro.getNome() + "',"
                + "'" + cadastro.getNascimento() + "',"
                + "'" + cadastro.getCidade() + "',"
                + "'" + cadastro.getFaculdade() + "',"
                + "'" + estadoSelecionado + "',"
                + "'" + sexoSelecionado + "',"
                + "'" + tipoSangueSelecionado + "',"
                + "'" + cadastro.getEmail() + "',"
                + "'" + cadastro.getSenha() + "'"
                + ");";
        if (conexao.insertSQL(query) == 0) {
            JOptionPane.showMessageDialog(null, "Esse CPF j?? foi cadastrado");

        } else { //exceptions JDBC

            JOptionPane.showMessageDialog(null, "Voc?? se cadastrou com sucesso!");
            LoginView login = new LoginView();
            login.setVisible(true);
            dispose();
        }

    }
}
