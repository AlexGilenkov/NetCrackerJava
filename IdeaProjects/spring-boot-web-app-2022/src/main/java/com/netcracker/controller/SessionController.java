package com.netcracker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
public class SessionController {

    @GetMapping("/session")
    public String listenSession(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(true);

        Date creationTime = new Date(session.getCreationTime());
        Date lastAccessedTime = new Date(session.getLastAccessedTime());

        return "Creation time = " + creationTime + ", " + "Last accessed time = "
                + lastAccessedTime + ", " + "Session id = " + session.getId();
    }
}
