package com.lotto.data.collection;

import java.util.List;

import org.bson.types.ObjectId;

import lombok.Data;

@Data
public class Lotto {
	private ObjectId _id;
	private String rotation;
	private List<String> lottoNums;
}
