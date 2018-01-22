package com.tomyang.utils;

/**
 * 状态码枚举
 * @author yc
 * @date 2018/118
 * 1.枚举类可以实现一个或多个接口，使用enum定义的枚举默认继承了java.lang.Enum类，而不是默认继承Object类,因此枚举类不能显示继承其他父类。其中java.lang.Enum类实现了java。lang.Serializable和java.lang.Comparable两个接口
 * 2.使用enum定义,非抽象的枚举类默认会使用final修饰，因此枚举类不能派生子类
 * 3.枚举类的构造器只能使用private访问控制符，如果省略了构造器的访问的访问控制符，则默认使用private修饰;如果强制指定访问控制符，则只能指定private修饰符。
 * 4.枚举类的所有实例必须在枚举类的第一行显式列出，否则这个枚举类永远都不能那个产生实例。列出这些实例时，系统会自动添加public static final修饰，无须程序员显式添加。
 * 5.枚举类默认提供了一个values()方法,该方法可以很方便地遍历所以枚举值
 */
public enum ResultEnum {
    /**
     * 访问接口,返回的结果的枚举对应的Key, Value
     */
    UNKONW_ERROR(-1, "未知错误"),
    SAVA_ERROR(0, "保存失败"),
    ADDRESS_ISENPTY(100,"地址为空"),
    PRIMARY_SCHOOL(101, "你可能上小学"),
    MIDDLE_SCHOOL(102, "你可能上初中"),
    SUCCESS_RESULT(200, "成功");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
