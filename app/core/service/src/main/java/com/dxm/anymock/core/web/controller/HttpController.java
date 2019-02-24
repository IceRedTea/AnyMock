package com.dxm.anymock.core.web.controller;

import com.dxm.anymock.core.biz.HttpMockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {

    @Autowired
    private HttpMockService httpMockService;

    @RequestMapping(value = "/**/*")
    public void handleHttpRequests(HttpServletRequest request, HttpServletResponse response) throws IOException {
        httpMockService.mock(request, response);
    }
}
