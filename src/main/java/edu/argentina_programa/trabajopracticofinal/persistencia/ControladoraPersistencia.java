/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.argentina_programa.trabajopracticofinal.persistencia;

import edu.argentina_programa.trabajopracticofinal.logica.Categoria;
import edu.argentina_programa.trabajopracticofinal.logica.Cliente;
import edu.argentina_programa.trabajopracticofinal.logica.Orden;
import edu.argentina_programa.trabajopracticofinal.logica.Tecnico;
import edu.argentina_programa.trabajopracticofinal.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class ControladoraPersistencia {

    CategoriaJpaController categoriaJPA = new CategoriaJpaController();
    ClienteJpaController clienteJPA = new ClienteJpaController();
    OrdenJpaController ordenJPA = new OrdenJpaController();
    TecnicoJpaController tecnicoJPA = new TecnicoJpaController();

    public void crearCategoria(Categoria nuevaCategoria) {
        categoriaJPA.create(nuevaCategoria);
    }

    public void crearTecnico(Tecnico nuevoTecnico) {
        tecnicoJPA.create(nuevoTecnico);
    }

    public void crearCliente(Cliente nuevoCliente) {
        clienteJPA.create(nuevoCliente);
    }

    public List<Cliente> traerClientes() {
        return clienteJPA.findClienteEntities();
    }

    public Cliente traerCliente(int id) {
        return clienteJPA.findCliente(id);
    }

    public List<Categoria> traerCategorias() {
        return categoriaJPA.findCategoriaEntities();
    }

    public void editarCliente(Cliente cliente) {
        try {
            this.clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCategoria(int id_categoria) {
        try {
            this.categoriaJPA.destroy(id_categoria);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Categoria trerCategoria(int id_categoria) {
        return this.categoriaJPA.findCategoria(id_categoria);
    }

    public void editarCategoria(Categoria categoria) {
        try {
            this.categoriaJPA.edit(categoria);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarTecnico(int id_tecnico) {
        try {
            this.tecnicoJPA.destroy(id_tecnico);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Tecnico> traerTecnicos() {
        return this.tecnicoJPA.findTecnicoEntities();
    }

    public Tecnico traerTecnico(int id_tecnico) {
        return this.tecnicoJPA.findTecnico(id_tecnico);
    }

    public void editarTecnico(Tecnico tecnico) {
        try {
            this.tecnicoJPA.edit(tecnico);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarCliente(int id_cliente) {
        try {
            this.clienteJPA.destroy(id_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Orden> traerOrdenes() {
        return this.ordenJPA.findOrdenEntities();
    }

    public void eliminarOrden(int id_orden) {
        try {
            this.ordenJPA.destroy(id_orden);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Orden traerOrden(int id_orden) {
        return this.ordenJPA.findOrden(id_orden);
    }

    public void crearOrden(Orden orden) {
        this.ordenJPA.create(orden);
    }

    public void editarOrden(Orden orden) {
        try {
            this.ordenJPA.edit(orden);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
