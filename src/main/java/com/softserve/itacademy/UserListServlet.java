package com.softserve.itacademy;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users/list")
public class UserListServlet extends HttpServlet {

    private UserDataAccesseObject userDao;

    @Override
    public void init() {
        userDao = UserDataAccesseObject.getInstance();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/user-list.jsp");
        request.setAttribute("users", userDao.readAll());
        rd.forward(request, response);
    }
}
