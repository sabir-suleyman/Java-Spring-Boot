package edu.uludag.sabir.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.uludag.sabir.demo.model.Price;
import edu.uludag.sabir.demo.service.PriceService;

@Controller
@RequestMapping("/price")
public class PriceController {
    
    @Autowired
    private PriceService priceService;

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("prices", priceService.findAll());
        return "price/list";
    }

    @GetMapping(value = { "/", "/{id}" })
    public String price(@PathVariable(name = "id", required = false) Long id, Model model) {
        Price price = priceService.findById(id);
        model.addAttribute("price", price != null ? price : new Price());
		return "price/detail";
	}

	@PostMapping(value = { "/", "/{id}" })
	public String priceSubmit(@ModelAttribute Price price, Model model) {
		price = priceService.save(price);
		model.addAttribute("price", price);
		model.addAttribute("success", true);
		return "redirect:/price/" + price.getId();
	}
}
