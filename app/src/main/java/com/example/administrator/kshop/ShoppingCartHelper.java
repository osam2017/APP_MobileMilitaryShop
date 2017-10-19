package com.example.administrator.kshop;

import android.content.res.Resources;

import java.util.List;
import java.util.Vector;

public class ShoppingCartHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static List<Product> cart;

    public static List<Product> getCatalog(Resources res){
        if(catalog == null) {
            catalog = new Vector<Product>();
            catalog.add(new Product("전투복상의", res
                    .getDrawable(R.drawable.sub11),
                    "27000원", 29.99));
            catalog.add(new Product("전투복하의", res
                    .getDrawable(R.drawable.sub12),
                    "25000원", 24.99));
            catalog.add(new Product("전투모", res
                    .getDrawable(R.drawable.sub13),
                    "7000원", 14.99));
            catalog.add(new Product("요대", res
                    .getDrawable(R.drawable.sub14),
                    "2000원", 14.99));
            catalog.add(new Product("게리슨모", res
                    .getDrawable(R.drawable.sub21),
                    "9000원", 14.99));
            catalog.add(new Product("정모", res
                    .getDrawable(R.drawable.sub22),
                    "11000원", 14.99));
            catalog.add(new Product("조종복", res
                    .getDrawable(R.drawable.sub23),
                    "49000원", 14.99));
            catalog.add(new Product("정복", res
                    .getDrawable(R.drawable.sub24),
                    "530000원", 14.99));
            catalog.add(new Product("면도기", res
                    .getDrawable(R.drawable.sub31),
                    "1000원", 14.99));
            catalog.add(new Product("가루세제", res
                    .getDrawable(R.drawable.sub32),
                    "13000원", 14.99));
            catalog.add(new Product("세탁비누", res
                    .getDrawable(R.drawable.sub33),
                    "2500원", 14.99));
            catalog.add(new Product("섬유유연제", res
                    .getDrawable(R.drawable.sub34),
                    "14000원", 14.99));
            catalog.add(new Product("면양말", res
                    .getDrawable(R.drawable.sub41),
                    "3000원", 14.99));
            catalog.add(new Product("방한장갑", res
                    .getDrawable(R.drawable.sub42),
                    "9500원", 14.99));
            catalog.add(new Product("먼지마스크", res
                    .getDrawable(R.drawable.sub43),
                    "1500원", 14.99));
            catalog.add(new Product("면수건", res
                    .getDrawable(R.drawable.sub44),
                    "2500원", 14.99));
            catalog.add(new Product("신형전투화", res
                    .getDrawable(R.drawable.sub51),
                    "77000원", 14.99));
            catalog.add(new Product("구두", res
                    .getDrawable(R.drawable.sub52),
                    "29000원", 14.99));
            catalog.add(new Product("조종화", res
                    .getDrawable(R.drawable.sub53),
                    "79000원", 14.99));
            catalog.add(new Product("슬리퍼", res
                    .getDrawable(R.drawable.sub54),
                    "3000원", 14.99));

        }

        return catalog;
    }

    public static List<Product> getCart() {
        if(cart == null) {
            cart = new Vector<Product>();
        }
        return cart;
    }

}
