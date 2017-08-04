package com.yangjl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.yangjl.mapper.ItemsMapper;
import com.yangjl.mapper.ItemsMapperCustom;
import com.yangjl.po.ItemsCustom;
import com.yangjl.po.ItemsQueryVo;
import com.yangjl.service.ItemsService;

/**
 * 
 * <p>
 * Title: ItemsServiceImpl
 * </p>
 * <p>
 * Description: 商品管理
 * </p>
 */
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;

	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	@Override
	public ItemsCustom findItemsById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
		// TODO Auto-generated method stub

	}
}
