package com.cotx.test;

import com.cotx.dao.StudentMapper;
import com.cotx.pojo.Enginner;
import com.cotx.pojo.Student;
import com.cotx.test.completablefuture.Shop;
import com.google.common.base.MoreObjects;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.print.attribute.standard.MediaSize;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.*;
import java.util.stream.Collectors;


public class TestClass {

    /**
     * 测试MoreObjects类和Objects类
     */
    @Test
    public void testDemo01() {

        Enginner jonjey = new com.cotx.pojo.Enginner("jonjey", "26", "cotx", 18);
        Enginner bob = new Enginner("bob", null, null, 17);

        String str = MoreObjects.toStringHelper(jonjey)
                .add("name", jonjey.getName() + " " + jonjey.getCompany())
                .add("eno", jonjey.getEno())
                .add("age", jonjey.getAge())
                .toString();
        System.out.println(str);

        String str2 = MoreObjects.toStringHelper(Enginner.class)
                .add("name1", bob.getName())
                .add("company", bob.getCompany())
                .add("age", bob.getAge())
                .add("eno", bob.getEno())
                .toString();
        System.out.println(str2);
    }

    /**
     * 测试Optional类的基本使用
     */
    @Test
    public void testDemo02() {
        Integer value1 = null;
        Integer value2 = new Integer(10);

        Optional<Integer> a = Optional.ofNullable(value1);
        //Optional<Integer> b = Optional.ofNullable(value2);

        System.out.println(a);
        //System.out.println(b);

        Optional<Integer> b = Optional.of(value2);
        b = Optional.of(new Integer(5));

        System.out.println("第一个参数值存在:" + a.isPresent());
        System.out.println("第二个参数值存在：" + b.isPresent());

        value1 = a.orElse(new Integer(0));

        System.out.println(value1 + b.get());
    }

    /**
     * 测试mybatis返回查询结果时，pojo类没有setter方法，
     * 依然可以对pojo对象做映射。
     * @throws IOException
     */
    //TODO
    //可能有默认的映射器
    @Test
    public void testDemo03() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectAll();
    }

    /**
     * 测试Future接口执行一个耗时的操作
     * @throws InterruptedException
     */
    @Test
    public void testDemo04() throws InterruptedException {
        long start = System.currentTimeMillis();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Double> future = executorService.submit(new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                Thread.sleep(1000);
                return Math.random();
            }
        });

        Thread.sleep(1000);

        try {
            //获取线程执行的结果
            Double result = future.get(1, TimeUnit.SECONDS);
            System.out.println(result);
        } catch (ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
        System.out.println("共耗时："+(System.currentTimeMillis()-start)+"ms");
    }

    /**
     * 测试CompletableFuture类
     */
    @Test
    public void testDemo05() throws InterruptedException {
        Shop shop = new Shop("BestShop");
        long start = System.nanoTime();
        Future<Double> shopPriceAsync = shop.getPriceAsync("best product");
        long invocationTime=(System.nanoTime()-start)/1_000_000;
        System.out.println("Invocation returned after" + invocationTime + "ms");

        Thread.sleep(1000);

        try {
            Double result = shopPriceAsync.get(1, TimeUnit.SECONDS);
            System.out.println("price is "+ result);
        } catch (ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }

        long endTime=(System.nanoTime()-start)/1_000_000;
        System.out.println("endTime ="+endTime);
    }

    /**
     * 实现异步
     * 第一种方式：顺序流查询
     * 对多个商店进行查询
     */
    @Test
    public void testDemo06(){

        long start = System.currentTimeMillis();

        List<String> iphone7 = findPrices1("iphone7");
        System.out.println(iphone7);
        System.out.println("Done in "+(System.currentTimeMillis()-start)+"ms");
    }

    public List<String> findPrices1(String prodName){
        List<Shop> shops=Arrays.asList(new Shop("shop1"),
                new Shop("shop2"),
                new Shop("shop3"),
                new Shop("shop4"));
        return shops.stream()
                .map(shop -> String.format("%s price is %.2f",shop.getShopName(),shop.getPrice(prodName)))
                .collect(Collectors.toList());
    }

    /**
     * 第二种方式
     * 并行流查询所有的商店
     */
    @Test
    public void testDemo07(){

        long start = System.currentTimeMillis();
        List<String> list = findPrices2("iphone7");
        System.out.println("DO in " + (System.currentTimeMillis()-start)+"ms");
    }

    private List<String> findPrices2(String shopName) {
        List<Shop> shops= Arrays.asList(new Shop("shop1"),
                new Shop("shop2"),
                new Shop("shop3"),
                new Shop("shop4"));
        /*return shops.stream()
                .map(shop -> String.format("%s price is %.2f",shop.getShopName(),shop.getPrice(shopName)))
                .collect(Collectors.toList());*/
        return shops.parallelStream()
                .map(shop -> String.format("%s price is %.2f",shop.getShopName(),shop.getPrice(shopName)))
                .collect(Collectors.toList());
    }

    /**
     * 第三种方式：
     * 使用CompletableFuture发起异步请求
     */
    @Test
    public void testDemo08(){
        long start = System.currentTimeMillis();
        List<String> list = findPrices3("iphone7");
        System.out.println("Done in " + (System.currentTimeMillis() - start) + "ms");
    }

    private List<String> findPrices3(String prodName) {
        List<Shop> shops = Arrays.asList(new Shop("shop1"),
                new Shop("shop2"),
                new Shop("shop3"),
                new Shop("shop4"));
        /* 顺序流查询 */
        /*return shops.stream()
                .map(shop -> String.format("%s price is %.2f",shop.getShopName(), shop.getPrice(prodName)))
                .collect(Collectors.toList()); */

        /* 并行流查找 */
        /*return shops.parallelStream()
                .map(shop -> String.format("%s price is %.2f",shop.getShopName(),shop.getPrice(prodName)))
                .collect(Collectors.toList());*/

        /* CompletableFuture方式异步请求 */
        List<CompletableFuture<String>> completableFutureList = shops.stream()
                .map(shop -> CompletableFuture.supplyAsync(() -> String.format("%s price is %.2f", shop.getShopName(), shop.getPrice(prodName))))
                .collect(Collectors.toList());
        return completableFutureList.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());
    }
}
