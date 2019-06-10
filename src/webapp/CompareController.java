package webapp;

import com.game.Categories;
import com.game.ComparisonLogic;
import com.game.ComparisonTuple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

@WebServlet(name = "compare")
public class CompareController extends HttpServlet {
    ComparisonLogic logic = new ComparisonLogic();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Categories category = Categories.valueOf(request.getParameter("type"));
        PrintWriter out = response.getWriter();
        if(category.equals(Categories.SINGERS)){
            request.setAttribute("type", category.name());
            ComparisonTuple tuple = logic.getNextTuple();
            if(!tuple.getCandidate1().equals("empty") && !tuple.getCandidate2().equals("empty")) {
                request.setAttribute("candidate1", tuple.getCandidate1());
                request.setAttribute("candidate2", tuple.getCandidate2());
                out.println(tuple.getCandidate1() + " " + tuple.getCandidate2());
            }
            else{
                String winner = logic.getScorecard().entrySet().stream()
                        .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
                        .get()
                        .getKey();

                request.setAttribute("Winner", winner);
            }
        }
        request.setAttribute("keys", logic.getScorecard().keySet());
        request.setAttribute("values", new ArrayList(logic.getScorecard().values()));
        request.setAttribute("comparisons", logic.comparisonsLeft());
        request.getRequestDispatcher("/compare.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        String int_winner = request.getParameter("int_winner");
        logic.setValueInScorecard(int_winner);
        /*request.setAttribute("scorecard", logic.getScorecard());*/
        doGet(request, response);
    }
}
