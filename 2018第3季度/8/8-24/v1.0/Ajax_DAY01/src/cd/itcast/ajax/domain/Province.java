package cd.itcast.ajax.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * 省份
 * @author Administrator
 */
/**
 * xml 描述一个对象
 * <datas>
	 * <data id="1">
	 * 		四川 	
	 * </data>
	 * <data id="2">
	 * 		云南
	 * </data>
 * </datas>
 */
public class Province {
	
	private Long id;
	private String name;

	public Province(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Province() {
		super();
	}

	public static List<Province> getAllProvince() {
		List<Province> provinces = new ArrayList<Province>();
		provinces.add(new Province(1L, "四川"));
		provinces.add(new Province(2L, "广东"));
		provinces.add(new Province(3L, "云南"));
		return provinces;
	}
}
