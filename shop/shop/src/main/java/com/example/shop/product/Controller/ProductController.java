package com.example.shop.product.Controller;

import com.example.shop.member.dto.Member;
import com.example.shop.member.service.MemberService;
import com.example.shop.product.dto.Product;
import com.example.shop.product.dto.ProductList;
import com.example.shop.product.service.ProductService;
import com.example.shop.util.Pagination;
import com.example.shop.util.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class ProductController {

    @Autowired
    ProductService ps;

    @Autowired
    MemberService ms;


    @GetMapping("/productList")
    public String productList(SearchDto searchdto, Model model, HttpSession session) {
        List<HashMap<String, String>> par = new ArrayList<HashMap<String, String>>();
        ProductList product = ps.findAll(searchdto);
        model.addAttribute("product", product);
        String key = searchdto.getKeyword();
        if (session.getAttribute("id") != null) {
            List<HashMap<String, Object>> cList = ms.selectUserCart(((Member) session.getAttribute("id")).getId());
            model.addAttribute("cartList", cList);
            for (Map<String, Object> component : cList) {
                HashMap<String, String> comMap = new HashMap<String, String>();
                comMap.put("id", String.valueOf(component.get("pid")));
                comMap.put("amount", String.valueOf(component.get("amount")));
                comMap.put("name", String.valueOf(component.get("productName")));
                comMap.put("price", String.valueOf(component.get("price")));
                par.add(comMap);
            }
        }

        model.addAttribute("paramText", par);
        if (key != null) {
            model.addAttribute("keyword", searchdto.getKeyword());
        }

        return "productlist";
    }

    @GetMapping("/orderList")
    public String orderList(HttpSession session, Model m) {
        List<Map<String, Object>> param = new ArrayList<Map<String, Object>>();
        String userid = null;
        Map<String, String> accParam = new HashMap<>();
        if (session.getAttribute("id") != null) {

            userid = ((Member) session.getAttribute("id")).getId();
        }
        List<HashMap<String, Object>> cList = ms.selectOrderBook(userid);
        m.addAttribute("orderList", cList);

        return "orderhistory";
    }
}
