package com.peterjxl.web.servlet;

import com.peterjxl.domain.User;
import com.peterjxl.service.UserService;
import com.peterjxl.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userDelServlet")
public class UserDelServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        UserService service = new UserServiceImpl();
        service.deleteOne(req.getParameter("id"));
        req.getRequestDispatcher("/userListServlet").forward(req, resp);
    }
}
