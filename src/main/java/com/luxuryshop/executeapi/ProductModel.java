package com.luxurydecor.executeapi;

import com.luxurydecor.entities.ProductDetail;
import com.luxurydecor.entities.ProductImages;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductModel {
	private String title;
	private float price;
	private float priceOld;
	private String shortDescription;
	private Boolean isHot;
	private Boolean isNew;
	private Boolean isSale;
	private Integer rate;
	private Integer categoryId;
	private List<ProductImages> productImages = new ArrayList<>();
	private Integer collectionId;
	private ProductDetail productDetail;
}
