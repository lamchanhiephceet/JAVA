import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="discount",urlPatterns = "/discount")
public class discountServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
double listPrice = Double.parseDouble(request.getParameter("listPrice"));
double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));
String productDescription = request.getParameter("productDescription");
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<p>" + productDescription + "</p>");
        writer.print("<hl>List Price</b>: " + listPrice +"</hl></br>");
        writer.print("<hl>Discount Percent: "  + discountPercent +"</hl></br>");
        writer.print("<hl>Result: " + listPrice*(1- discountPercent/100)+ "</hl>");
        writer.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
