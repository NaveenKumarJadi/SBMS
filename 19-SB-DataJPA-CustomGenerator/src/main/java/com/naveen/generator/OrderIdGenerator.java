package com.naveen.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.UUID;

import javax.sql.DataSource;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderIdGenerator implements IdentifierGenerator {

	@Autowired
	private DataSource dataSource;

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {

		String prefix = "NAVIN-";
		String id = null;

		try (Connection connection = dataSource.getConnection(); Statement statement = connection.createStatement()) {

//			ResultSet rs = statement.executeQuery("SELECT next_val FROM hibernate_sequence");
			ResultSet rs = statement.executeQuery("SELECT ORDER_ID FROM ORDR_DTLS");
			if (rs.next()) {
				int nextVal = rs.getInt(1);
				id = prefix + nextVal;
			}

//			statement.executeUpdate("UPDATE hibernate_sequence SET next_val = next_val + 1");
			statement.executeUpdate("UPDATE ORDR_DTLS SET ORDER_ID = ORDER_ID + 1");
		} catch (Exception e) {
			throw new HibernateException("Unable to generate Custom ID", e);
		}

		return id != null ? id : prefix + UUID.randomUUID().toString();
	}

}
