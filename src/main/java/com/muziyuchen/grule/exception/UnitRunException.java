package com.muziyuchen.grule.exception;

/**
 * Created by LI_ZHEN on 2016/5/5.
 */
public class UnitRunException extends Exception {
    /** 
	 * serialVersionUID:序列化 
	 * @since JDK 1.7 
	 */ 
	private static final long serialVersionUID = 1557686224955790999L;

	public UnitRunException(String message) {
        super(message);
    }

    public UnitRunException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnitRunException(Throwable cause) {
        super(cause);
    }
}
