package com.example.productService.service;

import com.example.productService.utils.CodeGenerator;
import org.springframework.stereotype.Service;

@Service
public class RandomCodeGenerator implements CodeGenerator
{
    @Override
    public String createCode()
    {
        return String.valueOf(random.nextInt());
    }
}
