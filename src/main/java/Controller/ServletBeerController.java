package Controller;

import Model.BeanBeer;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletBeerController", value = "/ServletBeerController")
public class ServletBeerController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    String color = request.getParameter("color");
    BeanBeer beer = new BeanBeer();
    List<String> result = beer.getBrends(color);

    request.setAttribute("styles", result);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/Result/ShowRes.jsp");
    dispatcher.forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doGet(request, response);
  }
}
