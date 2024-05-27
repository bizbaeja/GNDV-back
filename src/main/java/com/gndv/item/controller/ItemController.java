package com.gndv.item.controller;

import com.gndv.common.CustomResponse;
import com.gndv.item.domain.dto.response.ItemDetailResponse;
import com.gndv.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
@Slf4j
public class ItemController {

    private final ItemService itemService;

    @GetMapping("/{item_id}")
    public CustomResponse<ItemDetailResponse> getItem(@PathVariable Long item_id) throws Exception {
        log.info("Get One Item by id {}", item_id);
        ItemDetailResponse findItem = itemService.getItem(item_id);
        return CustomResponse.ok("Get a Item", findItem);
    }

//    @GetMapping("")
//    public CustomResponse<List<ItemResponse>> getItemList() throws Exception {
//        log.info("Get All Item List");
//        List <ItemResponse>  list = itemService.getItemList();
//    }
}
