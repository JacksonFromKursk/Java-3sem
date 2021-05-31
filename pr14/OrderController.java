package com.example.prac_14;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/home/Order")
@Controller
public class OrderController {
    List<Order> list = new ArrayList<>();
    @GetMapping("/add")
    public String add(@RequestParam String orderDate, Model bridge){
        list.add(new Order(orderDate));
        bridge.addAttribute("orderDate", orderDate);
        return "Manufacture";
    }
    @GetMapping("/{name}")
    public String get(@PathVariable String name, Model bridge){
        boolean d = true;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getOrderDate().equals(name)){
                bridge.addAttribute("orderDate", list.get(i).getOrderDate());
                d = false;
                break;
            }
        }
        if (d)
            bridge.addAttribute("orderDate", "Not found");
        return "Order";
    }
    @GetMapping("/del/{name}")
    public String remove(@PathVariable String name, Model bridge){
        boolean d = true;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getOrderDate().equals(name)){
                bridge.addAttribute("orderDate", list.get(i).getOrderDate());
                d = false;
                list.remove(i);
                break;
            }
        }
        if (d)
            bridge.addAttribute("orderDate", "Not found");
        return "Order";
    }
}
