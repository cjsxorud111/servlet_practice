package hello.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {
    ObjectMapper objectMapper = new ObjectMapper();
}
