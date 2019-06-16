package com.mypack.crud;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;

import com.mypack._08casecade.OrderBill;
import com.mypack._08casecade.OrderBillItem;
import com.mypack.util.JPAUtil;




public class Test8 {
	  @Before
	    public void testSave(){
	        OrderBill bill = new OrderBill();
	        bill.setSn("sn");

	        OrderBillItem item1 = new OrderBillItem();
	        item1.setProduceName("productName1");
	        OrderBillItem item2 = new OrderBillItem();
	        item2.setProduceName("productName2");

	        List<OrderBillItem> items = new ArrayList<>();
	        items.add(item1);
	        items.add(item2);

	        bill.setItems(items);

	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();

	        //保存主对象
	        em.persist(bill);
//	        em.persist(item1);
//	        em.persist(item2);

	        em.getTransaction().commit();
	        em.close();
	    }

	    @Test
	    public void testDelete(){
	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();
	        OrderBill bill = em.find(OrderBill.class, 1L);
	        em.remove(bill);
	        em.getTransaction().commit();
	        em.close();
	    }

	    @Test
	    public void testUpdate(){
	        EntityManager em = JPAUtil.getEntityManager();
	        em.getTransaction().begin();
	        //先查询到需要编辑的订单信息
	        OrderBill bill = em.find(OrderBill.class, 1L);
	        List<OrderBillItem> items = bill.getItems();

	        //添加一个新的明细
	        OrderBillItem newItem = new OrderBillItem();
	        newItem.setProduceName("newProductName");
	        items.add(newItem);
	        //更新订单明细
	        //修改一个明细的信息
	        OrderBillItem item = items.get(0);
	        item.setProduceName("updateProduceName");
	        //删除一个明细信息
	        //默认情况,JPA只会删除对应的关系,不会将关联的明细信息删除
	        //在这里,我们将没有了关系数据的明细信息称之为孤儿,所以,此时是需要将这些数据删除的
	        items.remove(0);
	        //merge:可以执行更新和保存操作
	        //当对象存在OID的时候,执行更新,反之,执行保存
	        em.merge(bill);

	        em.getTransaction().commit();
	        em.close();
	    }
}
