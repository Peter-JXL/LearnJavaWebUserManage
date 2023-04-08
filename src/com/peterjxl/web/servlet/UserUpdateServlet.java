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
import java.util.List;

@WebServlet("/userUpdateServlet")
public class UserUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        int age = Integer.parseInt(req.getParameter("age"));
        String address = req.getParameter("address");
        String qq = req.getParameter("qq");
        String email = req.getParameter("email");
        User user = new User();
        user.setId(Integer.parseInt(id));
        user.setName(name);
        user.setGender(sex);
        user.setAge(age);
        user.setAddress(address);
        user.setQq(qq);
        user.setEmail(email);
        System.out.println(user);
        UserService service = new UserServiceImpl();
        service.updateOne(user);
        req.getRequestDispatcher("/userListServlet").forward(req, resp);
    }
}
