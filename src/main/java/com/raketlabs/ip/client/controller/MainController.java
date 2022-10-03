package com.raketlabs.ip.client.controller;

import com.raketlabs.ip.client.response.GetClientIpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    @GetMapping("getClientIp")
    public GetClientIpResponse getClientIp (HttpServletRequest httpServletRequest) {
        GetClientIpResponse response = new GetClientIpResponse();
        response.setIp(httpServletRequest.getRemoteAddr());
        return response;
    }
}
