package com.anjiel.aliyun.ddns.aliyunddns.controller;


import com.anjiel.aliyun.ddns.aliyunddns.service.DnsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class RefreshDnsController {


    @Resource
    public DnsService dnsService;


    @GetMapping("/refresh/dns")
    public ResponseEntity<String> refreshDns(){
        dnsService.updateDns();
        return ResponseEntity.ok("刷新成功");
    }

}
