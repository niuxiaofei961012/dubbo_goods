package com.nxf.goods.service;

import javax.annotation.Resource;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.nxf.goods.dao.GoodsMapper;
import com.nxf.goods.entity.Goods;

@Service
public class GoodsServiceImpl implements GoodsService{
	@Resource
	private GoodsMapper goodsMapper;
	
	@Override
	public int create(Goods goods) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBatch(Integer[] ids) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Goods goods) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Goods findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Goods> list(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Goods>(goodsMapper.list());
	}

}
