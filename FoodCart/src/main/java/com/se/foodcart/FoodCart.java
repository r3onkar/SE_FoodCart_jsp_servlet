package com.se.foodcart;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FoodCart")
public class FoodCart extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get the data from DB

		try {
			List<Food> Fooditems = FoodCartDBUtil.getFoodList();
			request.setAttribute("Fooditems", Fooditems);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// redirect to differnt pages

		RequestDispatcher dispacther = request.getRequestDispatcher("/show-food.jsp");

		dispacther.forward(request, response);

	}

}
