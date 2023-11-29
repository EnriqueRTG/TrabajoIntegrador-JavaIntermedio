package edu.argentina_programa.trabajopracticofinal.logica;

import edu.argentina_programa.trabajopracticofinal.logica.Categoria;
import edu.argentina_programa.trabajopracticofinal.logica.Cliente;
import edu.argentina_programa.trabajopracticofinal.logica.Tecnico;
import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-29T12:38:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, String> descripcion;
    public static volatile SingularAttribute<Orden, Date> fecha;
    public static volatile SingularAttribute<Orden, Cliente> cliente;
    public static volatile SingularAttribute<Orden, String> estado;
    public static volatile SingularAttribute<Orden, Float> costo;
    public static volatile SingularAttribute<Orden, Categoria> categoria;
    public static volatile SingularAttribute<Orden, Integer> id;
    public static volatile SingularAttribute<Orden, Tecnico> tecnico;

}