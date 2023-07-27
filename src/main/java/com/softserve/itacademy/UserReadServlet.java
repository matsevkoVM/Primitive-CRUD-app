package com.softserve.itacademy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/read")
public class UserReadServlet extends HttpServlet {
    private UserDataAccesseObject userDao;

    @Override
    public void init() {
        userDao = UserDataAccesseObject.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = userDao.read(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("user", user);
        req.getRequestDispatcher("/WEB-INF/read-user.jsp").forward(req, resp);
    }
}
