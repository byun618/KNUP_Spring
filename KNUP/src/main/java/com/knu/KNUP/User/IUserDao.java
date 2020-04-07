package com.knu.KNUP.User;

public interface IUserDao {

	public void insertUser(final int userId, final String userEmail, final String userName);
	public void deleteUser(int userId);
}
