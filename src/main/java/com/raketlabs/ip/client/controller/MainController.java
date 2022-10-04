package com.raketlabs.ip.client.controller;

import com.raketlabs.ip.client.response.GetClientIpResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Slf4j
@RestController
public class MainController {

    @GetMapping("getClientIp")
    public GetClientIpResponse getClientIp (HttpServletRequest httpServletRequest, @RequestHeader Map<String, String> headers) {
        var response = new GetClientIpResponse();
        response.setIp(httpServletRequest.getRemoteAddr());
        response.setHeaders(headers);
        log.info("response: {}", response);
        return response;
    }
}
