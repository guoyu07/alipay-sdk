package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 判断云凤蝶请求的接口成功与否
 *
 * @author auto create
 * @since 1.0, 2018-02-02 11:00:31
 */
public class FengdieSuccessRespModel extends AlipayObject {

	private static final long serialVersionUID = 8815462349154499513L;

	/**
	 * 判断请求操作是否成功，值为 true 或者 false
	 */
	@ApiField("success")
	private Boolean success;

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
