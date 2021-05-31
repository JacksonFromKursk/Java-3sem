package com.example.prac_14;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/home/Item")
@Controller
public class ItemController {
    List<Item> list = new ArrayList<>();
    @GetMapping("/add")
    public String add(@RequestParam String name, @RequestParam String creationDate, @RequestParam int price, Model bridge){
        list.add(new Item(name, creationDate, price));
        bridge.addAttribute("name", name);
        bridge.addAttribute("creationDate", creationDate);
        bridge.addAttribute("price", price);
        return "Item";
    }
    @GetMapping("/{last}")
    public String get(@PathVariable String last, Model bridge){
        boolean d = true;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).name.equals(last)){
                bridge.addAttribute("name", list.get(i).getName());
                bridge.addAttribute("creationDate", list.get(i).getCreationDater());
                bridge.addAttribute("price", list.get(i).getPrice());
                d = false;
                break;
            }
        }
        if (d)
            bridge.addAttribute("name", "Not found");
        return "Item";
    }
    @GetMapping("/del/{last}")
    public String remove(@PathVariable String last, Model bridge){
        boolean d = true;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).name.equals(last)){
                bridge.addAttribute("name", list.get(i).getName());
                bridge.addAttribute("creationDate", list.get(i).getCreationDater());
                bridge.addAttribute("price", list.get(i).getPrice());
                d = false;
                list.remove(i);
                break;
            }
        }
        if (d)
            bridge.addAttribute("name", "Not found");
        return "Item";
    }
}
