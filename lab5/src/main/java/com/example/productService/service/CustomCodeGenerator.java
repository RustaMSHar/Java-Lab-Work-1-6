package com.example.productService.service;

import com.example.productService.utils.CodeGenerator;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class CustomCodeGenerator implements CodeGenerator
{
    public String getTime()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMYYYY");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
    @Override
    public String createCode()
    {
        return getTime() + "-" + String.valueOf(random.nextInt()) + "-" + getTime();
    }
}
