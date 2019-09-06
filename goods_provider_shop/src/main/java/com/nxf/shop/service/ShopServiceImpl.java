package com.nxf.shop.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;

import com.alibaba.dubbo.config.annotation.Service;
import com.nxf.goods.entity.Shop;
import com.nxf.goods.service.ShopService;
import com.nxf.shop.dao.ShopMapper;

@Service(interfaceClass = ShopService.class)
@Transactional
public class ShopServiceImpl implements ShopService{
	@Resource
	private ShopMapper shopMapper;
	
	@Override
	public List<Shop> getShopList() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
