package com.mkyong.common.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.mkyong.common.model.Shop;

@Controller
@RequestMapping("/kfc/brands")
public class JSONController {

	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody List<Shop> getShopInJSON(@PathVariable String name) {
		List<Shop> list = new ArrayList<Shop>()	;
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"mkyong1", "mkyong2"});
		Shop shop2 = new Shop();
		shop2.setName(name);
		shop2.setStaffName(new String[]{"mkyong2", "mkyong3"});
		list.add(shop);
		list.add(shop2);
		return list;

	}
	
}