import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SignupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out=response.getWriter();

       if(request.getParameter("pswd").equals(request.getParameter("cpswd"))){
            User user=new User(request.getParameter("name"),request.getParameter("email"),request.getParameter("pswd"));
            Data data=Data.getInstance();
            Data.addUser(user);
           out.print("User added successfully.");
        }
        else
            out.print("Passwords do not match !");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
