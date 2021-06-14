package com.example.springproject.controller;

import com.example.springproject.service.ProductService;
import com.example.springproject.util.message.Message;
import com.example.springproject.util.message.StatusEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@Api(tags = "제품", description = "제품 리스트 가져오기 | 카테고리 별 제품 가져오기 | 카테고리 별 3개씩 가져오기")
public class ProductController {

    @Autowired
    ProductService productService;

    @ApiOperation(value = "제품 리스트 가져오기")
    @GetMapping("/productList")
    public ResponseEntity findAllProduct() {
        return new ResponseEntity(new Message(productService.findAllProduct(), StatusEnum.OK) , HttpStatus.OK);
    }

    @ApiOperation(value = "카테고리 별 제품 가져오기")
    @GetMapping("/product/category/main")
    public ResponseEntity findProductMain(){
        return new ResponseEntity(new Message(productService.findProductMain(), StatusEnum.OK), HttpStatus.OK);
    }

    @ApiOperation(value = "카테고리 별 3개씩 가져오기")
    @GetMapping("/product/category")
    public ResponseEntity findProductCategory(@RequestParam("category") String category){
        return new ResponseEntity(new Message(productService.findProductCategory(category), StatusEnum.OK), HttpStatus.OK);
    }

    @ApiOperation(value = "제품 낮은 가격 순으로 가져오기")
    @GetMapping("/productList/lower")
    public ResponseEntity findLowerProduct() {
        return new ResponseEntity(new Message(productService.findLowerProduct(), StatusEnum.OK) , HttpStatus.OK);
    }

    @ApiOperation(value = "제품 높은 가격 순으로 가져오기")
    @GetMapping("/productList/upper")
    public ResponseEntity findUpperProduct() {
        return new ResponseEntity(new Message(productService.findUpperProduct(), StatusEnum.OK) , HttpStatus.OK);
    }

}
