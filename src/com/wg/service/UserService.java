package com.wg.service;

import java.util.List;

import com.wg.bean.User;

public interface UserService {
	/**
	 * ȡ�������û�
	 * 
	 * @author JLC
	 * @return �û��б�
	 */
	public List<User> getUsers() throws Exception;

	/**
	 * ȡ���û���Ϣ
	 * 
	 * @author JLC
	 * @return User����
	 * @throws Exception
	 */
	public User getUserInfo(User user) throws Exception;

	/**
	 * �����û�
	 * 
	 * @author JLC
	 * @param user
	 * @return
	 * @throws Exception
	 */
	
	public User login(User user) throws Exception;

	
	public void saveUser(User user) throws Exception;

	/**
	 * ɾ���û�
	 * 
	 * @author JLC
	 * @param id
	 * @return
	 */
	public int deleteUser(Long id) throws Exception;
}
