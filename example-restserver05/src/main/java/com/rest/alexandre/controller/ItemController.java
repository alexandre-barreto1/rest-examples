package com.rest.alexandre.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.alexandre.domain.Item;
import com.rest.alexandre.service.ItemService;

@RestController
public class ItemController {

	private ItemService itemService;

	@Inject
	public ItemController(ItemService itemService) {
		this.itemService = itemService;
	}

	@RequestMapping(value = "/item/add", method = RequestMethod.POST)
	public void add(@RequestBody Item item) {
		itemService.save(item);
	}

	@RequestMapping(value = "/item/list", method = RequestMethod.GET)
	public List<Item> itemList() {
		List<Item> itemList = itemService.getList();
		return itemList;
	}

	@RequestMapping(value = "/item/del", method = RequestMethod.DELETE)
	public void del() {
		System.out.println("ELEMENTO DELETADO");
	}

}
