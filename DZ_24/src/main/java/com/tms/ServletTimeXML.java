package com.tms;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ServletTimeXML extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        Writer out = resp.getWriter();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String city = "Moscow";
        ZoneId zoneId = ZoneId.of("Europe/Moscow");
        ZonedDateTime time = ZonedDateTime.now(zoneId);
        String formattedTime = time.format(formatter);
        out.append("<html> Hello " + city + ": " + formattedTime + " :)</html>");
        out.close();
    }
}
