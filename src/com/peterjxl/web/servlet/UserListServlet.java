package com.peterjxl.web.servlet;

import com.peterjxl.domain.User;
import com.peterjxl.service.UserService;
import com.peterjxl.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/userListServlet")
public class UserListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service = new UserServiceImpl();
        List<User> users = service.findAll();
        req.setAttribute("users", users);
        req.getRequestDispatcher("/list.jsp").forward(req, resp);
    }
}
