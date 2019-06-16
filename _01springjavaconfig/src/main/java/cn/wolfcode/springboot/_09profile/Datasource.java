package cn.wolfcode.springboot._09profile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Datasource {

	private String username;
	private String password;
	private String url;
}
