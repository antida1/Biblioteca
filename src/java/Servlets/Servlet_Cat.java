/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Clases.Categoria;
import Clases.CategoriaDB;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lina David
 */
@WebServlet(name = "Servlet_Cat", urlPatterns = {"/Servlets/Servlet_Cat"})
public class Servlet_Cat extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        response.setContentType("text/html");
        try{
           String accion = request.getParameter("accion");
            if (accion.equals("crear")) {
                CrearCategoria(request, response);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private void CrearCategoria(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        String nombre = request.getParameter("txtNombre");
        
        Categoria categoria = new Categoria();
        categoria.setNombre(nombre);
        
        boolean respuesta = CategoriaDB.crearCategoria(categoria);
        if(respuesta){
            response.sendRedirect("../Views/respuesta.jsp?mens='¡Se ha creado la categoría correctamente!'");
        }else{
            response.sendRedirect("../Views/respuesta.jsp?mens='¡Error: No se ha creado la categoría!'");
        }
        
    }    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Servlet_Cat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Servlet_Cat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
   

}
