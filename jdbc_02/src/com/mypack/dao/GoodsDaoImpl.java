package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mypack.entity.Goods;

public class GoodsDaoImpl extends BaseDao implements GoodsDaoIF {

	@Override
	public Goods queryGoodsById(int goodsId) {
		String sql="select *from goods where goodsId=?";
		
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Goods good=null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,goodsId);
			rs=pstmt.executeQuery();
			
			if(rs.next()){
				int id=rs.getInt(1);
				String goodsName=rs.getString(2);
				double price=rs.getDouble(3);
				String spec=rs.getString(4);
				String imgPath=rs.getString(5);//图片路径
				int type_id=rs.getInt(6);//商品类型编号
				int kucun=rs.getInt(7);//库存
				String chandi=rs.getString(8);//产地
				String bak=rs.getString(9);
				good=new Goods(id, goodsName, price, spec, imgPath, type_id, kucun, chandi, bak);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			close(rs, pstmt, conn);
		}
		return good;
	}

	@Override
	public List<Goods> queryAllGoods() {
        String sql="select *from goods where goodsId=?";
		
        List<Goods> goodslst=new ArrayList<Goods>();
		Connection conn=getConn();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				int id=rs.getInt(1);
				String goodsName=rs.getString(2);
				double price=rs.getDouble(3);
				String spec=rs.getString(4);
				String imgPath=rs.getString(5);//图片路径
				int type_id=rs.getInt(6);//商品类型编号
				int kucun=rs.getInt(7);//库存
				String chandi=rs.getString(8);//产地
				String bak=rs.getString(9);
				Goods good=new Goods(id, goodsName, price, spec, imgPath, type_id, kucun, chandi, bak);
				goodslst.add(good);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			close(rs, pstmt, conn);
		}
		return goodslst;
	}

}
