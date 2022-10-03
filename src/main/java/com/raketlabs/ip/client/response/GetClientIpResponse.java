package com.raketlabs.ip.client.response;

import lombok.Data;

import java.util.Map;

@Data
public class GetClientIpResponse {
    String ip;
    Map<String, String> headers;
}
