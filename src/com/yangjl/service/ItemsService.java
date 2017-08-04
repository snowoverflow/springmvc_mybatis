package com.yangjl.service;

import java.util.List;

import com.yangjl.po.ItemsCustom;
import com.yangjl.po.ItemsQueryVo;

/**
 * 
 * <p>
 * Title: ItemsService
 * </p>
 * <p>
 * Description:商品管理service
 * </p>
 */
public interface ItemsService {

	// 商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

	// 根据id查询商品信息
	public ItemsCustom findItemsById(Integer id) throws Exception;

	// 修改商品信息
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception;

}
