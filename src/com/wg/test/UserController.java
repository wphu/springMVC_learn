package com.wg.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.wg.bean.User;
import com.wg.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public ModelAndView regist(HttpServletRequest request, User user) {
		try {
			List<User> users = userService.getUsers(); 
			for(int i = 0; i < users.size(); i++)
			{
				if(users.get(i).getUsername().equals(user.getUsername()) )
				{
					request.setAttribute("error", "此用户名已存在");
					return new ModelAndView("regist");

				}
			}
			
			userService.saveUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("username", user.getUsername());
		request.setAttribute("password", user.getPassword());
		return new ModelAndView("registSucc");
	}

	/***
	 * �û���½
	 * <p>
	 * ע�����ã�ֻ����POST�ύ���÷���
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(String username, String password, HttpServletRequest request) throws Exception {
		// ��֤���ݹ����Ĳ����Ƿ���ȷ�����򷵻ص���½ҳ�档
		if (this.checkParams(new String[] { username, password })) {
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			User user_result = userService.login(user);
			if(user_result!=null) 
			{
				request.setAttribute("username", username);
				return new ModelAndView("userHome");
			}
			else
			{
				request.setAttribute("error", "用户名或密码错误");
				return new ModelAndView("login");
			}

		}
		return new ModelAndView("home");
	}

	/***
	 * ��֤�����Ƿ�Ϊ��
	 * 
	 * @param params
	 * @return
	 */
	private boolean checkParams(String[] params) {
		for (String param : params) {
			if (param == "" || param == null || param.isEmpty()) {
				return false;
			}
		}
		return true;
	}
}