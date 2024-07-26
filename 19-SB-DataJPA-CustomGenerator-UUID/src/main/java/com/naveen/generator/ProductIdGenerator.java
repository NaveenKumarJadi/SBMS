package com.naveen.generator;

import java.util.UUID;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class ProductIdGenerator implements IdentifierGenerator {

	private static final long serialVersionUID = -8550039244461474558L;

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		
		return "NVIN_"+UUID.randomUUID().toString();
	}

}
