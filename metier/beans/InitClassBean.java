package com.example.tp_jpa.metier.beans;
import com.example.tp_jpa.entities.Employe;
import com.example.tp_jpa.entities.Produit;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.apache.log4j.Logger;
import javax.annotation.PostConstruct;
import java.io.Serializable;
import java.util.List;

@Singleton
@Startup
public class InitClassBean implements Serializable {
    private static Logger logger = Logger.getLogger(InitClassBean.class);

    @PersistenceContext(unitName = "production")
    EntityManager em1;

    @PersistenceContext(unitName = "vente")
    EntityManager em2;
    // List des employees
    public List<Employe> findAllEmployee() {
        return em2.createQuery("select object(o) from Employe as o").getResultList();
    }
    // List des produits
    public List<Produit> findAllProduct() {
        return em1.createQuery("select object(o) from Produit as o").getResultList();
    }

    @PostConstruct
    public void init(){
        System.out.println("******** La list des Employees ***************** ");
        findAllEmployee();
        System.out.println("********** La list des Produit *************");
        findAllProduct();
    }

}
