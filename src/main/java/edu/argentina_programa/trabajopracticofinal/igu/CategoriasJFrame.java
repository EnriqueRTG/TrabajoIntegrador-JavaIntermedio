/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edu.argentina_programa.trabajopracticofinal.igu;

import edu.argentina_programa.trabajopracticofinal.logica.Categoria;
import edu.argentina_programa.trabajopracticofinal.logica.ControladoraLogica;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enrique
 */
public class CategoriasJFrame extends javax.swing.JFrame {

    ControladoraLogica controlLogica = null;
    Categoria categoria = null;

    /**
     * Creates new form CategoriasJFrame
     */
    public CategoriasJFrame() {
        controlLogica = new ControladoraLogica();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT
     * modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCategorias = new javax.swing.JTable();
        btnNuevaCategoria = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 36)); // NOI18N
        jLabel1.setText("CATEGORIAS");

        tablaCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaCategorias);

        btnNuevaCategoria.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnNuevaCategoria.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Documents\\NetBeansProjects\\TrabajoPracticoFinal\\src\\img\\agregar.png")); // NOI18N
        btnNuevaCategoria.setText(" NUEVA");
        btnNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaCategoriaActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Documents\\NetBeansProjects\\Concesionario\\img\\editar.png")); // NOI18N
        btnEditar.setText(" EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Documents\\NetBeansProjects\\TrabajoPracticoFinal\\src\\img\\eliminar.png")); // NOI18N
        btnEliminar.setText(" ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Documents\\NetBeansProjects\\TrabajoPracticoFinal\\src\\img\\regresar.png")); // NOI18N
        btnRegresar.setText(" REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Enrique\\Documents\\NetBeansProjects\\TrabajoPracticoFinal\\src\\img\\ElectroTech Solutions-Logo_pequ.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevaCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // Controlar que la tabla posea registros
        if (this.tablaCategorias.getRowCount() > 0) {

            // Validar la seleccion de un registro
            if (this.tablaCategorias.getSelectedRow() != -1) {

                // Obtener id del registro a modificar
                int id_categoria = Integer.parseInt(String.valueOf(this.tablaCategorias.getValueAt(this.tablaCategorias.getSelectedRow(), 0)));
                String nuevaDescripcion = this.ingresarDatosVentanaEdicion("Editar la Categoria: " + this.controlLogica.traerCategoria(id_categoria).getDescripcion(), this.controlLogica.traerCategoria(id_categoria).getDescripcion());

                if (nuevaDescripcion != null) {
                    if (!nuevaDescripcion.trim().equals("")) {
                        if (nuevaDescripcion.length() > 3) {

                            this.categoria = this.controlLogica.traerCategoria(id_categoria);
                            
                            this.controlLogica.editarCategoria(categoria, nuevaDescripcion);
                            this.mostrarMensaje("Edicion de Categoria realizada con exito!", "Info", "Edicion Correcta");
                            
                            this.cargarTabla();

                        } else {
                            this.mostrarMensaje("Ingrese una palabra de almenos cuatro letras", "Error", "Palabra invalida");
                        }
                    } else {
                        this.mostrarMensaje("Debe ingresar alguna palabra", "Error", "Campo requerido vacio");
                    }
                }

            } else {
                mostrarMensaje("No selecciono un registro para modificar", "Error", "Error al Modificar");
            }

        } else {
            mostrarMensaje("La tabla esta vacia, no se puede modificar registros", "Error", "Error al Modificar");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Controlar que la tabla posea registros
        if (this.tablaCategorias.getRowCount() > 0) {

            // Validar la seleccion de un registro
            if (this.tablaCategorias.getSelectedRow() != -1) {

                // Obtener id del registro a eliminar
                int id_categoria = Integer.parseInt(String.valueOf(this.tablaCategorias.getValueAt(this.tablaCategorias.getSelectedRow(), 0)));

                // Eliminar registro, pasando la responsabilidad a un metodo de la capa logica
                this.controlLogica.eliminarCategoria(id_categoria);

                mostrarMensaje("El registro de Categoria fue eliminado con exito!", "Info", "Exito al Eliminar");

                this.cargarTabla();

            } else {
                mostrarMensaje("No selecciono un registro para eliminar", "Error", "Error al Eliminar");
            }

        } else {
            mostrarMensaje("La tabla esta vacia, no se puede eliminar registros", "Error", "Error al Eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        InicioJFrame pantallaInico = new InicioJFrame();
        pantallaInico.setVisible(true);
        pantallaInico.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaCategoriaActionPerformed

        String stringDevuelto = ingresarDatosVentana("Ingrese Nueva Categoria", "Creacion de Categoria");

        if (stringDevuelto != null) {
            if (!stringDevuelto.trim().equals("")) {
                if (stringDevuelto.length() > 3) {

                    this.controlLogica.crearCategoria(stringDevuelto);
                    this.mostrarMensaje("Alta de Categoria realizada con exito!", "Info", "Alta Correcta");
                    this.cargarTabla();

                } else {
                    this.mostrarMensaje("Ingrese una palabra de almenos cuatro letras", "Error", "Palabra invalida");
                }
            } else {
                this.mostrarMensaje("Debe ingresar alguna palabra", "Error", "Campo requerido vacio");
            }
        }

    }//GEN-LAST:event_btnNuevaCategoriaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cargarTabla();
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevaCategoria;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCategorias;
    // End of variables declaration//GEN-END:variables

    public String ingresarDatosVentana(String mensaje, String titulo) {
        return JOptionPane.showInputDialog( null,mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String ingresarDatosVentanaEdicion(String mensaje,  String categoria) {
        
        return JOptionPane.showInputDialog( mensaje, categoria);
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {

        // Generar un una ventana emergente con un mensaje obtenido del parametro del metodo
        JOptionPane optionPane = new JOptionPane(mensaje);

        // Si el mensaje es del tipo de informacion, valor pasado por parametro del metodo
        if (tipo.equals("Info")) {

            // Asignar al mensaje el tipo INFORMATTION
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

        } // Sino, Si es del tipo de error
        else if (tipo.equals("Error")) {

            // Asignar al mensaje el tipo ERROR
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }

        // Asignar un titulo, valor pasado por parametros del metodo
        JDialog dialog = optionPane.createDialog(titulo);

        // Posicon respecto al frame que lo invoca
        dialog.setAlwaysOnTop(true);

        // Mostrar la ventana
        dialog.setVisible(true);
    }

    private void cargarTabla() {
        // Generar el modelo de tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            // Hacer que las celdas de la tabla no sea editable
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
            }
        };

        // Generar los encabezados de las columnas
        String encabezados[] = {"Id", "Descripcion"};

        // Asignar los encabezados al modelo de tabla
        modeloTabla.setColumnIdentifiers(encabezados);

        // Traer los autos de la BD
        List<Categoria> listaCategorias = controlLogica.traerCategorias();

        // Asignar los tados de los registros a la tabla
        if (listaCategorias != null) {
            for (Categoria categoriaLista : listaCategorias) {
                Object[] objeto = {categoriaLista.getId(), categoriaLista.getDescripcion()};

                modeloTabla.addRow(objeto);

            }
        }

        // Asignar el modelo de tabla a la tabla
        tablaCategorias.setModel(modeloTabla);
    }

}
