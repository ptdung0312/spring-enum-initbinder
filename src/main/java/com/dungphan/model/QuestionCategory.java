package com.dungphan.model;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Arrays;

public enum QuestionCategory {
	
	CSE("cse"),ECE("ece");
	
	private String value;

	private QuestionCategory(String value) {
		this.value = value;
	}

	@JsonCreator
	public static QuestionCategory fromValue(String value) {
		for (QuestionCategory category : values()) {
			if (category.value.equalsIgnoreCase(value)) {
				return category;
			}
		}
		throw new IllegalArgumentException(
				"Unknown enum type " + value + ", Allowed values are " + Arrays.toString(values()));
	}

}
