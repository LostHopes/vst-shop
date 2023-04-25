package com.project.music.vst.pages.products;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Products {

    @GetMapping("/products")
    public String showProductsPage() {
        return "products/products";
    }
}

