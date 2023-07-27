package com.softserve.itacademy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/update")
public class UpdateUserServlet extends HttpServlet {
    private UserDataAccesseObject userDao;
    private User user;

    @Override
    public void init() {
        userDao = UserDataAccesseObject.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user = userDao.read(Integer.parseInt(req.getParameter("id")));
        req.setAttribute("user", user);
        req.getRequestDispatcher("/WEB-INF/update-user.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        userDao.update(user.getId(), user);
        resp.sendRedirect("/users/list");
    }
}
