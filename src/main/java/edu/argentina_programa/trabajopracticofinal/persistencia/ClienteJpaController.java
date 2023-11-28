/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.argentina_programa.trabajopracticofinal.persistencia;

import edu.argentina_programa.trabajopracticofinal.logica.Cliente;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import edu.argentina_programa.trabajopracticofinal.logica.Orden;
import edu.argentina_programa.trabajopracticofinal.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Enrique
 */
public class ClienteJpaController implements Serializable {

    public ClienteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public ClienteJpaController() {
        emf = Persistence.createEntityManagerFactory("edu.argentina_programa_TrabajoPracticoFinal_PU");
    }

    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        if (cliente.getOrdenes() == null) {
            cliente.setOrdenes(new ArrayList<Orden>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            ArrayList<Orden> attachedOrdenes = new ArrayList<Orden>();
            for (Orden ordenesOrdenToAttach : cliente.getOrdenes()) {
                ordenesOrdenToAttach = em.getReference(ordenesOrdenToAttach.getClass(), ordenesOrdenToAttach.getId());
                attachedOrdenes.add(ordenesOrdenToAttach);
            }
            cliente.setOrdenes(attachedOrdenes);
            em.persist(cliente);
            for (Orden ordenesOrden : cliente.getOrdenes()) {
                Cliente oldClienteOfOrdenesOrden = ordenesOrden.getCliente();
                ordenesOrden.setCliente(cliente);
                ordenesOrden = em.merge(ordenesOrden);
                if (oldClienteOfOrdenesOrden != null) {
                    oldClienteOfOrdenesOrden.getOrdenes().remove(ordenesOrden);
                    oldClienteOfOrdenesOrden = em.merge(oldClienteOfOrdenesOrden);
                }
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Cliente cliente) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente persistentCliente = em.find(Cliente.class, cliente.getId());
            ArrayList<Orden> ordenesOld = persistentCliente.getOrdenes();
            ArrayList<Orden> ordenesNew = cliente.getOrdenes();
            ArrayList<Orden> attachedOrdenesNew = new ArrayList<Orden>();
            for (Orden ordenesNewOrdenToAttach : ordenesNew) {
                ordenesNewOrdenToAttach = em.getReference(ordenesNewOrdenToAttach.getClass(), ordenesNewOrdenToAttach.getId());
                attachedOrdenesNew.add(ordenesNewOrdenToAttach);
            }
            ordenesNew = attachedOrdenesNew;
            cliente.setOrdenes(ordenesNew);
            cliente = em.merge(cliente);
            for (Orden ordenesOldOrden : ordenesOld) {
                if (!ordenesNew.contains(ordenesOldOrden)) {
                    ordenesOldOrden.setCliente(null);
                    ordenesOldOrden = em.merge(ordenesOldOrden);
                }
            }
            for (Orden ordenesNewOrden : ordenesNew) {
                if (!ordenesOld.contains(ordenesNewOrden)) {
                    Cliente oldClienteOfOrdenesNewOrden = ordenesNewOrden.getCliente();
                    ordenesNewOrden.setCliente(cliente);
                    ordenesNewOrden = em.merge(ordenesNewOrden);
                    if (oldClienteOfOrdenesNewOrden != null && !oldClienteOfOrdenesNewOrden.equals(cliente)) {
                        oldClienteOfOrdenesNewOrden.getOrdenes().remove(ordenesNewOrden);
                        oldClienteOfOrdenesNewOrden = em.merge(oldClienteOfOrdenesNewOrden);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = cliente.getId();
                if (findCliente(id) == null) {
                    throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The cliente with id " + id + " no longer exists.", enfe);
            }
            ArrayList<Orden> ordenes = cliente.getOrdenes();
            for (Orden ordenesOrden : ordenes) {
                ordenesOrden.setCliente(null);
                ordenesOrden = em.merge(ordenesOrden);
            }
            em.remove(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Cliente findCliente(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
