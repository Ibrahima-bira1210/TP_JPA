/* package com.example.tp_jpa;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}


@Singleton
@LocalBean
@Startup
public class SingletonEJB {
    @PersistenceContext
    private EntityManager em;
    // List des employees
    public List<Employe> findAllEmployee() {
        return em.createQuery("select object(o) from Employe as o").getResultList();
    }
    // List des produits
    public List<Produit> findAllProduit() {
        return em.createQuery("select object(o) from Produit as o").getResultList();
    }

    @PostConstruct
    public void init(){
        System.out.println("******** La list des Employees ***************** ");
        findAllEmployee();
        System.out.println("********** La list des Produit *************");
        findAllProduit();
    }

}

 */