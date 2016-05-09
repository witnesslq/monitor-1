package com.monitor.service.account;

import com.monitor.exception.CodeException;
import com.monitor.model.Account;
import com.monitor.model.Pager;

public interface IAccountService {
	public Account getAccount(String userName, String passWord)
			throws CodeException;

	/**
	 * 增加用户
	 * 
	 * @param accountId
	 *            ：操作人id
	 * @param account
	 * @return
	 * @throws CodeException
	 */
	public boolean saveAccount(int accountId, Account account)
			throws CodeException;

	/**
	 * 获取用户列表
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @param accountId
	 * @return
	 * @throws CodeException
	 */
	public Pager queryUser(Integer pageNo, Integer pageSize, Integer accountId,
			String userName) throws CodeException;
}
