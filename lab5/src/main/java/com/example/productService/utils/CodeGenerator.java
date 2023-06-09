package com.example.productService.utils;

import java.util.Random;

public interface CodeGenerator
{
    Random random = new Random();
    public String createCode();
}
