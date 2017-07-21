import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SignInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String name=request.getParameter("name");
        String pswd=request.getParameter("pswd");
        User user=Data.getUser(name,pswd);
        if(user!=null) {
            HttpSession httpSession=request.getSession();
            httpSession.setAttribute("name",user.getName());
            request.setAttribute("email",user.getEmail());
            request.getRequestDispatcher("welcome.jsp").forward(request,response);
//            response.sendRedirect("welcome.jsp");
        }
        else
            out.print("Invalid credentials.");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
