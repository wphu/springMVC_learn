package com.wg.dao;

import java.util.List;
import com.wg.bean.User;

public interface UserDao {
	 /**
	  *  ȡ�������û�
	  *  @author WG
	  *  @return �û��б�
	  */
	 public List<User> getUser(); 
	 /**
	  *  �����û��˺���Ϣȡ���û�
	  *  @author WG
	  *  @return
	  */
	 public User getUser(User user);
	 
	 /**
	  *  ����û�
	  *  @author WG
	  *  @param user
	  *  @return
	  */
	 public User login(User user);
	 public void insertUser(User user);
	 /**
	  *  �����û���Ϣ
	  *  @author WG
	  *  @param user
	  *  @return
	  */
	 public int updateUser(User user);
	 /**
	  *  ɾ���û�
	  *  @author WG
	  *  @param id
	  *  @return
	  */
	 public int deleteUser(Long id);
}
