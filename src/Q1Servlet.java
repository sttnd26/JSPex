import java.io.IOException;
import java.io.PrintWriter;

public class Q1Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String n= request.getParameter("num");
        PrintWriter out=response.getWriter();
//        out.print("you entered : "+n);
        int num=Integer.parseInt(n);
        for (int i = 1; i <=num ; i++) {
            out.print(i+" ");
        }

    }
}
