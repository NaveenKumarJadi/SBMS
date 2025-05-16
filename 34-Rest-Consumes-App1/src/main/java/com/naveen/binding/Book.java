package com.naveen.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@XmlRootElement
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	 private Integer id; 
	 private String name; 
	 private Double price;
}
