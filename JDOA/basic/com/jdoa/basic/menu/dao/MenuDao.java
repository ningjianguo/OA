package com.jdoa.basic.menu.dao;

import java.util.List;

import com.jdoa.basic.menu.model.TMenu;

public interface MenuDao {
	  public int addMenu(TMenu menu);
	  public int deleteMenu(String fid);
	  public int updateMenu(TMenu menu);
	  public List<TMenu> queryMenu(TMenu menu);
	  public List<TMenu> queryMenu();
	  public List<TMenu> queryMenu(List list);
}
