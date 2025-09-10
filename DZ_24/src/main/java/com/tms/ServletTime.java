package com.tms;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@WebServlet(name = "TimeServlet", urlPatterns = {"/minsk", "/washington", "/beijing"})
public class ServletTime extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        Writer out = resp.getWriter();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String path = req.getServletPath();
        String city = "";
        ZoneId zoneId = null;

        switch (path) {
            case "/minsk":
                city = "Minsk";
                zoneId = ZoneId.of("Europe/Minsk");
                break;
            case "/washington":
                city = "Washington";
                zoneId = ZoneId.of("America/New_York");
                break;
            case "/beijing":
                city = "Beijing";
                zoneId = ZoneId.of("Asia/Shanghai");
                break;
        }

        ZonedDateTime time = ZonedDateTime.now(zoneId);
        String formattedTime = time.format(formatter);
        out.append("<html> Hello " + city + ": " + formattedTime + " :)</html>");
        out.close();
    }
}
