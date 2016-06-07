package com.monitor.service.devicerecord;

import java.util.Date;
import java.util.List;

import com.monitor.exception.CodeException;
import com.monitor.model.DeviceRecord;
import com.monitor.model.Pager;

public interface IDeviceRecordService {
	/**
	 * 查找设备最新的位置
	 * 
	 * @param accountID
	 * @param devceId
	 */
	public List<DeviceRecord> queryNewlyLocation(int accountId,
			List<Integer> deviceList) throws CodeException;

	public DeviceRecord queryNewlyLocation(int deviceId) throws CodeException;

	/**
	 * 查找设备状态为1的信息
	 * 
	 * @param deviceId
	 * @return
	 * @throws CodeException
	 */
	public List<DeviceRecord> queryAllLocation(int accountId, int deviceId,
			long startTime, long endTime) throws CodeException;

	public Pager queryDeviceHisLocation(int accountId, int deviceId,
			int pageNo, int pageSize) throws CodeException;
}
