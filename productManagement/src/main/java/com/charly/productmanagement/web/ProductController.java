package com.charly.productmanagement.web;

import com.charly.productmanagement.entity.Product;
import com.charly.productmanagement.repository.ProductRepository;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/user/index")
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("productList", products);
        return "products";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/user/index";
    }

    @PostMapping("/admin/delete")
    public String delete(@RequestParam(name = "id") Long id) {
        productRepository.deleteById(id);
        return "redirect:/user/index";
    }

    @GetMapping("/admin/newProduct")

    public String newProduct(Model model) {
        model.addAttribute("product", new Product());
        return "new-product";
    }

    @PostMapping("/admin/saveProduct")
    public String saveProduct(@Valid Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors())
            return "new-product";
        productRepository.save(product);
        return "redirect:/user/index";
    }

    @GetMapping("/user/findProduct")
    public String findProduct(@RequestParam(name="name") String name,Model model) {
        List<Product> products = productRepository.findByNameContainingIgnoreCase(name);
        model.addAttribute("productList", products);
        return "products";
    }

    @PostMapping("/admin/editProduct")
    public String editProduct(@RequestParam(name="id") Long id,Model model){
        Optional<Product> productOptional=productRepository.findById(id);
        productOptional.ifPresent(product -> model.addAttribute("product", product));
        return "edit-product";
    }

    @PostMapping("/admin/updateProduct")
    public String updateProduct(@Valid Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors())
            return "new-product";
        productRepository.save(product);
        return "redirect:/user/index";
    }


    @GetMapping("/notAuthorized")
    public String notAuthorized() {
        return "notAuthorized";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }
}
