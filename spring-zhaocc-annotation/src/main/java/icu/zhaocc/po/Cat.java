package icu.zhaocc.po;

import org.springframework.stereotype.Component;

/**
 * @author zhaocc
 * @version 1.0
 * @date 2026-07-16
 */
@Component
public class Cat {
	private String name;
	private String category;
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
