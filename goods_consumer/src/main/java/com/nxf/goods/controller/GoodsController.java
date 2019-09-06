package com.nxf.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.nxf.goods.entity.Goods;
import com.nxf.goods.service.GoodsService;

@Controller
public class GoodsController {
	@Reference
	private GoodsService goodsService;
	
	@GetMapping("list")
	public String list(Model model,@RequestParam(defaultValue = "1")Integer pageNum,@RequestParam(defaultValue = "3")Integer pageSize) {
		PageInfo<Goods> pageInfo = goodsService.list(pageNum, pageSize);
		model.addAttribute("pageInfo", pageInfo);
		return "list";
	}
}
