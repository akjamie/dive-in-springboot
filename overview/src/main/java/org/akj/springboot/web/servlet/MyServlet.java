//package org.akj.springboot.web.servlet;
//
//import lombok.extern.slf4j.Slf4j;
//
//import javax.servlet.AsyncContext;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(urlPatterns = "/test", asyncSupported = true)
//@Slf4j
//public class MyServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        AsyncContext asyncContext = req.startAsync();
//        asyncContext.start(() -> {
//            try {
//                resp.getWriter().write("this is test message endpoint..");
//                asyncContext.complete();
//            } catch (IOException e) {
//                log.error(e.getMessage());
//            }
//        });
//
//    }
//}
