package com.mypack.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mypack.entity.Goods;
import com.mypack.entity.Item;
import com.mypack.entity.User;


public class CartDaoImpl extends BaseDao implements CartDaoIF {

	@Override
	public boolean addCart(Item item) {
		boolean flag=false;
		String sql="insert into cart(goodsId,nums,time,xiaoji,zongji)values(?,?,?,?,?)";
		
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, item.getGood().getGoodsId());
			pstmt.setInt(2, item.getNums());
			pstmt.setDate(3, new java.sql.Date(System.currentTimeMillis()));
			pstmt.setDouble(4, item.getXiaoji());
			pstmt.setDouble(5, item.getZongji());
			int row=pstmt.executeUpdate();
			if(row>0){
				System.out.println("添加了"+row+"行");
				flag=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			close(pstmt, conn);
		}
		return flag;
	}

	@Override
	public List<Item> queryAllCart(User user) {
		String sql="select c.itemId,c.goodsId,sum(nums),c.time,c.xiaoji,c.zongji,g.goodsName,g.price,g.spec,g.imgPath,g.type_id,g.kucun,g.chandi,g.bak from cart c,goods g where c.goodsId=g.goodsId group by c.goodsId";
		List<Item> itemlst=new ArrayList<Item>();
		
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, user.getUsername());
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int itemId=rs.getInt(1);
				int goodsId=rs.getInt(2);
				int nums=rs.getInt(3);
				Date time=rs.getDate(4);
				double xiaoji=rs.getDouble(5);
				double zongji=rs.getDouble(6);
				String goodsName=rs.getString(7);
				double price=rs.getDouble(8);
				String spec=rs.getString(9);
				String imgPath=rs.getString(10);//图片路径
				int type_id=rs.getInt(11);//商品类型编号
				int kucun=rs.getInt(12);//库存
				String chandi=rs.getString(13);//产地
				String bak=rs.getString(14);
				
				Goods good=new Goods(goodsId, goodsName, price, spec, imgPath, type_id, kucun, chandi, bak);
				
				Item item=new Item();
				itemlst.add(item);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			close(rs,pstmt, conn);
		}
		return itemlst;
	}

	@Override
	public boolean updateCart(Item item) {
		boolean flag=false;
		String sql="update cart set nums=? where itemId=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, item.getNums());
			pstmt.setInt(2, item.getItemId());
			int row=pstmt.executeUpdate();
			if(row>0){
				System.out.println("修改了"+row+"行");
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(pstmt, conn);
		}
		return flag;
	}

	@Override
	public boolean deleteCartById(int goodsId) {
		boolean flag=false;
		String sql="delete from cart where goodsId=?";
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, goodsId);
			int row=pstmt.executeUpdate();
			if(row>0){
				System.out.println("删除了"+row+"行");
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(pstmt, conn);
		}
		return flag;
	}

}
