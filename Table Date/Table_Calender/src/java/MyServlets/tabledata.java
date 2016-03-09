/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jayanaka
 */
public class tabledata extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String type = request.getParameter("type");
            String date = request.getParameter("date");
            System.out.println("ty = "+type);
            System.out.println("da = "+date);
            
            Date d;
            if (type.equals("not")) {
                d = new Date();
                System.out.println("a");
            }else{
                System.out.println("b");
                d = sdf.parse(date);
            }
                 

            out.write("<table border=\"2\" id=\"tt\">");
            out.write("<th id=\"qq\">Date</th>");
            
            if (type.equals("back")) {
                for (int i = 7; i > 0; i--) {              
                    Calendar c = Calendar.getInstance();
                    c.setTime(d);
                    c.add(Calendar.DATE, -i);
                    int j = 8;
                    j = j - i;
                    out.write("<th id=\"h"+j+"\">"+sdf.format(c.getTime())+"</th>");                
                }
            } else {
                for (int i = 1; i < 8; i++) {              
                    Calendar c = Calendar.getInstance();
                    c.setTime(d);
                    c.add(Calendar.DATE, i);
                    out.write("<th id=\"h"+i+"\">"+sdf.format(c.getTime())+"</th>");                
                }
            }
            
            
            
            
//            out.write("<th>Date2</th>");
//            out.write("<th>Date3</th>");
//            out.write("<th>Date4</th>");
//            out.write("<th>Date5</th>");
//            out.write("<th>Date6</th>");
//            out.write("<th>Date7</th>");
            out.write("<tr>");
            
            out.write("<td></td>");
            out.write("<td></td>");
            out.write("<td></td>");
            out.write("<td></td>");
            out.write("<td></td>");
            out.write("<td></td>");
            out.write("<td></td>");
            out.write("<td></td>");
            
            out.write("</tr>");
            out.write("</table>");
            
        } catch (Exception e) {
            e.printStackTrace();
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
        processRequest(request, response);
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
        processRequest(request, response);
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
