package com.cotx.test.completablefuture;

import com.google.common.util.concurrent.ListenableFuture;
import sun.applet.Main;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * 商店类
 */
public class Shop {
    private String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    public Shop() {
    }

    /**
     * 获取产品价格
     *
     * @param prodName 产品名
     * @return
     */
    public double getPrice(String prodName) {
        return caculatePrice(prodName);
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * 计算产品价格
     *
     * @param prodName
     * @return
     */
    private double caculatePrice(String prodName) {
        delay();
        return new Random().nextDouble() * prodName.charAt(0) + prodName.charAt(1);
    }

    /**
     * 模拟网络延迟
     */
    private static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Future<Double> getPriceAsync(String prodName){
        CompletableFuture<Double> future = new CompletableFuture<>();
        /*new Thread(()->{
            try {
                double price = caculatePrice(prodName);
                future.complete(price);
            } catch (Exception e) {
                //e.printStackTrace();
                future.completeExceptionally(e);
            }
        }).start();*/
        //return future;
        return CompletableFuture.supplyAsync(()->caculatePrice(prodName));
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<Double> future = new Shop().getPriceAsync("computer");
        System.out.println(future.get());
    }
}
