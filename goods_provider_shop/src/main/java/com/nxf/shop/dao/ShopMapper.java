package com.nxf.shop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.nxf.goods.entity.Shop;

@Mapper
public interface ShopMapper {
	List<Shop> getShopList();
}
