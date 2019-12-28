package com.icode.interview.enums;

import lombok.Getter;

/**
 * 六国: 韩,赵,魏,楚,燕,齐
 *
 * @author Unicorn
 */
public enum CountryEnum {
    ONE(1, "韩"), TWO(2, "赵"), THREE(3, "魏"), FOUR(4, "楚"), FIVE(5, "燕"), SIX(6, "齐");

    @Getter
    private Integer id;
    @Getter
    private String msg;

    CountryEnum(Integer id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public static CountryEnum foreach_CountryEnum(int index) {
        CountryEnum[] arr = CountryEnum.values();
        for (CountryEnum ele : arr) {
            if (index == ele.getId()) {
                return ele;
            }
        }
        return null;
    }
}
