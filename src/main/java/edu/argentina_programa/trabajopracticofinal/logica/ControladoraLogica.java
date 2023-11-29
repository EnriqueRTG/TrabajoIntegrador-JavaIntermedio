/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.argentina_programa.trabajopracticofinal.logica;

import edu.argentina_programa.trabajopracticofinal.persistencia.ControladoraPersistencia;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Enrique
 */
public class ControladoraLogica {

    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void crearCliente(int nroDocumento, String apellido, String nombre, String direccion, String email, String telefono) {
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setNro_documento(nroDocumento);
        nuevoCliente.setApellido(apellido);
        nuevoCliente.setNombre(nombre);
        nuevoCliente.setDireccion(direccion);
        nuevoCliente.setEmail(email);
        nuevoCliente.setTelofono(telefono);

        this.controlPersistencia.crearCliente(nuevoCliente);
    }

    public void crearCategoria(String stringDevuelto) {
        Categoria nuevaCategoria = new Categoria();
        nuevaCategoria.setDescripcion(stringDevuelto);

        this.controlPersistencia.crearCategoria(nuevaCategoria);
    }

    public void crearTecnico(String apellido, String nombre, String email, String telefono) {
        Tecnico nuevoTecnico = new Tecnico();
        nuevoTecnico.setApellido(apellido);
        nuevoTecnico.setNombre(nombre);
        nuevoTecnico.setEmail(email);
        nuevoTecnico.setTelefono(telefono);

        this.controlPersistencia.crearTecnico(nuevoTecnico);
    }

    public Cliente traerCliente(int id) {
        return this.controlPersistencia.traerCliente(id);
    }

    public List<Cliente> traerClientes() {
        return this.controlPersistencia.traerClientes();
    }

    public List<Categoria> traerCategorias() {
        return this.controlPersistencia.traerCategorias();
    }

    public void editarCliente(Cliente cliente, int nroDocumento, String apellido, String nombre, String direccion, String email, String telefono) {
        cliente.setNro_documento(nroDocumento);
        cliente.setApellido(apellido);
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setEmail(email);
        cliente.setTelofono(telefono);

        this.controlPersistencia.editarCliente(cliente);
    }

    public void eliminarCategoria(int id_categoria) {
        this.controlPersistencia.eliminarCategoria(id_categoria);
    }

    public Categoria traerCategoria(int id_categoria) {
        return this.controlPersistencia.trerCategoria(id_categoria);
    }

    public void editarCategoria(Categoria categoria, String nuevaDescripcion) {
        categoria.setDescripcion(nuevaDescripcion);

        this.controlPersistencia.editarCategoria(categoria);
    }

    public List<Tecnico> traerTecnicos() {
        return this.controlPersistencia.traerTecnicos();
    }

    public void eliminarTecnico(int id_tecnico) {
        this.controlPersistencia.eliminarTecnico(id_tecnico);
    }

    public Tecnico traerTecnico(int id_tecnico) {
        return this.controlPersistencia.traerTecnico(id_tecnico);
    }

    public void editarTecnico(Tecnico tecnico, String apellido, String nombre, String email, String telefono) {
        tecnico.setApellido(apellido);
        tecnico.setNombre(nombre);
        tecnico.setEmail(email);
        tecnico.setTelefono(telefono);
        
        this.controlPersistencia.editarTecnico(tecnico);
    }

    public void eliminarCliente(int id_cliente) {
        this.controlPersistencia.eliminarCliente(id_cliente);
    }

    public List<Orden> traerOrdenes() {
        return this.controlPersistencia.traerOrdenes();
    }

    public void eliminarOrden(int id_orden) {
        this.controlPersistencia.eliminarOrden(id_orden);
    }

    public Orden traerOrden(int id_orden) {
        return this.controlPersistencia.traerOrden(id_orden);
    }

    public void crearOrden(String descripcionOrden, float costoOrden, Date fecha,String estado, int id_cliente, int id_categoria, int id_tecnico) {
        
        Orden orden = new Orden();
        orden.setDescripcion(descripcionOrden);
        orden.setCosto(costoOrden);
        orden.setFecha(fecha);
        orden.setEstado(estado);
        orden.setCliente(this.traerCliente(id_cliente));
        orden.setCategoria(this.traerCategoria(id_categoria));
        orden.setTecnico(this.traerTecnico(id_tecnico));
        this.controlPersistencia.crearOrden(orden);
    }

    public void editarOrden(Orden orden, String descripcionOrden, float costoOrden, int id_categoria, int id_tecnico) {
        orden.setDescripcion(descripcionOrden);
        orden.setCosto(costoOrden);
        orden.setCategoria(this.traerCategoria(id_categoria));
        orden.setTecnico(this.traerTecnico(id_tecnico));
        
        this.controlPersistencia.editarOrden(orden);
    }

}
