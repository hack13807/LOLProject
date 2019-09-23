package com.java.lol.servlet;


import com.java.lol.common.Lineup;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PieceServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
        System.out.println("doGet");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String[] values = request.getParameterValues("piece") ;
        String piece = request.getParameter("piece");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        String[] values = request.getParameterValues("piece") ;
        String piece = request.getParameter("piece");
        String lineupResult = "";
        try {
            lineupResult = new Lineup().getLineupResult(values);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (lineupResult == null || lineupResult.trim().equals("")) {
            lineupResult = "请选择至少一枚棋子";
        }
        
        request.setAttribute("resultStr",lineupResult);
        response.getWriter().write(lineupResult);
        response.getWriter().close();
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
