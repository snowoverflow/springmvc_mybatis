package com.yangjl.mapper;

import java.util.List;

import com.yangjl.po.ItemsCustom;
import com.yangjl.po.ItemsQueryVo;

public interface ItemsMapperCustom {

	// 商品查询列表
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
